package me.jewishlewish.serveracceleration;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class fileoptimisation {
    static void spigotEdit(String ac) {
        if (ac.equals("fast")) {

            PrintWriter prw= null;
            try {
                prw = new PrintWriter("spigot.yml");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            prw.println(new returndata().files("spigot"));
            prw.close();
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
