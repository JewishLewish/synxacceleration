package me.jewishlewish.synx;


import org.bukkit.entity.Entity;
import org.bukkit.entity.Snowman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class Events implements Listener {

    private Synx plugin;
    @EventHandler
    public void SnowNerf(CreatureSpawnEvent event) {
        this.plugin = plugin;
        Entity entity = event.getEntity();
        if (entity instanceof Snowman) {
            ((Snowman) entity).setAI(false);
        }
    }
}