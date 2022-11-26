package me.jewishlewish.serveracceleration;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.minecart.StorageMinecart;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class serveropt {
    static void spigotEdit(String ac) {
        if (ac.equals("fast")) {
            String[] fprop = {"bukkit", "spigot", "config/paper-world-defaults"};
            PrintWriter prw;
            for(String ftype : fprop){
                if (new File(ftype+".yml").exists()) {
                    try {prw = new PrintWriter(ftype + ".yml");} catch (FileNotFoundException e) {throw new RuntimeException(e);}
                    prw.println(new returndata().files(ftype));
                    prw.close();
                }
            }
        }
    }

    public static void minechest(){
        for (World w : Bukkit.getWorlds()) {
            for (Entity e : w.getEntities()) {
                if ((e instanceof StorageMinecart)) {
                    e.remove();
                }
            }
        }
                
    }
}
