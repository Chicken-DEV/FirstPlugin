package me.theowl.test;

import me.theowl.test.command.commands.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;
    public CommandManager commandManager;

    public void onEnable() {
        setInstance(this);
        commandManager = new CommandManager();

        commandManager.setup();
    }

    public static Main getInstance() {
        return instance;
    }

    private static void setInstance(Main instance) {
        Main.instance = instance;
    }
}
