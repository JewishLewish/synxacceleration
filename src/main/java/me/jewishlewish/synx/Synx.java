package me.jewishlewish.synx;

import me.jewishlewish.synx.events.ASLimit;
import me.jewishlewish.synx.events.Events;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class Synx extends JavaPlugin {

    @Override
    public void onEnable() {
        Metrics metrics = new Metrics(this,16961);
        metrics.addCustomChart(new Metrics.MultiLineChart("players_and_servers", new Callable<Map<String, Integer>>() {
            @Override
            public Map<String, Integer> call() throws Exception {
                Map<String, Integer> valueMap = new HashMap<>();
                valueMap.put("servers", 1);
                valueMap.put("players", Bukkit.getOnlinePlayers().size());
                return valueMap;
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
        if (this.getConfig().getString("nerfsnowman").equals("true")) {
            getServer().getPluginManager().registerEvents(new Events(this), this);
        }
        if (this.getConfig().getString("armorstandlimit").equals("true")) {
            getServer().getPluginManager().registerEvents(new ASLimit(this), this);
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}