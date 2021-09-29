package me.itskazos.hypixelcore.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class badname implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    	Player p = (Player) sender;
    	if(p.hasPermission("hypixelcore.staff.badname")) {
        	if (args.length > 0) {
	            for(Player player : Bukkit.getOnlinePlayers()) {
	            	if(player.hasPermission("hypixelcore.staff.badnameview")) {
	            		player.sendMessage(ChatColor.DARK_RED + "[ADMIN] " + p.getDisplayName().toString() + ChatColor.GRAY + ": " + ChatColor.WHITE + "Report of a bad name: " + args[0]);
	            	}
	            }
	            if(p.hasPermission("hypixelcore.staff.badnameview") == false) {
	            	p.sendMessage(ChatColor.DARK_RED + "[ADMIN] " + p.getDisplayName().toString() + ChatColor.GRAY + ": " + ChatColor.WHITE + "Report of a bad name: " + args[0]);
	            }
        	} else {
        		p.sendMessage(ChatColor.RED + "Usage: /badname (username)");
        	}
    	} else {
    		p.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
    	}
        return true;
    }

}
