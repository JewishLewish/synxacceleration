package me.jewishlewish.serveracceleration;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.minecart.StorageMinecart;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

    public static void serverprop(String tp) throws IOException {
        Path target= Paths.get("server.properties");

        String content = new String(Files.readAllBytes(target), StandardCharsets.UTF_8);
        content = content.replaceAll("resource-pack=","resource-pack=" + tp);
        Files.write(target, content.getBytes(StandardCharsets.UTF_8)); // Writes it back to the file.

        Bukkit.getLogger().info("Texture pack successfully placed!");

    }
}
