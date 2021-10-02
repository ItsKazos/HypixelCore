package me.itskazos.hypixelcore.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class discord implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    	Player p = (Player) sender;
    	p.sendMessage(ChatColor.GREEN + "Join our discord server! " + ChatColor.AQUA + ChatColor.UNDERLINE + "https://discord.gg/SaD4NWt2nK");
        return true;
    }

}
