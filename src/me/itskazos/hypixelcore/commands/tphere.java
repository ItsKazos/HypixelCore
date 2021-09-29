package me.itskazos.hypixelcore.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tphere implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    	Player p = (Player) sender;
    	if(p.hasPermission("hypixelcore.staff.tphere")) {
	    	if (args.length > 0) {
	    		Player tpplayer = Bukkit.getPlayer(args[0]);
	            if (tpplayer != null) {
		            p.sendMessage(ChatColor.GREEN + "Teleported " + tpplayer.getDisplayName().toString() + ChatColor.GREEN + " to you");
		            tpplayer.teleport(p.getLocation());
	            } else {
	            	p.sendMessage(ChatColor.RED + "Player is not online!");
	            }
	    	} else {
	    		p.sendMessage(ChatColor.RED + "Usage: /tphere (player)");
	    	}
    	} else {
    		p.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
    	}
        return true;
    }

}
