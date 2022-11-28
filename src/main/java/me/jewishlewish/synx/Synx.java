package me.jewishlewish.synx;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.IOException;
import java.util.concurrent.Callable;

public final class Synx extends JavaPlugin {

    @Override
    public void onEnable() {
        Metrics metrics = new Metrics(this,16961);
        metrics.addCustomChart(new Metrics.SingleLineChart("players", new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                // (This is useless as there is already a player chart by default.)
                return Bukkit.getOnlinePlayers().size();
            }
        }));

        saveDefaultConfig();
        Bukkit.getLogger().info("Synx is operating");

        String ac = this.getConfig().getString("acceleration");
        Bukkit.getLogger().info("Acceleration speed is:" + ac);
        if (!"off".equals(ac)) {
            if ("on".equals(ac)) {
                serveropt.spigotEdit(ac);
            }
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
        getServer().getPluginManager().registerEvents(new Events(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}