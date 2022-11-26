package me.jewishlewish.serveracceleration;

public class returndata {
    public String files(String dn) {
        String value = null;
        if (dn.equals("spigot")) {
            value = "# This is the main configuration file for Spigot.\n" +
                    "# As you can see, there's tons to configure. Some options may impact gameplay, so use\n" +
                    "# with caution, and make sure you know what each option does before configuring.\n" +
                    "# For a reference for any variable inside this file, check out the Spigot wiki at\n" +
                    "# http://www.spigotmc.org/wiki/spigot-configuration/\n" +
                    "#\n" +
                    "# If you need help with the configuration or have any questions related to Spigot,\n" +
                    "# join us at the Discord or drop by our forums and leave a post.\n" +
                    "#\n" +
                    "# Discord: https://www.spigotmc.org/go/discord\n" +
                    "# Forums: http://www.spigotmc.org/\n" +
                    "\n" +
                    "settings:\n" +
                    "  debug: false\n" +
                    "  timeout-time: 60\n" +
                    "  restart-on-crash: true\n" +
                    "  restart-script: ./start.sh\n" +
                    "  bungeecord: false\n" +
                    "  sample-count: 12\n" +
                    "  user-cache-size: 1000\n" +
                    "  player-shuffle: 0\n" +
                    "  netty-threads: 4\n" +
                    "  log-villager-deaths: true\n" +
                    "  log-named-deaths: true\n" +
                    "  attribute:\n" +
                    "    maxHealth:\n" +
                    "      max: 2048.0\n" +
                    "    movementSpeed:\n" +
                    "      max: 2048.0\n" +
                    "    attackDamage:\n" +
                    "      max: 2048.0\n" +
                    "  save-user-cache-on-stop-only: true\n" +
                    "  moved-wrongly-threshold: 0.0625\n" +
                    "  moved-too-quickly-multiplier: 10.0\n" +
                    "messages:\n" +
                    "  whitelist: You are not whitelisted on this server!\n" +
                    "  unknown-command: Unknown command. Type \"/help\" for help.\n" +
                    "  server-full: The server is full!\n" +
                    "  outdated-client: Outdated client! Please use {0}\n" +
                    "  outdated-server: Outdated server! I'm still on {0}\n" +
                    "  restart: Server is restarting\n" +
                    "advancements:\n" +
                    "  disable-saving: false\n" +
                    "  disabled:\n" +
                    "    - minecraft:story/disabled\n" +
                    "commands:\n" +
                    "  replace-commands:\n" +
                    "    - setblock\n" +
                    "    - summon\n" +
                    "    - testforblock\n" +
                    "    - tellraw\n" +
                    "  spam-exclusions:\n" +
                    "    - /skill\n" +
                    "  log: true\n" +
                    "  tab-complete: 0\n" +
                    "  send-namespaced: true\n" +
                    "  silent-commandblock-console: false\n" +
                    "world-settings:\n" +
                    "  default:\n" +
                    "    below-zero-generation-in-existing-chunks: true\n" +
                    "    arrow-despawn-rate: 300\n" +
                    "    trident-despawn-rate: 1200\n" +
                    "    simulation-distance: default\n" +
                    "    view-distance: default\n" +
                    "    thunder-chance: 100000\n" +
                    "    zombie-aggressive-towards-villager: true\n" +
                    "    merge-radius:\n" +
                    "      item: 4.0\n" +
                    "      exp: 6.0\n" +
                    "    item-despawn-rate: 6000\n" +
                    "    end-portal-sound-radius: 0\n" +
                    "    hanging-tick-frequency: 100\n" +
                    "    enable-zombie-pigmen-portal-spawns: true\n" +
                    "    wither-spawn-sound-radius: 0\n" +
                    "    nerf-spawner-mobs: true\n" +
                    "    mob-spawn-range: 6\n" +
                    "    dragon-death-sound-radius: 0\n" +
                    "    entity-activation-range:\n" +
                    "      animals: 16\n" +
                    "      monsters: 24\n" +
                    "      raiders: 40\n" +
                    "      misc: 8\n" +
                    "      water: 12\n" +
                    "      villagers: 32\n" +
                    "      flying-monsters: 24\n" +
                    "      wake-up-inactive:\n" +
                    "        animals-max-per-tick: 4\n" +
                    "        animals-every: 1200\n" +
                    "        animals-for: 100\n" +
                    "        monsters-max-per-tick: 8\n" +
                    "        monsters-every: 400\n" +
                    "        monsters-for: 100\n" +
                    "        villagers-max-per-tick: 4\n" +
                    "        villagers-every: 600\n" +
                    "        villagers-for: 100\n" +
                    "        flying-monsters-max-per-tick: 8\n" +
                    "        flying-monsters-every: 200\n" +
                    "        flying-monsters-for: 100\n" +
                    "      villagers-work-immunity-after: 100\n" +
                    "      villagers-work-immunity-for: 20\n" +
                    "      villagers-active-for-panic: true\n" +
                    "      tick-inactive-villagers: false\n" +
                    "      ignore-spectators: false\n" +
                    "    growth:\n" +
                    "      cactus-modifier: 100\n" +
                    "      cane-modifier: 100\n" +
                    "      melon-modifier: 100\n" +
                    "      mushroom-modifier: 100\n" +
                    "      pumpkin-modifier: 100\n" +
                    "      sapling-modifier: 100\n" +
                    "      beetroot-modifier: 100\n" +
                    "      carrot-modifier: 100\n" +
                    "      potato-modifier: 100\n" +
                    "      wheat-modifier: 100\n" +
                    "      netherwart-modifier: 100\n" +
                    "      vine-modifier: 100\n" +
                    "      cocoa-modifier: 100\n" +
                    "      bamboo-modifier: 100\n" +
                    "      sweetberry-modifier: 100\n" +
                    "      kelp-modifier: 100\n" +
                    "      twistingvines-modifier: 100\n" +
                    "      weepingvines-modifier: 100\n" +
                    "      cavevines-modifier: 100\n" +
                    "      glowberry-modifier: 100\n" +
                    "    ticks-per:\n" +
                    "      hopper-transfer: 8\n" +
                    "      hopper-check: 1\n" +
                    "    hopper-amount: 1\n" +
                    "    hopper-can-load-chunks: false\n" +
                    "    entity-tracking-range:\n" +
                    "      players: 48\n" +
                    "      animals: 48\n" +
                    "      monsters: 48\n" +
                    "      misc: 32\n" +
                    "      other: 64\n" +
                    "    max-tnt-per-tick: 100\n" +
                    "    max-tick-time:\n" +
                    "      tile: 50\n" +
                    "      entity: 50\n" +
                    "    hunger:\n" +
                    "      jump-walk-exhaustion: 0.05\n" +
                    "      jump-sprint-exhaustion: 0.2\n" +
                    "      combat-exhaustion: 0.1\n" +
                    "      regen-exhaustion: 6.0\n" +
                    "      swim-multiplier: 0.01\n" +
                    "      sprint-multiplier: 0.1\n" +
                    "      other-multiplier: 0.0\n" +
                    "    seed-village: 10387312\n" +
                    "    seed-desert: 14357617\n" +
                    "    seed-igloo: 14357618\n" +
                    "    seed-jungle: 14357619\n" +
                    "    seed-swamp: 14357620\n" +
                    "    seed-monument: 10387313\n" +
                    "    seed-shipwreck: 165745295\n" +
                    "    seed-ocean: 14357621\n" +
                    "    seed-outpost: 165745296\n" +
                    "    seed-endcity: 10387313\n" +
                    "    seed-slime: 987234911\n" +
                    "    seed-nether: 30084232\n" +
                    "    seed-mansion: 10387319\n" +
                    "    seed-fossil: 14357921\n" +
                    "    seed-portal: 34222645\n" +
                    "    seed-ancientcity: 20083232\n" +
                    "    seed-buriedtreasure: 10387320\n" +
                    "    seed-mineshaft: default\n" +
                    "    seed-stronghold: default\n" +
                    "    verbose: false\n" +
                    "players:\n" +
                    "  disable-saving: false\n" +
                    "config-version: 12\n" +
                    "stats:\n" +
                    "  disable-saving: false\n" +
                    "  forced-stats: {}\n";
        }
        return value;
    }
}
