package me.theowl.test.command.commands;

import me.theowl.test.Main;
import org.bukkit.entity.Player;

public abstract class ToggleFly extends SubCommand {

    private Main plugin = Main.getInstance();

    @Override
    public void onCommand(Player player, String[] args){
        player.sendMessage("Fly enabled.");
    }

}
