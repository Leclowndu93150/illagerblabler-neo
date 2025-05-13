package com.leclowndu93150.illagerblabber;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class IllagerSounds {
    public static final String MOD_ID = "illagerblabber";
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Registries.SOUND_EVENT, MOD_ID);

    public static final Supplier<SoundEvent> SILENCE = registerSound("evoker.silence.01");

    // Ambient noise sounds (1-14)
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_NOISE_01 = registerSound("evoker.ambient_noise.01");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_NOISE_02 = registerSound("evoker.ambient_noise.02");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_NOISE_03 = registerSound("evoker.ambient_noise.03");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_NOISE_04 = registerSound("evoker.ambient_noise.04");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_NOISE_05 = registerSound("evoker.ambient_noise.05");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_NOISE_06 = registerSound("evoker.ambient_noise.06");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_NOISE_07 = registerSound("evoker.ambient_noise.07");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_NOISE_08 = registerSound("evoker.ambient_noise.08");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_NOISE_09 = registerSound("evoker.ambient_noise.09");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_NOISE_10 = registerSound("evoker.ambient_noise.10");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_NOISE_11 = registerSound("evoker.ambient_noise.11");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_NOISE_12 = registerSound("evoker.ambient_noise.12");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_NOISE_13 = registerSound("evoker.ambient_noise.13");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_NOISE_14 = registerSound("evoker.ambient_noise.14");

    // Ambient talk sounds (1-33)
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_01 = registerSound("evoker.ambient_talk.01");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_02 = registerSound("evoker.ambient_talk.02");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_03 = registerSound("evoker.ambient_talk.03");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_04 = registerSound("evoker.ambient_talk.04");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_05 = registerSound("evoker.ambient_talk.05");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_06 = registerSound("evoker.ambient_talk.06");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_07 = registerSound("evoker.ambient_talk.07");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_08 = registerSound("evoker.ambient_talk.08");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_09 = registerSound("evoker.ambient_talk.09");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_10 = registerSound("evoker.ambient_talk.10");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_11 = registerSound("evoker.ambient_talk.11");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_12 = registerSound("evoker.ambient_talk.12");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_13 = registerSound("evoker.ambient_talk.13");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_14 = registerSound("evoker.ambient_talk.14");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_15 = registerSound("evoker.ambient_talk.15");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_16 = registerSound("evoker.ambient_talk.16");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_17 = registerSound("evoker.ambient_talk.17");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_18 = registerSound("evoker.ambient_talk.18");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_19 = registerSound("evoker.ambient_talk.19");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_20 = registerSound("evoker.ambient_talk.20");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_21 = registerSound("evoker.ambient_talk.21");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_22 = registerSound("evoker.ambient_talk.22");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_23 = registerSound("evoker.ambient_talk.23");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_24 = registerSound("evoker.ambient_talk.24");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_25 = registerSound("evoker.ambient_talk.25");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_26 = registerSound("evoker.ambient_talk.26");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_27 = registerSound("evoker.ambient_talk.27");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_28 = registerSound("evoker.ambient_talk.28");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_29 = registerSound("evoker.ambient_talk.29");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_30 = registerSound("evoker.ambient_talk.30");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_31 = registerSound("evoker.ambient_talk.31");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_32 = registerSound("evoker.ambient_talk.32");
    public static final Supplier<SoundEvent> EVOKER_AMBIENT_TALK_33 = registerSound("evoker.ambient_talk.33");

    // Battle sounds (1-14)
    public static final Supplier<SoundEvent> EVOKER_BATTLE_01 = registerSound("evoker.battle.01");
    public static final Supplier<SoundEvent> EVOKER_BATTLE_02 = registerSound("evoker.battle.02");
    public static final Supplier<SoundEvent> EVOKER_BATTLE_03 = registerSound("evoker.battle.03");
    public static final Supplier<SoundEvent> EVOKER_BATTLE_04 = registerSound("evoker.battle.04");
    public static final Supplier<SoundEvent> EVOKER_BATTLE_05 = registerSound("evoker.battle.05");
    public static final Supplier<SoundEvent> EVOKER_BATTLE_06 = registerSound("evoker.battle.06");
    public static final Supplier<SoundEvent> EVOKER_BATTLE_07 = registerSound("evoker.battle.07");
    public static final Supplier<SoundEvent> EVOKER_BATTLE_08 = registerSound("evoker.battle.08");
    public static final Supplier<SoundEvent> EVOKER_BATTLE_09 = registerSound("evoker.battle.09");
    public static final Supplier<SoundEvent> EVOKER_BATTLE_10 = registerSound("evoker.battle.10");
    public static final Supplier<SoundEvent> EVOKER_BATTLE_11 = registerSound("evoker.battle.11");
    public static final Supplier<SoundEvent> EVOKER_BATTLE_12 = registerSound("evoker.battle.12");
    public static final Supplier<SoundEvent> EVOKER_BATTLE_13 = registerSound("evoker.battle.13");
    public static final Supplier<SoundEvent> EVOKER_BATTLE_14 = registerSound("evoker.battle.14");

    // Hurt sounds (1-19)
    public static final Supplier<SoundEvent> EVOKER_HURT_01 = registerSound("evoker.hurt.01");
    public static final Supplier<SoundEvent> EVOKER_HURT_02 = registerSound("evoker.hurt.02");
    public static final Supplier<SoundEvent> EVOKER_HURT_03 = registerSound("evoker.hurt.03");
    public static final Supplier<SoundEvent> EVOKER_HURT_04 = registerSound("evoker.hurt.04");
    public static final Supplier<SoundEvent> EVOKER_HURT_05 = registerSound("evoker.hurt.05");
    public static final Supplier<SoundEvent> EVOKER_HURT_06 = registerSound("evoker.hurt.06");
    public static final Supplier<SoundEvent> EVOKER_HURT_07 = registerSound("evoker.hurt.07");
    public static final Supplier<SoundEvent> EVOKER_HURT_08 = registerSound("evoker.hurt.08");
    public static final Supplier<SoundEvent> EVOKER_HURT_09 = registerSound("evoker.hurt.09");
    public static final Supplier<SoundEvent> EVOKER_HURT_10 = registerSound("evoker.hurt.10");
    public static final Supplier<SoundEvent> EVOKER_HURT_11 = registerSound("evoker.hurt.11");
    public static final Supplier<SoundEvent> EVOKER_HURT_12 = registerSound("evoker.hurt.12");
    public static final Supplier<SoundEvent> EVOKER_HURT_13 = registerSound("evoker.hurt.13");
    public static final Supplier<SoundEvent> EVOKER_HURT_14 = registerSound("evoker.hurt.14");
    public static final Supplier<SoundEvent> EVOKER_HURT_15 = registerSound("evoker.hurt.15");
    public static final Supplier<SoundEvent> EVOKER_HURT_16 = registerSound("evoker.hurt.16");
    public static final Supplier<SoundEvent> EVOKER_HURT_17 = registerSound("evoker.hurt.17");
    public static final Supplier<SoundEvent> EVOKER_HURT_18 = registerSound("evoker.hurt.18");
    public static final Supplier<SoundEvent> EVOKER_HURT_19 = registerSound("evoker.hurt.19");

    // Spotted sounds (1-6)
    public static final Supplier<SoundEvent> EVOKER_SPOTTED_01 = registerSound("evoker.spotted.01");
    public static final Supplier<SoundEvent> EVOKER_SPOTTED_02 = registerSound("evoker.spotted.02");
    public static final Supplier<SoundEvent> EVOKER_SPOTTED_03 = registerSound("evoker.spotted.03");
    public static final Supplier<SoundEvent> EVOKER_SPOTTED_04 = registerSound("evoker.spotted.04");
    public static final Supplier<SoundEvent> EVOKER_SPOTTED_05 = registerSound("evoker.spotted.05");
    public static final Supplier<SoundEvent> EVOKER_SPOTTED_06 = registerSound("evoker.spotted.06");

    // Victory sounds (1-14)
    public static final Supplier<SoundEvent> EVOKER_VICTORY_01 = registerSound("evoker.victory.01");
    public static final Supplier<SoundEvent> EVOKER_VICTORY_02 = registerSound("evoker.victory.02");
    public static final Supplier<SoundEvent> EVOKER_VICTORY_03 = registerSound("evoker.victory.03");
    public static final Supplier<SoundEvent> EVOKER_VICTORY_04 = registerSound("evoker.victory.04");
    public static final Supplier<SoundEvent> EVOKER_VICTORY_05 = registerSound("evoker.victory.05");
    public static final Supplier<SoundEvent> EVOKER_VICTORY_06 = registerSound("evoker.victory.06");
    public static final Supplier<SoundEvent> EVOKER_VICTORY_07 = registerSound("evoker.victory.07");
    public static final Supplier<SoundEvent> EVOKER_VICTORY_08 = registerSound("evoker.victory.08");
    public static final Supplier<SoundEvent> EVOKER_VICTORY_09 = registerSound("evoker.victory.09");
    public static final Supplier<SoundEvent> EVOKER_VICTORY_10 = registerSound("evoker.victory.10");
    public static final Supplier<SoundEvent> EVOKER_VICTORY_11 = registerSound("evoker.victory.11");
    public static final Supplier<SoundEvent> EVOKER_VICTORY_12 = registerSound("evoker.victory.12");
    public static final Supplier<SoundEvent> EVOKER_VICTORY_13 = registerSound("evoker.victory.13");
    public static final Supplier<SoundEvent> EVOKER_VICTORY_14 = registerSound("evoker.victory.14");

    // === VINDICATOR SOUNDS ===

    // Ambient Noise sounds (31 total)
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_01 = registerSound("vindicator.ambient_noise.01");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_02 = registerSound("vindicator.ambient_noise.02");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_03 = registerSound("vindicator.ambient_noise.03");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_04 = registerSound("vindicator.ambient_noise.04");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_05 = registerSound("vindicator.ambient_noise.05");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_06 = registerSound("vindicator.ambient_noise.06");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_07 = registerSound("vindicator.ambient_noise.07");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_08 = registerSound("vindicator.ambient_noise.08");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_09 = registerSound("vindicator.ambient_noise.09");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_10 = registerSound("vindicator.ambient_noise.10");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_11 = registerSound("vindicator.ambient_noise.11");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_12 = registerSound("vindicator.ambient_noise.12");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_13 = registerSound("vindicator.ambient_noise.13");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_14 = registerSound("vindicator.ambient_noise.14");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_15 = registerSound("vindicator.ambient_noise.15");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_16 = registerSound("vindicator.ambient_noise.16");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_17 = registerSound("vindicator.ambient_noise.17");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_18 = registerSound("vindicator.ambient_noise.18");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_19 = registerSound("vindicator.ambient_noise.19");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_20 = registerSound("vindicator.ambient_noise.20");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_21 = registerSound("vindicator.ambient_noise.21");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_22 = registerSound("vindicator.ambient_noise.22");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_23 = registerSound("vindicator.ambient_noise.23");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_24 = registerSound("vindicator.ambient_noise.24");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_25 = registerSound("vindicator.ambient_noise.25");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_26 = registerSound("vindicator.ambient_noise.26");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_27 = registerSound("vindicator.ambient_noise.27");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_28 = registerSound("vindicator.ambient_noise.28");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_29 = registerSound("vindicator.ambient_noise.29");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_30 = registerSound("vindicator.ambient_noise.30");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_NOISE_31 = registerSound("vindicator.ambient_noise.31");

    // Ambient Talk sounds (24 total)
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_01 = registerSound("vindicator.ambient_talk.01");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_02 = registerSound("vindicator.ambient_talk.02");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_03 = registerSound("vindicator.ambient_talk.03");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_04 = registerSound("vindicator.ambient_talk.04");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_05 = registerSound("vindicator.ambient_talk.05");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_06 = registerSound("vindicator.ambient_talk.06");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_07 = registerSound("vindicator.ambient_talk.07");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_08 = registerSound("vindicator.ambient_talk.08");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_09 = registerSound("vindicator.ambient_talk.09");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_10 = registerSound("vindicator.ambient_talk.10");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_11 = registerSound("vindicator.ambient_talk.11");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_12 = registerSound("vindicator.ambient_talk.12");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_13 = registerSound("vindicator.ambient_talk.13");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_14 = registerSound("vindicator.ambient_talk.14");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_15 = registerSound("vindicator.ambient_talk.15");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_16 = registerSound("vindicator.ambient_talk.16");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_17 = registerSound("vindicator.ambient_talk.17");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_18 = registerSound("vindicator.ambient_talk.18");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_19 = registerSound("vindicator.ambient_talk.19");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_20 = registerSound("vindicator.ambient_talk.20");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_21 = registerSound("vindicator.ambient_talk.21");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_22 = registerSound("vindicator.ambient_talk.22");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_23 = registerSound("vindicator.ambient_talk.23");
    public static final Supplier<SoundEvent> VINDICATOR_AMBIENT_TALK_24 = registerSound("vindicator.ambient_talk.24");

    // Spotted sounds (11 total)
    public static final Supplier<SoundEvent> VINDICATOR_SPOTTED_01 = registerSound("vindicator.spotted.01");
    public static final Supplier<SoundEvent> VINDICATOR_SPOTTED_02 = registerSound("vindicator.spotted.02");
    public static final Supplier<SoundEvent> VINDICATOR_SPOTTED_03 = registerSound("vindicator.spotted.03");
    public static final Supplier<SoundEvent> VINDICATOR_SPOTTED_04 = registerSound("vindicator.spotted.04");
    public static final Supplier<SoundEvent> VINDICATOR_SPOTTED_05 = registerSound("vindicator.spotted.05");
    public static final Supplier<SoundEvent> VINDICATOR_SPOTTED_06 = registerSound("vindicator.spotted.06");
    public static final Supplier<SoundEvent> VINDICATOR_SPOTTED_07 = registerSound("vindicator.spotted.07");
    public static final Supplier<SoundEvent> VINDICATOR_SPOTTED_08 = registerSound("vindicator.spotted.08");
    public static final Supplier<SoundEvent> VINDICATOR_SPOTTED_09 = registerSound("vindicator.spotted.09");
    public static final Supplier<SoundEvent> VINDICATOR_SPOTTED_10 = registerSound("vindicator.spotted.10");
    public static final Supplier<SoundEvent> VINDICATOR_SPOTTED_11 = registerSound("vindicator.spotted.11");

    // Battle sounds (13 total)
    public static final Supplier<SoundEvent> VINDICATOR_BATTLE_01 = registerSound("vindicator.battle.01");
    public static final Supplier<SoundEvent> VINDICATOR_BATTLE_02 = registerSound("vindicator.battle.02");
    public static final Supplier<SoundEvent> VINDICATOR_BATTLE_03 = registerSound("vindicator.battle.03");
    public static final Supplier<SoundEvent> VINDICATOR_BATTLE_04 = registerSound("vindicator.battle.04");
    public static final Supplier<SoundEvent> VINDICATOR_BATTLE_05 = registerSound("vindicator.battle.05");
    public static final Supplier<SoundEvent> VINDICATOR_BATTLE_06 = registerSound("vindicator.battle.06");
    public static final Supplier<SoundEvent> VINDICATOR_BATTLE_07 = registerSound("vindicator.battle.07");
    public static final Supplier<SoundEvent> VINDICATOR_BATTLE_08 = registerSound("vindicator.battle.08");
    public static final Supplier<SoundEvent> VINDICATOR_BATTLE_09 = registerSound("vindicator.battle.09");
    public static final Supplier<SoundEvent> VINDICATOR_BATTLE_10 = registerSound("vindicator.battle.10");
    public static final Supplier<SoundEvent> VINDICATOR_BATTLE_11 = registerSound("vindicator.battle.11");
    public static final Supplier<SoundEvent> VINDICATOR_BATTLE_12 = registerSound("vindicator.battle.12");
    public static final Supplier<SoundEvent> VINDICATOR_BATTLE_13 = registerSound("vindicator.battle.13");

    // Hurt sounds (26 total)
    public static final Supplier<SoundEvent> VINDICATOR_HURT_01 = registerSound("vindicator.hurt.01");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_02 = registerSound("vindicator.hurt.02");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_03 = registerSound("vindicator.hurt.03");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_04 = registerSound("vindicator.hurt.04");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_05 = registerSound("vindicator.hurt.05");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_06 = registerSound("vindicator.hurt.06");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_07 = registerSound("vindicator.hurt.07");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_08 = registerSound("vindicator.hurt.08");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_09 = registerSound("vindicator.hurt.09");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_10 = registerSound("vindicator.hurt.10");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_11 = registerSound("vindicator.hurt.11");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_12 = registerSound("vindicator.hurt.12");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_13 = registerSound("vindicator.hurt.13");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_14 = registerSound("vindicator.hurt.14");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_15 = registerSound("vindicator.hurt.15");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_16 = registerSound("vindicator.hurt.16");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_17 = registerSound("vindicator.hurt.17");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_18 = registerSound("vindicator.hurt.18");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_19 = registerSound("vindicator.hurt.19");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_20 = registerSound("vindicator.hurt.20");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_21 = registerSound("vindicator.hurt.21");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_22 = registerSound("vindicator.hurt.22");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_23 = registerSound("vindicator.hurt.23");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_24 = registerSound("vindicator.hurt.24");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_25 = registerSound("vindicator.hurt.25");
    public static final Supplier<SoundEvent> VINDICATOR_HURT_26 = registerSound("vindicator.hurt.26");

    // Victory sounds (13 total)
    public static final Supplier<SoundEvent> VINDICATOR_VICTORY_01 = registerSound("vindicator.victory.01");
    public static final Supplier<SoundEvent> VINDICATOR_VICTORY_02 = registerSound("vindicator.victory.02");
    public static final Supplier<SoundEvent> VINDICATOR_VICTORY_03 = registerSound("vindicator.victory.03");
    public static final Supplier<SoundEvent> VINDICATOR_VICTORY_04 = registerSound("vindicator.victory.04");
    public static final Supplier<SoundEvent> VINDICATOR_VICTORY_05 = registerSound("vindicator.victory.05");
    public static final Supplier<SoundEvent> VINDICATOR_VICTORY_06 = registerSound("vindicator.victory.06");
    public static final Supplier<SoundEvent> VINDICATOR_VICTORY_07 = registerSound("vindicator.victory.07");
    public static final Supplier<SoundEvent> VINDICATOR_VICTORY_08 = registerSound("vindicator.victory.08");
    public static final Supplier<SoundEvent> VINDICATOR_VICTORY_09 = registerSound("vindicator.victory.09");
    public static final Supplier<SoundEvent> VINDICATOR_VICTORY_10 = registerSound("vindicator.victory.10");
    public static final Supplier<SoundEvent> VINDICATOR_VICTORY_11 = registerSound("vindicator.victory.11");
    public static final Supplier<SoundEvent> VINDICATOR_VICTORY_12 = registerSound("vindicator.victory.12");
    public static final Supplier<SoundEvent> VINDICATOR_VICTORY_13 = registerSound("vindicator.victory.13");

    // === PILLAGER SOUNDS ===

    // Ambient Noise sounds (14 total)
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_NOISE_01 = registerSound("pillager.ambient_noise.01");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_NOISE_02 = registerSound("pillager.ambient_noise.02");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_NOISE_03 = registerSound("pillager.ambient_noise.03");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_NOISE_04 = registerSound("pillager.ambient_noise.04");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_NOISE_05 = registerSound("pillager.ambient_noise.05");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_NOISE_06 = registerSound("pillager.ambient_noise.06");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_NOISE_07 = registerSound("pillager.ambient_noise.07");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_NOISE_08 = registerSound("pillager.ambient_noise.08");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_NOISE_09 = registerSound("pillager.ambient_noise.09");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_NOISE_10 = registerSound("pillager.ambient_noise.10");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_NOISE_11 = registerSound("pillager.ambient_noise.11");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_NOISE_12 = registerSound("pillager.ambient_noise.12");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_NOISE_13 = registerSound("pillager.ambient_noise.13");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_NOISE_14 = registerSound("pillager.ambient_noise.14");

    // Ambient Talk sounds (23 total)
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_01 = registerSound("pillager.ambient_talk.01");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_02 = registerSound("pillager.ambient_talk.02");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_03 = registerSound("pillager.ambient_talk.03");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_04 = registerSound("pillager.ambient_talk.04");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_05 = registerSound("pillager.ambient_talk.05");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_06 = registerSound("pillager.ambient_talk.06");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_07 = registerSound("pillager.ambient_talk.07");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_08 = registerSound("pillager.ambient_talk.08");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_09 = registerSound("pillager.ambient_talk.09");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_10 = registerSound("pillager.ambient_talk.10");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_11 = registerSound("pillager.ambient_talk.11");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_12 = registerSound("pillager.ambient_talk.12");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_13 = registerSound("pillager.ambient_talk.13");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_14 = registerSound("pillager.ambient_talk.14");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_15 = registerSound("pillager.ambient_talk.15");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_16 = registerSound("pillager.ambient_talk.16");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_17 = registerSound("pillager.ambient_talk.17");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_18 = registerSound("pillager.ambient_talk.18");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_19 = registerSound("pillager.ambient_talk.19");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_20 = registerSound("pillager.ambient_talk.20");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_21 = registerSound("pillager.ambient_talk.21");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_22 = registerSound("pillager.ambient_talk.22");
    public static final Supplier<SoundEvent> PILLAGER_AMBIENT_TALK_23 = registerSound("pillager.ambient_talk.23");

    // Spotted sounds (6 total)
    public static final Supplier<SoundEvent> PILLAGER_SPOTTED_01 = registerSound("pillager.spotted.01");
    public static final Supplier<SoundEvent> PILLAGER_SPOTTED_02 = registerSound("pillager.spotted.02");
    public static final Supplier<SoundEvent> PILLAGER_SPOTTED_03 = registerSound("pillager.spotted.03");
    public static final Supplier<SoundEvent> PILLAGER_SPOTTED_04 = registerSound("pillager.spotted.04");
    public static final Supplier<SoundEvent> PILLAGER_SPOTTED_05 = registerSound("pillager.spotted.05");
    public static final Supplier<SoundEvent> PILLAGER_SPOTTED_06 = registerSound("pillager.spotted.06");

    // Battle sounds (7 total)
    public static final Supplier<SoundEvent> PILLAGER_BATTLE_01 = registerSound("pillager.battle.01");
    public static final Supplier<SoundEvent> PILLAGER_BATTLE_02 = registerSound("pillager.battle.02");
    public static final Supplier<SoundEvent> PILLAGER_BATTLE_03 = registerSound("pillager.battle.03");
    public static final Supplier<SoundEvent> PILLAGER_BATTLE_04 = registerSound("pillager.battle.04");
    public static final Supplier<SoundEvent> PILLAGER_BATTLE_05 = registerSound("pillager.battle.05");
    public static final Supplier<SoundEvent> PILLAGER_BATTLE_06 = registerSound("pillager.battle.06");
    public static final Supplier<SoundEvent> PILLAGER_BATTLE_07 = registerSound("pillager.battle.07");

    // Hurt sounds (23 total)
    public static final Supplier<SoundEvent> PILLAGER_HURT_01 = registerSound("pillager.hurt.01");
    public static final Supplier<SoundEvent> PILLAGER_HURT_02 = registerSound("pillager.hurt.02");
    public static final Supplier<SoundEvent> PILLAGER_HURT_03 = registerSound("pillager.hurt.03");
    public static final Supplier<SoundEvent> PILLAGER_HURT_04 = registerSound("pillager.hurt.04");
    public static final Supplier<SoundEvent> PILLAGER_HURT_05 = registerSound("pillager.hurt.05");
    public static final Supplier<SoundEvent> PILLAGER_HURT_06 = registerSound("pillager.hurt.06");
    public static final Supplier<SoundEvent> PILLAGER_HURT_07 = registerSound("pillager.hurt.07");
    public static final Supplier<SoundEvent> PILLAGER_HURT_08 = registerSound("pillager.hurt.08");
    public static final Supplier<SoundEvent> PILLAGER_HURT_09 = registerSound("pillager.hurt.09");
    public static final Supplier<SoundEvent> PILLAGER_HURT_10 = registerSound("pillager.hurt.10");
    public static final Supplier<SoundEvent> PILLAGER_HURT_11 = registerSound("pillager.hurt.11");
    public static final Supplier<SoundEvent> PILLAGER_HURT_12 = registerSound("pillager.hurt.12");
    public static final Supplier<SoundEvent> PILLAGER_HURT_13 = registerSound("pillager.hurt.13");
    public static final Supplier<SoundEvent> PILLAGER_HURT_14 = registerSound("pillager.hurt.14");
    public static final Supplier<SoundEvent> PILLAGER_HURT_15 = registerSound("pillager.hurt.15");
    public static final Supplier<SoundEvent> PILLAGER_HURT_16 = registerSound("pillager.hurt.16");
    public static final Supplier<SoundEvent> PILLAGER_HURT_17 = registerSound("pillager.hurt.17");
    public static final Supplier<SoundEvent> PILLAGER_HURT_18 = registerSound("pillager.hurt.18");
    public static final Supplier<SoundEvent> PILLAGER_HURT_19 = registerSound("pillager.hurt.19");
    public static final Supplier<SoundEvent> PILLAGER_HURT_20 = registerSound("pillager.hurt.20");
    public static final Supplier<SoundEvent> PILLAGER_HURT_21 = registerSound("pillager.hurt.21");
    public static final Supplier<SoundEvent> PILLAGER_HURT_22 = registerSound("pillager.hurt.22");
    public static final Supplier<SoundEvent> PILLAGER_HURT_23 = registerSound("pillager.hurt.23");

    // Victory sounds (19 total)
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_01 = registerSound("pillager.victory.01");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_02 = registerSound("pillager.victory.02");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_03 = registerSound("pillager.victory.03");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_04 = registerSound("pillager.victory.04");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_05 = registerSound("pillager.victory.05");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_06 = registerSound("pillager.victory.06");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_07 = registerSound("pillager.victory.07");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_08 = registerSound("pillager.victory.08");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_09 = registerSound("pillager.victory.09");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_10 = registerSound("pillager.victory.10");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_11 = registerSound("pillager.victory.11");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_12 = registerSound("pillager.victory.12");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_13 = registerSound("pillager.victory.13");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_14 = registerSound("pillager.victory.14");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_15 = registerSound("pillager.victory.15");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_16 = registerSound("pillager.victory.16");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_17 = registerSound("pillager.victory.17");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_18 = registerSound("pillager.victory.18");
    public static final Supplier<SoundEvent> PILLAGER_VICTORY_19 = registerSound("pillager.victory.19");

    private static Supplier<SoundEvent> registerSound(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MOD_ID, name)));
    }

    public static void registerAll(IEventBus modEventBus) {
        SOUND_EVENTS.register(modEventBus);
    }
}