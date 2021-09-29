package me.itskazos.hypixelcore.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class achat implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    	Player p = (Player) sender;
    	if (args.length > 0) {
        	String arguments = "";
            for(int i = 0; i < args.length; i++){
                String arg = args[i] + " ";
                arguments = arguments + arg;
            }
            p.chat(arguments);
    	} else {
    		p.sendMessage(ChatColor.RED + "Usage: /achat (message)");
    	}
        return true;
    }
}
