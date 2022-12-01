package me.jewishlewish.synx;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.minecart.StorageMinecart;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class serveropt {
    static void spigotEdit(String ac, String rc) {
        if (ac.equals("true")) {
            String[] fprop = {"bukkit", "spigot", "paper"};
            for(String ftype : fprop){
                if (new File(ftype+".yml").exists()) {
                    Path target= Paths.get(ftype+".yml");
                    try {
                        Files.delete(target);
                        Files.write(target, new returndata().files(ftype, rc).getBytes());
                    } catch (IOException e) {
                        Bukkit.getLogger().info("Can't seem to find the file: " + ftype + ".yml");
                    }
                }
            }
        }
    }
    public static void minechest(){
        for (World w : Bukkit.getWorlds()) {
            for (Entity e : w.getEntities()) {
                if ((e instanceof StorageMinecart)) {e.remove();}}}
    }

    public static void serverprop(String tp) throws IOException {
        Path target= Paths.get("server.properties");
        List<String> lines = Files.readAllLines(target);

        if (!lines.get(34).equals("resource-pack=" + tp)){
            lines.set(34, "resource-pack=" + tp);
            Files.delete(target);
            Files.write(target, lines);
            Bukkit.getLogger().info("Texture pack successfully placed!");
        }

    }

    public static void distanceedit(String sd, String vd) throws IOException {
        Path target= Paths.get("server.properties");
        List<String> lines = Files.readAllLines(target);
        if (!lines.get(24).equals("view-distance=" + vd)) {
            lines.set(24, "view-distance=" + vd);
        } if (!lines.get(36).equals("simulation-distance=" + sd)) {
            lines.set(36, "simulation-distance=" + sd);
        } else {
            return;
        }

        Files.delete(target);
        Files.write(target, lines);
    }
}
