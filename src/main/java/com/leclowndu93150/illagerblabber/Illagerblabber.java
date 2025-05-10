package com.leclowndu93150.illagerblabber;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(Illagerblabber.MODID)
public class Illagerblabber {
    public static final String MODID = "illagerblabber";

    public Illagerblabber(IEventBus modEventBus, ModContainer modContainer) {
        IllagerSounds.registerAll(modEventBus);
    }

}
