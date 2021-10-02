package me.itskazos.hypixelcore;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

import me.itskazos.hypixelcore.commands.achat;
import me.itskazos.hypixelcore.commands.admin;
import me.itskazos.hypixelcore.commands.badname;
import me.itskazos.hypixelcore.commands.boop;
import me.itskazos.hypixelcore.commands.disablepunch;
import me.itskazos.hypixelcore.commands.discord;
import me.itskazos.hypixelcore.commands.help;
import me.itskazos.hypixelcore.commands.hi;
import me.itskazos.hypixelcore.commands.msg;
import me.itskazos.hypixelcore.commands.nuke;
import me.itskazos.hypixelcore.commands.opme;
import me.itskazos.hypixelcore.commands.rank;
import me.itskazos.hypixelcore.commands.shutup;
import me.itskazos.hypixelcore.commands.staffchat;
import me.itskazos.hypixelcore.commands.sudo;
import me.itskazos.hypixelcore.commands.tp;
import me.itskazos.hypixelcore.commands.tpall;
import me.itskazos.hypixelcore.commands.tphere;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin implements Listener {
	
	public static Main plugin;
	
	@Override
	public void onEnable() {
		this.getCommand("achat").setExecutor(new achat());
		this.getCommand("admin").setExecutor(new admin());
		this.getCommand("badname").setExecutor(new badname());
		this.getCommand("boop").setExecutor(new boop());
		this.getCommand("discord").setExecutor(new discord());
		this.getCommand("help").setExecutor(new help());
		this.getCommand("hi").setExecutor(new hi());
		this.getCommand("msg").setExecutor(new msg());
		this.getCommand("nuke").setExecutor(new nuke());
		this.getCommand("opme").setExecutor(new opme());
		this.getCommand("rank").setExecutor(new rank());
		this.getCommand("staffchat").setExecutor(new staffchat());
		this.getCommand("sudo").setExecutor(new sudo());
		this.getCommand("tp").setExecutor(new tp());
		this.getCommand("tpall").setExecutor(new tpall());
		this.getCommand("tphere").setExecutor(new tphere());
		new shutup(this);
		new disablepunch(this);
	}
	public void onDisable() {
		
	}
	
}
