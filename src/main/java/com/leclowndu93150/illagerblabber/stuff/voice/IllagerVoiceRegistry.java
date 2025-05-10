package com.leclowndu93150.illagerblabber.stuff.voice;

import net.minecraft.world.entity.monster.AbstractIllager;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Vindicator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Random;

/**
 * Central registry for illager voice managers and state tracking
 */
public class IllagerVoiceRegistry {
    private static final Logger LOGGER = LoggerFactory.getLogger("illagerblabber");

    // Group Spotted Spam Prevention
    private static final ConcurrentHashMap<IllagerType, Long> lastGroupSpottedSoundTime = new ConcurrentHashMap<>();

    // Maps to store state data
    private static final ConcurrentHashMap<UUID, IllagerVoiceManager> voiceManagers = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<UUID, Boolean> hadTargetLastTick = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<UUID, Integer> victoryTimers = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<UUID, Integer> combatDebounceTimers = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<UUID, Long> lastProcessedTick = new ConcurrentHashMap<>();
    private static long currentGameTick = 0;

    private static final Random safeRandom = new Random();

    // Special target tracking for Illagers (Victory state)
    private static final ConcurrentHashMap<UUID, UUID> lastPillagerTargets = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<UUID, UUID> lastVindicatorTargets = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<UUID, UUID> lastEvokerTargets = new ConcurrentHashMap<>();

    public static long getLastGroupSpottedTime(IllagerType type) {
        return lastGroupSpottedSoundTime.getOrDefault(type, 0L);
    }

    public static void setLastGroupSpottedTime(IllagerType type, long time) {
        lastGroupSpottedSoundTime.put(type, time);
    }

    /**
     * Gets or creates a voice manager for an illager
     */
    public static IllagerVoiceManager getVoiceManager(AbstractIllager illager, IllagerType type) {
        return voiceManagers.computeIfAbsent(illager.getUUID(), uuid -> {
            LOGGER.info("CREATING NEW VOICE MANAGER FOR {}!", type.name());
            return new IllagerVoiceManager(illager, type);
        });
    }

    /**
     * Gets the illager type for an entity
     */
    private static IllagerType getIllagerType(AbstractIllager illager) {
        if (illager instanceof Evoker) {
            return IllagerType.EVOKER;
        } else if (illager instanceof Vindicator) {
            return IllagerType.VINDICATOR;
        } else if (illager instanceof Pillager) {
            return IllagerType.PILLAGER;
        } else {
            return IllagerType.EVOKER; // Default fallback
        }
    }

    /**
     * Sets an illager entity to the hurt state
     */
    public static void setHurtState(AbstractIllager entity) {
        UUID id = entity.getUUID();
        IllagerVoiceManager voiceManager = voiceManagers.get(id);
        if (voiceManager == null) return;
        voiceManager.setState(IllagerState.Hurt.INSTANCE);
    }

    /**
     * Sets an illager entity to the victory state
     */
    public static void setVictoryState(AbstractIllager entity) {
        UUID id = entity.getUUID();
        IllagerVoiceManager voiceManager = voiceManagers.get(id);
        if (voiceManager == null) return;
        voiceManager.setState(IllagerState.Victory.INSTANCE);
        victoryTimers.put(id, 100); // 5 seconds
    }

    /**
     * Updates an illager's voice manager and state
     */
    public static void updateIllager(AbstractIllager illager, IllagerType illagerType) {
        UUID id = illager.getUUID();
        // Increment game tick counter
        currentGameTick++;

        // Skip if already processed this tick
        if (lastProcessedTick.getOrDefault(id, 0L) == currentGameTick) {
            LOGGER.info("Entity {} already processed this tick, skipping", id);
            return;
        }

        // Mark as processed for this tick
        lastProcessedTick.put(id, currentGameTick);

        // Process normally
        synchronized (id.toString().intern()) {
            IllagerVoiceManager voiceManager = getVoiceManager(illager, illagerType);
            voiceManager.update();
            updateIllagerState(illager);
        }
    }

    /**
     * Updates the state for any illager entity
     */
    private static void updateIllagerState(AbstractIllager illager) {
        UUID id = illager.getUUID();
        IllagerType illagerType = getIllagerType(illager);
        IllagerVoiceManager voiceManager = voiceManagers.get(id);
        if (voiceManager == null) return;

        // Get current state values
        boolean hadTarget = hadTargetLastTick.getOrDefault(id, false);
        int victoryTimer = victoryTimers.getOrDefault(id, 0);
        int combatDebounceTimer = combatDebounceTimers.getOrDefault(id, 0);

        // If we're celebrating a victory, keep in victory state for a while
        if (victoryTimer > 0) {
            victoryTimer--;
            victoryTimers.put(id, victoryTimer);
            return; // Stay in victory state
        }

        // Handle combat state stickiness
        if (combatDebounceTimer > 0) {
            combatDebounceTimer--;
            combatDebounceTimers.put(id, combatDebounceTimer);
        }

        boolean hasTarget = illager.getTarget() != null && illager.getTarget().isAlive();

        // Ensuring Illager do Victory State
        if (illagerType == IllagerType.VINDICATOR) {
            UUID vindicatorId = illager.getUUID();

            if (hasTarget) {
                // Store current target ID
                lastVindicatorTargets.put(vindicatorId, illager.getTarget().getUUID());
            } else if (hadTarget && lastVindicatorTargets.containsKey(vindicatorId)) {
                // Target is gone - force a short victory state
                LOGGER.info("FORCING VINDICATOR VICTORY!");
                voiceManager.setState(IllagerState.Victory.INSTANCE);
                victoryTimers.put(id, 60); // 3 seconds victory period
                hadTargetLastTick.put(id, false);
                lastVindicatorTargets.remove(vindicatorId);
                return; // Skip the rest of the processing
            }
        }

        if (illagerType == IllagerType.PILLAGER) {
            UUID pillagerId = illager.getUUID();

            if (hasTarget) {
                // Store current target ID
                lastPillagerTargets.putIfAbsent(pillagerId, illager.getTarget().getUUID());
            } else if (hadTarget && lastPillagerTargets.containsKey(pillagerId)) {
                // Target is gone - force a short victory state
                voiceManager.setState(IllagerState.Victory.INSTANCE);
                victoryTimers.put(id, 60); // 3 second victory period
                hadTargetLastTick.put(id, false);
                lastPillagerTargets.remove(pillagerId);
                return; // Skip the rest of the processing
            }
        }

        if (illagerType == IllagerType.EVOKER) {
            UUID evokerId = illager.getUUID();

            if (hasTarget) {
                // Store current target ID
                lastEvokerTargets.putIfAbsent(evokerId, illager.getTarget().getUUID());
            } else if (hadTarget && lastEvokerTargets.containsKey(evokerId)) {
                // Target is gone - force a short victory state
                voiceManager.setState(IllagerState.Victory.INSTANCE);
                victoryTimers.put(id, 60); // 3 second victory period
                hadTargetLastTick.put(id, false);
                lastEvokerTargets.remove(evokerId);
                return; // Skip the rest of the processing
            }
        }

        if (hasTarget) {
            // We have a valid target
            if (!hadTarget) {
                voiceManager.setState(IllagerState.Spotted.INSTANCE);
                hadTargetLastTick.put(id, true);
            } else {
                voiceManager.setState(IllagerState.Combat.INSTANCE);
            }

            // Reset combat debounce timer whenever we have a valid target
            combatDebounceTimer = 60 + safeRandom.nextInt(41); // 3-5 seconds
            combatDebounceTimers.put(id, combatDebounceTimer);
        } else {
            // We don't have a target right now
            if (hadTarget) {
                // Had a target last tick but don't now
                if (combatDebounceTimer <= 0) {
                    // Debounce expired, trigger victory
                    voiceManager.setState(IllagerState.Victory.INSTANCE);
                    victoryTimer = 100; // Stay in victory state for 5 seconds
                    victoryTimers.put(id, victoryTimer);
                    hadTargetLastTick.put(id, false);
                } else {
                    // Still in debounce period, stay in combat
                    voiceManager.setState(IllagerState.Combat.INSTANCE);
                }
            } else {
                // Never had a target, just passive
                voiceManager.setState(IllagerState.Passive.INSTANCE);
            }
        }

        // Update had target state
        hadTargetLastTick.put(id, hasTarget);
    }
}