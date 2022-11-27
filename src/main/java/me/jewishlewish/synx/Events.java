package me.jewishlewish.synx;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Snowman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class Events implements Listener {
    @EventHandler
    public void SnowNerf(CreatureSpawnEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof Snowman) {
            Bukkit.getLogger().info("The creature is a " + entity);
        }
    }
}