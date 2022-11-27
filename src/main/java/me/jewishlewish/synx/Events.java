package me.jewishlewish.synx;



import org.bukkit.entity.Entity;
import org.bukkit.entity.Snowman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.Plugin;

public class Events implements Listener {

    private Synx plugin;
    public Events(Synx pl) {
        plugin = pl;
    }

    @EventHandler
    public void SnowNerf(CreatureSpawnEvent event) {
        if (plugin.getConfig().getString("nerfsnowmans").equals("true")) {
            CreatureSpawnEvent.getHandlerList().unregister(this);
        }

        Entity entity = event.getEntity();
        if (entity instanceof Snowman) {
            ((Snowman) entity).setAI(false);
        }
    }
}