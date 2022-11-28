package me.jewishlewish.synx.events;


import me.jewishlewish.synx.Synx;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Snowman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.Objects;

public class Events implements Listener {

    private final Synx plugin;
    public Events(Synx pl) {
        plugin = pl;
    }

    @EventHandler
    public void SnowNerf(CreatureSpawnEvent event) {
        if (Objects.equals(plugin.getConfig().getString("nerfsnowman"), "true")) {
            Entity entity = event.getEntity();
            if (entity instanceof Snowman) {
                ((Snowman) entity).setAI(false);
            }
        }
    }
}