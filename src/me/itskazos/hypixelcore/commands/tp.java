package me.itskazos.hypixelcore.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tp implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    	Player p = (Player) sender;
    	if(p.hasPermission("hypixelcore.staff.tp")) {
	    	if (args.length > 0) {
	    		Player tpplayer = Bukkit.getPlayer(args[0]);
	            if (tpplayer != null) {
		            p.sendMessage(ChatColor.GREEN + "Teleported to " + tpplayer.getDisplayName().toString());
		            p.teleport(tpplayer.getLocation());
	            } else {
	            	p.sendMessage(ChatColor.RED + "Player is not online!");
	            }
	    	} else {
	    		p.sendMessage(ChatColor.RED + "Usage: /tp (player)");
	    	}
    	} else {
    		p.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
    	}
        return true;
    }

}
