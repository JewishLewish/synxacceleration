package me.jewishlewish.serveracceleration;

import org.bukkit.Bukkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class fileoptimisation {
    static void spigotEdit(String ac) {
        if (ac.equals("fast")) {
            String[] fprop = {"bukkit", "spigot", "config\\paper-world-defaults"};
            PrintWriter prw= null;
            for(String ftype : fprop){
                if (new File(ftype+".yml").exists()) {

                    try {
                        prw = new PrintWriter(ftype + ".yml");
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    Bukkit.getLogger().info("FOUNDED THE FILE:" + ftype);
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
            if (plugin.getConfig().getString("spigotedit").equals("true")) {
                spigotEdit(ac);
            } else {
                Bukkit.getLogger().info("ERROR WITH CONFIG! YOU DIDN'T PROPERLY SET ACCELERATION SPEED!");
            }
        }
    }
}