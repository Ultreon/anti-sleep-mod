package com.ultreon.mods.antisleep.fabric;

import com.ultreon.mods.antisleep.AntiSleep;
import net.fabricmc.api.ModInitializer;

public class AntiSleepFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AntiSleep.init();
    }
}