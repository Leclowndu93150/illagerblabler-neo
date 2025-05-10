package com.leclowndu93150.illagerblabber.mixin;

import com.leclowndu93150.illagerblabber.IllagerSounds;
import com.leclowndu93150.illagerblabber.stuff.voice.IllagerType;
import com.leclowndu93150.illagerblabber.stuff.voice.IllagerVoiceRegistry;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.AbstractIllager;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.level.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Vindicator.class)
public abstract class VindicatorMixin extends AbstractIllager {

    @Unique
    private static final Logger LOGGER = LoggerFactory.getLogger("illagerblabber");

    // Constructor is required for extending IllagerEntity
    protected VindicatorMixin(EntityType<? extends AbstractIllager> entityType, Level world) {
        super(entityType, world);
    }

    @Inject(method = "getHurtSound", at = @At("HEAD"), cancellable = true)
    private void onHurt(DamageSource source, CallbackInfoReturnable<SoundEvent> cir) {
        Vindicator vindicator = (Vindicator)(Object)this;
        IllagerVoiceRegistry.setHurtState(vindicator);

        // Cancel vanilla sound
        cir.setReturnValue(null);
    }

    @Inject(method = "getCelebrateSound", at = @At("HEAD"), cancellable = true)
    private void onGetCelebratingSound(CallbackInfoReturnable<SoundEvent> cir) {
        //LOGGER.info("VINDICATOR RAID VICTORY DETECTED!");
        Vindicator vindicator = (Vindicator)(Object)this;
        IllagerVoiceRegistry.setVictoryState(vindicator);

        // Return our silent sound instead of null
        cir.setReturnValue(IllagerSounds.SILENCE.get());
    }

    // Cancel the vanilla ambient sound
    @Inject(method = "getAmbientSound", at = @At("HEAD"), cancellable = true)
    private void onGetAmbientSound(CallbackInfoReturnable<SoundEvent> cir) {
        // Return null to prevent vanilla sound
        cir.setReturnValue(null);
    }
}
