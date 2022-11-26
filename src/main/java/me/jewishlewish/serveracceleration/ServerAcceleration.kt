package me.jewishlewish.serveracceleration

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class ServerAcceleration : JavaPlugin() {
    override fun onEnable() {
        saveDefaultConfig()
        logger.info("Synx is operating!")

        val ac: String? = this.getConfig().getString("acceleration")
        Bukkit.getLogger().info("Acceleration speed is: $ac")
        if ("none" != ac) {
            serveropt.spigotEdit(ac)
        }

        if (this.getConfig().getString("deletechestminecart").equals("true")) {
            serveropt.minechest()
        }
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
