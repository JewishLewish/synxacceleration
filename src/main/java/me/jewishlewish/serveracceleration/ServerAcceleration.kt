package me.jewishlewish.serveracceleration

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class ServerAcceleration : JavaPlugin() {
    override fun onEnable() {
        saveDefaultConfig()

        logger.info(
            "\n" +
                    "░██████╗██╗░░░██╗███╗░░██╗██╗░░██╗\n" +
                    "██╔════╝╚██╗░██╔╝████╗░██║╚██╗██╔╝\n" +
                    "╚█████╗░░╚████╔╝░██╔██╗██║░╚███╔╝░\n" +
                    "░╚═══██╗░░╚██╔╝░░██║╚████║░██╔██╗░\n" +
                    "██████╔╝░░░██║░░░██║░╚███║██╔╝╚██╗\n" +
                    "╚═════╝░░░░╚═╝░░░╚═╝░░╚══╝╚═╝░░╚═╝"
        )

        val ac: String? = this.getConfig().getString("acceleration")
        Bukkit.getLogger().info("Acceleration speed is: $ac")
        if ("none" != ac) {
            fileoptimisation.spigotEdit(ac)
        }

    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
