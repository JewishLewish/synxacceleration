package me.jewishlewish.synx;

import me.jewishlewish.synx.events.ASLimit;
import me.jewishlewish.synx.events.Events;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class Synx extends JavaPlugin {

    @Override
    public void onEnable() {
        Metrics metrics = new Metrics(this,16961);
        metrics.addCustomChart(new Metrics.MultiLineChart("players_and_servers", new Callable<Map<String, Integer>>() {
            @Override
            public Map<String, Integer> call() {
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

        if (Objects.equals(this.getConfig().getString("deletechestminecart"), "true")) {
            serveropt.minechest();
        }

        if (Objects.equals(this.getConfig().getString("fpstexturepack"), "true")) {
            String tp = "https://www.dropbox.com/s/8wphrs2ht7pr13x/Bare%2BBones%2B1.19.zip?dl=1";
            try {serveropt.serverprop(tp);} catch (IOException e) {throw new RuntimeException(e);}
        }
        if (Objects.equals(this.getConfig().getString("nerfsnowman"), "true")) {
            getServer().getPluginManager().registerEvents(new Events(this), this);
        }
        if (Objects.equals(this.getConfig().getString("smarterRedstone"), "true")) {
            try {serveropt.sRedstone();} catch (IOException e) {throw new RuntimeException(e);}
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}