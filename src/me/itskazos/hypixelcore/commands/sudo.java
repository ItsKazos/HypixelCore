package me.itskazos.hypixelcore.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sudo implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    	Player p = (Player) sender;
    	if(p.hasPermission("hypixelcore.staff.sudo")) {
        	if (args.length > 1) {
	        	String arguments = "";
	            for(int i = 1; i < args.length; i++){
	                String arg = args[i] + " ";
	                arguments = arguments + arg;
	            }
	            Player sudoed = Bukkit.getPlayer(args[0]);
	            if (sudoed != null) {
		            sudoed.chat(arguments);
		            p.sendMessage(ChatColor.GREEN + "Forced " + sudoed.getDisplayName().toString() + ChatColor.GREEN + " to send the message " + ChatColor.WHITE + arguments);
	            } else { 
	            	p.sendMessage(ChatColor.RED + "Player is not online!");
	            }
        	} else {
        		p.sendMessage(ChatColor.RED + "Usage: /sudo (player) (message)");
        	}
    	} else {
    		p.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
    	}
        return true;
    }

}
