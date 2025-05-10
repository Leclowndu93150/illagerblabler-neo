package com.leclowndu93150.illagerblabber.mixin;

import com.leclowndu93150.illagerblabber.stuff.voice.IllagerType;
import com.leclowndu93150.illagerblabber.stuff.voice.IllagerVoiceRegistry;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.raid.Raider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Raider.class)
public class RaiderMixin {

    @Inject(method = "aiStep", at = @At("TAIL"))
    private void onTickMovement(CallbackInfo ci) {

        if (!((Raider) (Object) this).level().isClientSide) {
            if ((Object) this instanceof Pillager pillager) {
                IllagerVoiceRegistry.updateIllager(pillager, IllagerType.PILLAGER);
            }
            else if ((Object) this instanceof Evoker evoker) {
                IllagerVoiceRegistry.updateIllager(evoker, IllagerType.EVOKER);
            }
            else if ((Object) this instanceof Vindicator vindicator) {
                IllagerVoiceRegistry.updateIllager(vindicator, IllagerType.VINDICATOR);
            }
        }
    }

}
