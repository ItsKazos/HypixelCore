package me.itskazos.hypixelcore.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class msg implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    	Player p = (Player) sender;
    	if (args.length > 1) {
        	String arguments = "";
            for(int i = 1; i < args.length; i++){
                String arg = args[i] + " ";
                arguments = arguments + arg;
            }
    		Player msged = Bukkit.getPlayer(args[0]);
            if (msged != null) {
	            msged.sendMessage(ChatColor.LIGHT_PURPLE + "From " + p.getDisplayName().toString() + ChatColor.GRAY + ": " + arguments);
	            p.sendMessage(ChatColor.LIGHT_PURPLE + "To " + msged.getDisplayName().toString() + ChatColor.GRAY + ": " + arguments);
            } else {
            	p.sendMessage(ChatColor.RED + "Player is not online!");
            }
    	} else {
    		p.sendMessage(ChatColor.RED + "Usage: /msg (player) (message)");
    	}
        return true;
    }

}
