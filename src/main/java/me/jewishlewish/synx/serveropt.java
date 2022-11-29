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
        Bukkit.getLogger().info("The ac is: " + ac);
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
            lines.set(36, "resource-pack=" + tp);
            Files.delete(target);
            Files.write(target, lines);
            Bukkit.getLogger().info("Texture pack successfully placed!");
        }

    }

    public static void sRedstone() throws IOException {
        Path target= Paths.get("config/paper-world-defaults.yml");
        String content = new String(Files.readAllBytes(target), StandardCharsets.UTF_8);

        if (!content.contains("ALTERNATE_CURRENT")) {
            List<String> lines = Files.readAllLines(target);
            lines.set(253, "  redstone-implementation: ALTERNATE_CURRENT");
            Files.delete(target);
            Files.write(target, lines);
        }
    }

    public static void distanceedit(String sd, String vd) throws IOException {
        Path target= Paths.get("server.properties");
        List<String> lines = Files.readAllLines(target);
        lines.set(26, "view-distance=" + vd);
        lines.set(38, "simulation-distance=" + sd);
        Files.delete(target);
        Files.write(target, lines);
    }
}
