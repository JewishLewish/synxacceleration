package me.jewishlewish.serveracceleration

import org.bukkit.plugin.java.JavaPlugin
import java.io.File
import kotlin.math.log

class ServerAcceleration : JavaPlugin() {
    override fun onEnable() {
        logger.info("\n" +
                "░██████╗██╗░░░██╗███╗░░██╗██╗░░██╗\n" +
                "██╔════╝╚██╗░██╔╝████╗░██║╚██╗██╔╝\n" +
                "╚█████╗░░╚████╔╝░██╔██╗██║░╚███╔╝░\n" +
                "░╚═══██╗░░╚██╔╝░░██║╚████║░██╔██╗░\n" +
                "██████╔╝░░░██║░░░██║░╚███║██╔╝╚██╗\n" +
                "╚═════╝░░░░╚═╝░░░╚═╝░░╚══╝╚═╝░░╚═╝")


        if(File("spigot.yml").exists()){
            logger.info("spigot.yml does exist.")
        } else {
            logger.info("spigot.yml does not exist.")
        }

    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
