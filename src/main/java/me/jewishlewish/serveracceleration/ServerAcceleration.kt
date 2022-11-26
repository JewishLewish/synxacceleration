package me.jewishlewish.serveracceleration

import org.bukkit.plugin.java.JavaPlugin

class ServerAcceleration : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("Hello World")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}