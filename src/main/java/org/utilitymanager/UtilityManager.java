package org.utilitymanager;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.utilitymanager.Command.CommandManager;

import java.util.logging.Logger;

public final class UtilityManager extends JavaPlugin {
    public static Plugin plugin;
    public static Logger log = Bukkit.getLogger();
    public static Plugin getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        CommandManager commandManager = new CommandManager(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
