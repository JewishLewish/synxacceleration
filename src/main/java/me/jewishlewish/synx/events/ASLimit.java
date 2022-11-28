package me.jewishlewish.synx.events;

import me.jewishlewish.synx.Synx;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ASLimit implements Listener {
    private final Synx plugin;
    public ASLimit(Synx pl) {
        plugin = pl;
    }

    @EventHandler
    public void ARmanagement(CreatureSpawnEvent event) {
        if (Objects.equals(plugin.getConfig().getString("armorstandlimit"), "true")) {
            Entity entity = event.getEntity();
            if ((entity instanceof ArmorStand)) {
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
