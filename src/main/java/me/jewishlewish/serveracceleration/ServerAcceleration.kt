package me.jewishlewish.serveracceleration

import org.bukkit.plugin.java.JavaPlugin
import java.io.File


class ServerAcceleration : JavaPlugin() {
    override fun onEnable() {
        saveDefaultConfig();

        logger.info(
            "\n" +
                    "░██████╗██╗░░░██╗███╗░░██╗██╗░░██╗\n" +
                    "██╔════╝╚██╗░██╔╝████╗░██║╚██╗██╔╝\n" +
                    "╚█████╗░░╚████╔╝░██╔██╗██║░╚███╔╝░\n" +
                    "░╚═══██╗░░╚██╔╝░░██║╚████║░██╔██╗░\n" +
                    "██████╔╝░░░██║░░░██║░╚███║██╔╝╚██╗\n" +
                    "╚═════╝░░░░╚═╝░░░╚═╝░░╚══╝╚═╝░░╚═╝"
        )
        val obj = fileoptimisation()
        obj.configread(this);

    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
