package me.itskazos.hypixelcore.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.itskazos.hypixelcore.Main;

public class shutup implements CommandExecutor, Listener {
	
	public shutup(Main sh) {
		sh.getCommand("shutup").setExecutor(this);
		sh.getServer().getPluginManager().registerEvents(this, sh);
	}

	public boolean shutup = false;
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    	Player p = (Player) sender;
    	if(p.hasPermission("hypixelcore.staff.shutup")) {
    		if (shutup) {
	            for(Player player : Bukkit.getOnlinePlayers()) {
	            	if(player.hasPermission("hypixelcore.staff.shutupbypass")) {
	            		player.sendMessage(ChatColor.AQUA + "[STAFF] " + p.getDisplayName().toString() + ChatColor.GRAY + ": " + ChatColor.WHITE + "Unmuted the chat");
	            	} else {
	            		player.sendMessage(ChatColor.GREEN + "You are now allowed to speak!");
	            	}
	            }
    		} else {
	            for(Player player : Bukkit.getOnlinePlayers()) {
	            	if(player.hasPermission("hypixelcore.staff.shutupbypass")) {
	            		player.sendMessage(ChatColor.AQUA + "[STAFF] " + p.getDisplayName().toString() + ChatColor.GRAY + ": " + ChatColor.WHITE + "Muted the chat");
	            	} else {
	            		player.sendMessage(ChatColor.RED + "You are no longer allowed to speak!");
	            	}
	            }
    		}
    		if (shutup) {
    			shutup = false;
    		} else {
    			shutup = true;
    		}
    	} else { 
    		p.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
    	}
        return true;
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
    	if (shutup) {
    		Player p = e.getPlayer();
    		if (p.hasPermission("hypixelcore.staff.shutupbypass")) {
    			p.sendMessage(ChatColor.GREEN + "The chat is currently muted, but you have permission to bypass it.");
    		} else {
    			p.sendMessage(ChatColor.RED + "You aren't allowed to speak!");
    			e.setCancelled(true);
    		}
    	}
    }
}
