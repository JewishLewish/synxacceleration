package me.jewishlewish.synx;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Snowman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.jetbrains.annotations.NotNull;

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

        } else {CreatureSpawnEvent.getHandlerList().unregister(this);}

        if (plugin.getConfig().getString("armorstandlimit").equals("true")) {
            Entity entity = event.getEntity();
            if (entity.getType().equals(EntityType.ARMOR_STAND)) {

                for (Entity e : entity.getLocation().getChunk().getEntities()) {
                    if ((e instanceof ArmorStand)) {

                        int numentities = e.getLocation().getChunk().getEntities().length;
                        Bukkit.getLogger().info("Armorstand count:" + numentities);

                    }
                }
            }
        }
    }
}