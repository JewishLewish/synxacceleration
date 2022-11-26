package me.jewishlewish.serveracceleration;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import java.io.File;

public class fileoptimisation {
    static void spigotEdit(String ac) {
        if (ac.equals("fast")) {

        }

    }
    public void configread(ServerAcceleration plugin) {
        FileConfiguration config = plugin.getConfig();
        String ac = plugin.getConfig().getString("acceleration");
        Bukkit.getLogger().info("Acceleration speed is: " + ac);

        if (!"none".equals(ac)) {
            if (plugin.getConfig().getString("spigotedit").equals("true")) {
                if (new File("spigot.yml").exists()) {
                    spigotEdit(ac);
        }
            }
        }
    }
}
