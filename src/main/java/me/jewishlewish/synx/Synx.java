package me.jewishlewish.synx;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.IOException;

public final class Synx extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        Bukkit.getLogger().info("Synx is operating");

        String ac = this.getConfig().getString("acceleration");
        Bukkit.getLogger().info("Acceleration speed is:" + ac);
        if (!"none".equals(ac)) {
            serveropt.spigotEdit(ac);
        }

        if (this.getConfig().getString("deletechestminecart").equals("true")) {
            serveropt.minechest();
        }

        if (this.getConfig().getString("fpstexturepack").equals("true")) {
            String tp = "https://www.dropbox.com/s/8wphrs2ht7pr13x/Bare%2BBones%2B1.19.zip?dl=1";
            try {
                serveropt.serverprop(tp);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}