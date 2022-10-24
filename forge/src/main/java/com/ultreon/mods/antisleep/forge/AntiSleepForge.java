package com.ultreon.mods.antisleep.forge;

import dev.architectury.platform.forge.EventBuses;
import com.ultreon.mods.antisleep.AntiSleep;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AntiSleep.MOD_ID)
public class AntiSleepForge {
    public AntiSleepForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(AntiSleep.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        AntiSleep.init();
    }
}