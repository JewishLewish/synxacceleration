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
    static void spigotEdit(String ac, String rc) {
        if (ac.equals("true")) {
            String[] fprop = {"bukkit", "spigot", "config/paper-world-defaults"};
            for(String ftype : fprop){
                if (new File(ftype+".yml").exists()) {
                    Path target= Paths.get(ftype+".yml");

                    try {
                        Files.delete(target);
                        Files.write(target, new returndata().files(ftype, rc).getBytes());
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
            if(Bukkit.getVersion().contains("1.18")) {
                lines.set(34, "resource-pack=" + tp);
            } else if (Bukkit.getVersion().contains("1.19")){
                lines.set(36, "resource-pack=" + tp);
            }
            Files.delete(target);
            Files.write(target, lines);
            Bukkit.getLogger().info("Texture pack successfully placed!");
        }

    }

    public static void distanceedit(String sd, String vd) throws IOException {
        Path target= Paths.get("server.properties");
        List<String> lines = Files.readAllLines(target);
        if(Bukkit.getVersion().contains("1.18")) {
            lines.set(24, "view-distance=" + vd);
            lines.set(36, "simulation-distance=" + sd);
        } else if (Bukkit.getVersion().contains("1.19")){
            lines.set(26, "view-distance=" + vd);
            lines.set(38, "simulation-distance=" + sd);
        }
        Files.delete(target);
        Files.write(target, lines);
    }
}
