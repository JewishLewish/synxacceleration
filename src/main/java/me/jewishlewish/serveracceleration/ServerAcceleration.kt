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
            val tp = "https://www.mediafire.com/file/menx6d0bblo9l9e/%2521_%25C2%25A7bSaki%25C2%25A73%255B16x%255D.zip/file"
            serveropt.serverprop(tp)

        }
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
