package me.itskazos.hypixelcore.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.util.Vector;

import me.itskazos.hypixelcore.Main;

public class disablepunch implements CommandExecutor, Listener {
	
	public disablepunch(Main punch) {
		punch.getCommand("disablepunch").setExecutor(this);
		punch.getServer().getPluginManager().registerEvents(this, punch);
	}

	public boolean punch = false;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    	Player p = (Player) sender;
    	if(p.hasPermission("hypixelcore.staff.shutup")) {
    		if (punch) {
	            for(Player player : Bukkit.getOnlinePlayers()) {
	            	if(player.hasPermission("hypixelcore.staff.chat")) {
	            		player.sendMessage(ChatColor.AQUA + "[STAFF] " + p.getDisplayName().toString() + ChatColor.GRAY + ": " + ChatColor.WHITE + "Enabled staff punch");
	            	}
	            }
    		} else {
	            for(Player player : Bukkit.getOnlinePlayers()) {
	            	if(player.hasPermission("hypixelcore.staff.chat")) {
	            		player.sendMessage(ChatColor.AQUA + "[STAFF] " + p.getDisplayName().toString() + ChatColor.GRAY + ": " + ChatColor.WHITE + "Disabled staff punch");
	            	}
	            }
    		}
    		if (punch) {
    			punch = false;
    		} else {
    			punch = true;
    		}
    	} else { 
    		p.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
    	}
        return true;
    }

	@EventHandler
	public void onAttack(EntityDamageByEntityEvent e) {
		Player p = (Player) e.getEntity();
		Player dmg = (Player) e.getDamager();
		if (p.hasPermission("hypixelcore.staff.punch")) {
			if (punch == false) {
				Vector up = new Vector(0, 99, 0);
				p.setVelocity(up);
				e.setCancelled(true);
				Bukkit.broadcastMessage(dmg.getDisplayName().toString() + ChatColor.GRAY + " punched " + p.getDisplayName().toString() + ChatColor.GRAY + " into the sky!");
			} else {
				e.setCancelled(true);
			}
		} else {
			e.setCancelled(true);
		}
	}
}
