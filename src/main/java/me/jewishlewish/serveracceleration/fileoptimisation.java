package me.jewishlewish.serveracceleration;

import org.bukkit.Bukkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class fileoptimisation {
    static void spigotEdit(String ac) {
        if (ac.equals("fast")) {
            String[] fprop = {"bukkit", "spigot", "config/paper-world-defaults"};
            PrintWriter prw;
            for(String ftype : fprop){
                if (new File(ftype+".yml").exists()) {

                    try {
                        prw = new PrintWriter(ftype + ".yml");
                        Bukkit.getLogger().info(ftype);
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    prw.println(new returndata().files(ftype));
                    prw.close();
                }
            }
        }

    }
    public void configread(ServerAcceleration plugin) {

        String ac = plugin.getConfig().getString("acceleration");
        Bukkit.getLogger().info("Acceleration speed is: " + ac);

        if (!"none".equals(ac)) {
            spigotEdit(ac);
        }
    }
}
