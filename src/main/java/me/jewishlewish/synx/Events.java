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

import java.util.ArrayList;
import java.util.List;

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
                List<Entity> toRemove = new ArrayList<Entity>();
                for (Entity e : entity.getLocation().getChunk().getEntities()) {
                    if ((e instanceof ArmorStand)) {
                        toRemove.add(e);
                        if (toRemove.size() > 20) {
                            toRemove.remove(entity);
                        } else if (toRemove.size() > 4) {
                            entity.remove();
                        }
                    }
                }
            }
        }
    }
}