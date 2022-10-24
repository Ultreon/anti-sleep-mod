package com.ultreon.mods.antisleep;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class AntiSleep {
    public static final String MOD_ID = "antisleep";

    public static void init() {
        try {
            Files.copy(Objects.requireNonNull(AntiSleep.class.getResourceAsStream("/libanti_sleep.dll")), Path.of("libanti_sleep.dll"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        LibAntiSleep.INSTANCE.enable();
    }
}
