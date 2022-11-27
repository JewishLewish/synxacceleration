package me.jewishlewish.synx;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.minecart.StorageMinecart;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class serveropt {

    static void spigotEdit(String ac) {
        if (ac.equals("fast")) {
            String[] fprop = {"bukkit", "spigot", "config/paper-world-defaults"};
            //PrintWriter prw;
            for(String ftype : fprop){
                if (new File(ftype+".yml").exists()) {
                    Path target= Paths.get(ftype+".yml");

                    try {
                        Files.delete(target);
                        Files.write(target, new returndata().files(ftype).getBytes());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
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

        if (!content.contains("resource-pack=" + tp)){
            List<String> lines = Files.readAllLines(target);
            lines.set(36, "resource-pack=" + tp);
            Files.delete(target);
            Files.write(target, lines);
            Bukkit.getLogger().info("Texture pack successfully placed!");
        }

    }
}
