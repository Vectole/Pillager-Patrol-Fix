package xyz.vectole.projects.pillagerfix;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PillagerControl(), this);
        getLogger().info("Pillager Fix plugin enabled!");
    }
    @Override
    public void onDisable() {
        getLogger().info("Pillager Fix plugin disabled!");
    }
}