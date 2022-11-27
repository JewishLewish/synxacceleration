package me.jewishlewish.synx;


import org.bukkit.Bukkit;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Snowman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class Events implements Listener {
    @EventHandler
    public void SnowNerf(CreatureSpawnEvent event) {
        if (this.getConfig().getString("nerfsnowmans").equals("false")) {
            CreatureSpawnEvent.getHandlerList().unregister(this);
        }
        Entity entity = event.getEntity();
        if (entity instanceof Snowman) {
            ((Snowman) entity).setAI(false);
        }
    }
}