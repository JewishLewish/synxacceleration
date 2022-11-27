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

        if (this.getConfig().getString("fpstexturepack").equals("true")) {
            val tp = "https://www.dropbox.com/s/a8vgtqlaoylkyx8/fpsboost.zip?dl=1"
            serveropt.serverprop(tp)

        }
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
