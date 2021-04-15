package org.vibemarket.Main;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;
import org.vibemarket.commands.ColorCommand;

public class Main extends JavaPlugin {
    public void onEnable() {
        Bukkit.getPluginCommand("colors").setExecutor( new ColorCommand());
    }
    public void onDisable() {

    }
}
