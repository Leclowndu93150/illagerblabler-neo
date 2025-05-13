package com.leclowndu93150.illagerblabber;


import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Illagerblabber.MODID)
public class Illagerblabber {
    public static final String MODID = "illagerblabber";

    public Illagerblabber() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IllagerSounds.registerAll(modEventBus);
    }

}
