package me.jewishlewish.synx;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Snowman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class Events implements Listener {

    private Synx plugin;
    public Events(Synx pl) {
        plugin = pl;
    }

    @EventHandler
    public void SnowNerf(CreatureSpawnEvent event) {
        if (plugin.getConfig().getString("nerfsnowman").equals("true")) {
            Entity entity = event.getEntity();
            if (entity instanceof Snowman) {
                ((Snowman) entity).setAI(false);
            }

        } else {
            CreatureSpawnEvent.getHandlerList().unregister(this);
        }

        if (plugin.getConfig().getString("armorstandlimit").equals("true")) {
            for (World w : Bukkit.getWorlds()) {
                for (Entity e : w.getEntities()) {
                    if ((e instanceof ArmorStand)) {
                        Bukkit.getLogger().info("The e is:" + e);
                        e.getLocation().getChunk();
                        int entities = e.getLocation().getChunk().getEntities().length;
                        Bukkit.getLogger().info("Armorstand count:" + entities);

                    }
                }
            }
        }
    }
}