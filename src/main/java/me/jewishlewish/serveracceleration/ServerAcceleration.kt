package me.jewishlewish.serveracceleration

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

        fileoptimisation().configread(this);

    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
