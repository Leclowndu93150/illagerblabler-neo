package com.leclowndu93150.illagerblabber.mixin;

import com.leclowndu93150.illagerblabber.IllagerSounds;
import com.leclowndu93150.illagerblabber.stuff.voice.IllagerType;
import com.leclowndu93150.illagerblabber.stuff.voice.IllagerVoiceRegistry;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.SpellcasterIllager;
import net.minecraft.world.level.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Evoker.class)
public abstract class EvokerMixin extends SpellcasterIllager {

    @Unique
    private static final Logger LOGGER = LoggerFactory.getLogger("illagerblabber");

    // Constructor required for extending SpellcastingIllagerEntity
    protected EvokerMixin(EntityType<? extends SpellcasterIllager> entityType, Level world) {
        super(entityType, world);
    }

    @Inject(method = "customServerAiStep", at = @At("TAIL"))
    private void onMobTick(CallbackInfo ci) {
        Evoker evoker = (Evoker)(Object)this;
        IllagerVoiceRegistry.updateIllager(evoker, IllagerType.EVOKER);
    }

    @Inject(method = "getCelebrateSound", at = @At("HEAD"), cancellable = true)
    private void onGetCelebratingSound(CallbackInfoReturnable<SoundEvent> cir) {
        //LOGGER.info("EVOKER RAID VICTORY DETECTED!");
        Evoker evoker = (Evoker)(Object)this;
        IllagerVoiceRegistry.setVictoryState(evoker);

        // Return silent sound instead of null
        cir.setReturnValue(IllagerSounds.SILENCE.get());
    }

    @Inject(method = "getHurtSound", at = @At("HEAD"), cancellable = true)
    private void onHurt(DamageSource source, CallbackInfoReturnable<SoundEvent> cir) {
        Evoker evoker = (Evoker)(Object)this;
        IllagerVoiceRegistry.setHurtState(evoker);


        cir.setReturnValue(null);
    }

    // Cancel the vanilla ambient sound
    @Inject(method = "getAmbientSound", at = @At("HEAD"), cancellable = true)
    private void onGetAmbientSound(CallbackInfoReturnable<SoundEvent> cir) {
        // Return null to prevent vanilla sound
        cir.setReturnValue(null);
    }
}
