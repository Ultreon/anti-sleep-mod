package com.ultreon.mods.antisleep.forge;

import com.ultreon.mods.antisleep.AntiSleep;
import net.minecraftforge.fml.common.Mod;

@Mod(AntiSleep.MOD_ID)
public class AntiSleepForge {
    public AntiSleepForge() {
        AntiSleep.init();
    }
}