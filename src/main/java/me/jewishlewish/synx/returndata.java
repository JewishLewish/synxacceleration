package me.jewishlewish.synx;

public class returndata {
    public String files(String dn, String rc) {
        String value = null;
        if (dn.equals("config/paper-world-defaults")) {
            String Rconfig = null;
            if (rc.contains("true")) {Rconfig = "ALTERNATE_CURRENT";} else {Rconfig = "VANILLA";}
            value = "# This is the world defaults configuration file for Paper.\n" +
                    "# As you can see, there's a lot to configure. Some options may impact gameplay, so use\n" +
                    "# with caution, and make sure you know what each option does before configuring.\n" +
                    "#\n" +
                    "# If you need help with the configuration or have any questions related to Paper,\n" +
                    "# join us in our Discord or check the docs page.\n" +
                    "#\n" +
                    "# Configuration options here apply to all worlds, unless you specify overrides inside\n" +
                    "# the world-specific config file inside each world folder.\n" +
                    "#\n" +
                    "# Docs: https://docs.papermc.io/\n" +
                    "# Discord: https://discord.gg/papermc\n" +
                    "# Website: https://papermc.io/\n" +
                    "\n" +
                    "_version: 29\n" +
                    "anticheat:\n" +
                    "  anti-xray:\n" +
                    "    enabled: false\n" +
                    "    engine-mode: 1\n" +
                    "    hidden-blocks:\n" +
                    "      - copper_ore\n" +
                    "      - deepslate_copper_ore\n" +
                    "      - gold_ore\n" +
                    "      - deepslate_gold_ore\n" +
                    "      - iron_ore\n" +
                    "      - deepslate_iron_ore\n" +
                    "      - coal_ore\n" +
                    "      - deepslate_coal_ore\n" +
                    "      - lapis_ore\n" +
                    "      - deepslate_lapis_ore\n" +
                    "      - mossy_cobblestone\n" +
                    "      - obsidian\n" +
                    "      - chest\n" +
                    "      - diamond_ore\n" +
                    "      - deepslate_diamond_ore\n" +
                    "      - redstone_ore\n" +
                    "      - deepslate_redstone_ore\n" +
                    "      - clay\n" +
                    "      - emerald_ore\n" +
                    "      - deepslate_emerald_ore\n" +
                    "      - ender_chest\n" +
                    "    lava-obscures: false\n" +
                    "    max-block-height: 64\n" +
                    "    replacement-blocks:\n" +
                    "      - stone\n" +
                    "      - oak_planks\n" +
                    "      - deepslate\n" +
                    "    update-radius: 2\n" +
                    "    use-permission: false\n" +
                    "  obfuscation:\n" +
                    "    items:\n" +
                    "      hide-durability: false\n" +
                    "      hide-itemmeta: false\n" +
                    "      hide-itemmeta-with-visual-effects: false\n" +
                    "chunks:\n" +
                    "  auto-save-interval: default\n" +
                    "  delay-chunk-unloads-by: 10s\n" +
                    "  entity-per-chunk-save-limit:\n" +
                    "    arrow: -1\n" +
                    "    ender_pearl: -1\n" +
                    "    experience_orb: -1\n" +
                    "    fireball: -1\n" +
                    "    small_fireball: -1\n" +
                    "    snowball: -1\n" +
                    "  fixed-chunk-inhabited-time: -1\n" +
                    "  max-auto-save-chunks-per-tick: 6\n" +
                    "  prevent-moving-into-unloaded-chunks: false\n" +
                    "collisions:\n" +
                    "  allow-player-cramming-damage: false\n" +
                    "  allow-vehicle-collisions: true\n" +
                    "  fix-climbing-bypassing-cramming-rule: false\n" +
                    "  max-entity-collisions: 2\n" +
                    "  only-players-collide: false\n" +
                    "entities:\n" +
                    "  armor-stands:\n" +
                    "    do-collision-entity-lookups: true\n" +
                    "    tick: false\n" +
                    "  behavior:\n" +
                    "    baby-zombie-movement-modifier: 0.5\n" +
                    "    disable-chest-cat-detection: true\n" +
                    "    disable-creeper-lingering-effect: false\n" +
                    "    disable-player-crits: false\n" +
                    "    door-breaking-difficulty:\n" +
                    "      husk:\n" +
                    "        - HARD\n" +
                    "      vindicator:\n" +
                    "        - NORMAL\n" +
                    "        - HARD\n" +
                    "      zombie:\n" +
                    "        - HARD\n" +
                    "      zombie_villager:\n" +
                    "        - HARD\n" +
                    "      zombified_piglin:\n" +
                    "        - HARD\n" +
                    "    ender-dragons-death-always-places-dragon-egg: false\n" +
                    "    experience-merge-max-value: -1\n" +
                    "    mobs-can-always-pick-up-loot:\n" +
                    "      skeletons: false\n" +
                    "      zombies: false\n" +
                    "    nerf-pigmen-from-nether-portals: false\n" +
                    "    parrots-are-unaffected-by-player-movement: false\n" +
                    "    phantoms-do-not-spawn-on-creative-players: true\n" +
                    "    phantoms-only-attack-insomniacs: true\n" +
                    "    piglins-guard-chests: true\n" +
                    "    pillager-patrols:\n" +
                    "      disable: false\n" +
                    "      spawn-chance: 0.2\n" +
                    "      spawn-delay:\n" +
                    "        per-player: false\n" +
                    "        ticks: 12000\n" +
                    "      start:\n" +
                    "        day: 5\n" +
                    "        per-player: false\n" +
                    "    should-remove-dragon: false\n" +
                    "    spawner-nerfed-mobs-should-jump: false\n" +
                    "    zombie-villager-infection-chance: -1.0\n" +
                    "    zombies-target-turtle-eggs: true\n" +
                    "  entities-target-with-follow-range: false\n" +
                    "  mob-effects:\n" +
                    "    immune-to-wither-effect:\n" +
                    "      wither: true\n" +
                    "      wither-skeleton: true\n" +
                    "    spiders-immune-to-poison-effect: true\n" +
                    "    undead-immune-to-certain-effects: true\n" +
                    "  spawning:\n" +
                    "    all-chunks-are-slime-chunks: false\n" +
                    "    alt-item-despawn-rate:\n" +
                    "      enabled: false\n" +
                    "      items:\n" +
                    "        cobblestone: 300\n" +
                    "    count-all-mobs-for-spawning: false\n" +
                    "    creative-arrow-despawn-rate: 60\n" +
                    "    despawn-ranges:\n" +
                    "      ambient:\n" +
                    "        hard: 96\n" +
                    "        soft: 32\n" +
                    "      axolotls:\n" +
                    "        hard: 96\n" +
                    "        soft: 32\n" +
                    "      creature:\n" +
                    "        hard: 96\n" +
                    "        soft: 32\n" +
                    "      misc:\n" +
                    "        hard: 96\n" +
                    "        soft: 32\n" +
                    "      monster:\n" +
                    "        hard: 96\n" +
                    "        soft: 32\n" +
                    "      underground_water_creature:\n" +
                    "        hard: 64\n" +
                    "        soft: 32\n" +
                    "      water_ambient:\n" +
                    "        hard: 64\n" +
                    "        soft: 32\n" +
                    "      water_creature:\n" +
                    "        hard: 64\n" +
                    "        soft: 32\n" +
                    "    disable-mob-spawner-spawn-egg-transformation: false\n" +
                    "    duplicate-uuid:\n" +
                    "      mode: SAFE_REGEN\n" +
                    "      safe-regen-delete-range: 32\n" +
                    "    filter-nbt-data-from-spawn-eggs-and-related: true\n" +
                    "    iron-golems-can-spawn-in-air: false\n" +
                    "    monster-spawn-max-light-level: -1\n" +
                    "    non-player-arrow-despawn-rate: 60\n" +
                    "    per-player-mob-spawns: true\n" +
                    "    scan-for-legacy-ender-dragon: true\n" +
                    "    skeleton-horse-thunder-spawn-chance: default\n" +
                    "    slime-spawn-height:\n" +
                    "      slime-chunk:\n" +
                    "        maximum: 40.0\n" +
                    "      surface-biome:\n" +
                    "        maximum: 70.0\n" +
                    "        minimum: 50.0\n" +
                    "    spawn-limits:\n" +
                    "      ambient: -1\n" +
                    "      axolotls: -1\n" +
                    "      creature: -1\n" +
                    "      monster: -1\n" +
                    "      underground_water_creature: -1\n" +
                    "      water_ambient: -1\n" +
                    "      water_creature: -1\n" +
                    "    wandering-trader:\n" +
                    "      spawn-chance-failure-increment: 25\n" +
                    "      spawn-chance-max: 75\n" +
                    "      spawn-chance-min: 25\n" +
                    "      spawn-day-length: 24000\n" +
                    "      spawn-minute-length: 1200\n" +
                    "    wateranimal-spawn-height:\n" +
                    "      maximum: default\n" +
                    "      minimum: default\n" +
                    "environment:\n" +
                    "  disable-explosion-knockback: false\n" +
                    "  disable-ice-and-snow: false\n" +
                    "  disable-teleportation-suffocation-check: false\n" +
                    "  disable-thunder: false\n" +
                    "  fire-tick-delay: 30\n" +
                    "  frosted-ice:\n" +
                    "    delay:\n" +
                    "      max: 40\n" +
                    "      min: 20\n" +
                    "    enabled: true\n" +
                    "  generate-flat-bedrock: false\n" +
                    "  nether-ceiling-void-damage-height: disabled\n" +
                    "  optimize-explosions: true\n" +
                    "  portal-create-radius: 16\n" +
                    "  portal-search-radius: 128\n" +
                    "  portal-search-vanilla-dimension-scaling: true\n" +
                    "  treasure-maps:\n" +
                    "    enabled: true\n" +
                    "    find-already-discovered:\n" +
                    "      loot-tables: default\n" +
                    "      villager-trade: false\n" +
                    "  water-over-lava-flow-speed: 5\n" +
                    "feature-seeds:\n" +
                    "  generate-random-seeds-for-all: false\n" +
                    "fishing-time-range:\n" +
                    "  maximum: 600\n" +
                    "  minimum: 100\n" +
                    "fixes:\n" +
                    "  disable-unloaded-chunk-enderpearl-exploit: true\n" +
                    "  falling-block-height-nerf: disabled\n" +
                    "  fix-curing-zombie-villager-discount-exploit: true\n" +
                    "  fix-items-merging-through-walls: false\n" +
                    "  prevent-tnt-from-moving-in-water: false\n" +
                    "  split-overstacked-loot: true\n" +
                    "  tnt-entity-height-nerf: disabled\n" +
                    "hopper:\n" +
                    "  cooldown-when-full: true\n" +
                    "  disable-move-event: false\n" +
                    "  ignore-occluding-blocks: false\n" +
                    "lootables:\n" +
                    "  auto-replenish: false\n" +
                    "  max-refills: -1\n" +
                    "  refresh-max: 2d\n" +
                    "  refresh-min: 12h\n" +
                    "  reset-seed-on-fill: true\n" +
                    "  restrict-player-reloot: true\n" +
                    "maps:\n" +
                    "  item-frame-cursor-limit: 128\n" +
                    "  item-frame-cursor-update-interval: 10\n" +
                    "max-growth-height:\n" +
                    "  bamboo:\n" +
                    "    max: 16\n" +
                    "    min: 11\n" +
                    "  cactus: 3\n" +
                    "  reeds: 3\n" +
                    "misc:\n" +
                    "  disable-end-credits: false\n" +
                    "  disable-relative-projectile-velocity: false\n" +
                    "  disable-sprint-interruption-on-attack: false\n" +
                    "  light-queue-size: 20\n" +
                    "  max-leash-distance: 10.0\n" +
                    "  redstone-implementation: " + Rconfig + "\n" +
                    "  shield-blocking-delay: 5\n" +
                    "  show-sign-click-command-failure-msgs-to-player: false\n" +
                    "  update-pathfinding-on-block-update: true\n" +
                    "scoreboards:\n" +
                    "  allow-non-player-entities-on-scoreboards: false\n" +
                    "  use-vanilla-world-scoreboard-name-coloring: false\n" +
                    "spawn:\n" +
                    "  allow-using-signs-inside-spawn-protection: false\n" +
                    "  keep-spawn-loaded: true\n" +
                    "  keep-spawn-loaded-range: 10\n" +
                    "tick-rates:\n" +
                    "  behavior:\n" +
                    "    villager:\n" +
                    "      validatenearbypoi: -1\n" +
                    "  container-update: 3\n" +
                    "  grass-spread: 4\n" +
                    "  mob-spawner: 2\n" +
                    "  sensor:\n" +
                    "    villager:\n" +
                    "      secondarypoisensor: 40\n" +
                    "unsupported-settings:\n" +
                    "  fix-invulnerable-end-crystal-exploit: true\n";
        }
        if (dn.equals("bukkit")) {
            value = "settings:\n" +
                    "  allow-end: true\n" +
                    "  warn-on-overload: true\n" +
                    "  permissions-file: permissions.yml\n" +
                    "  update-folder: update\n" +
                    "  plugin-profiling: false\n" +
                    "  connection-throttle: 4000\n" +
                    "  query-plugins: true\n" +
                    "  deprecated-verbose: default\n" +
                    "  shutdown-message: Server closed\n" +
                    "  minimum-api: none\n" +
                    "  use-map-color-cache: true\n" +
                    "spawn-limits:\n" +
                    "  monsters: 45\n" +
                    "  animals: 8\n" +
                    "  water-animals: 5\n" +
                    "  water-ambient: 8\n" +
                    "  water-underground-creature: 5\n" +
                    "  axolotls: 5\n" +
                    "  ambient: 3\n" +
                    "chunk-gc:\n" +
                    "  period-in-ticks: 400\n" +
                    "ticks-per:\n" +
                    "  animal-spawns: 400\n" +
                    "  monster-spawns: 5\n" +
                    "  water-spawns: 11\n" +
                    "  water-ambient-spawns: 21\n" +
                    "  water-underground-creature-spawns: 1\n" +
                    "  axolotl-spawns: 1\n" +
                    "  ambient-spawns: 31\n" +
                    "  autosave: 6000\n" +
                    "aliases: now-in-commands.yml\n";
        }
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
                    "    mob-spawn-range: 3\n" +
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
