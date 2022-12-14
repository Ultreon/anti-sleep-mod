package com.ultreon.mods.antisleep;

import com.sun.jna.Library;
import com.sun.jna.Native;

@SuppressWarnings("unused")
public interface LibAntiSleep extends Library  {
    LibAntiSleep INSTANCE = Native.load("anti_sleep", LibAntiSleep.class);

    void enable();

    void disable();

    void update();
}
