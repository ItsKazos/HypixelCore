package me.itskazos.hypixelcore.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class boop implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    	Player p = (Player) sender;
    	if (args.length > 0) {
    		Player msged = Bukkit.getPlayer(args[0]);
            if (msged != null) {
	            msged.sendMessage(ChatColor.LIGHT_PURPLE + "From " + p.getDisplayName().toString() + ChatColor.GRAY + ": " + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "Boop!");
	            p.sendMessage(ChatColor.LIGHT_PURPLE + "To " + msged.getDisplayName().toString() + ChatColor.GRAY + ": " + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "Boop!");
            } else {
            	p.sendMessage(ChatColor.RED + "Player is not online!");
            }
    	} else {
    		p.sendMessage(ChatColor.RED + "Usage: /boop (player)");
    	}
        return true;
    }

}
