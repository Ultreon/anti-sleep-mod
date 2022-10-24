package com.ultreon.mods.antisleep;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Objects;

@SuppressWarnings("unused")
public class AntiSleep {
    public static final String MOD_ID = "antisleep";
    private static Thread thread;

    @SuppressWarnings("BusyWait")
    public static void init() {
        try {
            Files.copy(Objects.requireNonNull(AntiSleep.class.getResourceAsStream("/anti_sleep.dll")), Path.of("anti_sleep.dll"), StandardCopyOption.REPLACE_EXISTING);
            Files.copy(Objects.requireNonNull(AntiSleep.class.getResourceAsStream("/libanti_sleep.so")), Path.of("libanti_sleep.so"), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        thread = new Thread(() -> {
            LibAntiSleep.INSTANCE.enable();
            try {
                while (true) {
                    LibAntiSleep.INSTANCE.update();
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                LibAntiSleep.INSTANCE.disable();
            }
        }, "SleepBlocker");
        thread.setDaemon(true);
    }

    public static Thread getThread() {
        return thread;
    }
}
