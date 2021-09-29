package me.itskazos.hypixelcore.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class staffchat implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    	Player p = (Player) sender;
    	if(p.hasPermission("hypixelcore.staff.chat")) {
        	if (args.length > 0) {
	        	String arguments = "";
	            for(int i = 0; i < args.length; i++){
	                String arg = args[i] + " ";
	                arguments = arguments + arg;
	            }
	            for(Player player : Bukkit.getOnlinePlayers()) {
	            	if(player.hasPermission("hypixelcore.staff.chat")) {
	            		player.sendMessage(ChatColor.AQUA + "[STAFF] " + p.getDisplayName().toString() + ChatColor.GRAY + ": " + ChatColor.WHITE + arguments);
	            	}
	            }	
        	} else {
        		p.sendMessage(ChatColor.RED + "Usage: /staffchat (message)");
        	}
    	} else {
    		p.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
    	}
        return true;
    }

}
