package com.leclowndu93150.illagerblabber.mixin;

import com.leclowndu93150.illagerblabber.stuff.voice.IllagerType;
import com.leclowndu93150.illagerblabber.stuff.voice.IllagerVoiceRegistry;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.raid.Raider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Raider.class)
public class RaiderMixin {
    @Inject(method = "aiStep", at = @At("TAIL"))
    private void onTickMovement(CallbackInfo ci) {
        // Check if on server-side
        if (!((Raider) (Object) this).level().isClientSide) {
            if ((Object) this instanceof Pillager) {
                Pillager pillager = (Pillager) (Object) this;
                IllagerVoiceRegistry.updateIllager(pillager, IllagerType.PILLAGER);
            }
        }
    }

}
