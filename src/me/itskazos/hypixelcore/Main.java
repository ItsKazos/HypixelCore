package me.itskazos.hypixelcore;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import me.itskazos.hypixelcore.commands.achat;
import me.itskazos.hypixelcore.commands.achrewards;
import me.itskazos.hypixelcore.commands.admin;
import me.itskazos.hypixelcore.commands.afk;
import me.itskazos.hypixelcore.commands.afkwarp;
import me.itskazos.hypixelcore.commands.badname;
import me.itskazos.hypixelcore.commands.ban;
import me.itskazos.hypixelcore.commands.boop;
import me.itskazos.hypixelcore.commands.booster;
import me.itskazos.hypixelcore.commands.boosteradmin;
import me.itskazos.hypixelcore.commands.bt;
import me.itskazos.hypixelcore.commands.build;
import me.itskazos.hypixelcore.commands.chat;
import me.itskazos.hypixelcore.commands.chatreport;
import me.itskazos.hypixelcore.commands.claimrewards;
import me.itskazos.hypixelcore.commands.clear;
import me.itskazos.hypixelcore.commands.disablepunch;
import me.itskazos.hypixelcore.commands.discord;
import me.itskazos.hypixelcore.commands.emotes;
import me.itskazos.hypixelcore.commands.friend;
import me.itskazos.hypixelcore.commands.gchat;
import me.itskazos.hypixelcore.commands.guild;
import me.itskazos.hypixelcore.commands.help;
import me.itskazos.hypixelcore.commands.hi;
import me.itskazos.hypixelcore.commands.ignore;
import me.itskazos.hypixelcore.commands.kaboom;
import me.itskazos.hypixelcore.commands.kick;
import me.itskazos.hypixelcore.commands.linkaccount;
import me.itskazos.hypixelcore.commands.lobby;
import me.itskazos.hypixelcore.commands.maskrank;
import me.itskazos.hypixelcore.commands.msg;
import me.itskazos.hypixelcore.commands.myposition;
import me.itskazos.hypixelcore.commands.nick;
import me.itskazos.hypixelcore.commands.nuke;
import me.itskazos.hypixelcore.commands.opme;
import me.itskazos.hypixelcore.commands.party;
import me.itskazos.hypixelcore.commands.punish;
import me.itskazos.hypixelcore.commands.rank;
import me.itskazos.hypixelcore.commands.setspawn;
import me.itskazos.hypixelcore.commands.settings;
import me.itskazos.hypixelcore.commands.shutup;
import me.itskazos.hypixelcore.commands.spawnmob;
import me.itskazos.hypixelcore.commands.speed;
import me.itskazos.hypixelcore.commands.staffchat;
import me.itskazos.hypixelcore.commands.sudo;
import me.itskazos.hypixelcore.commands.tp;
import me.itskazos.hypixelcore.commands.tpall;
import me.itskazos.hypixelcore.commands.tphere;
import me.itskazos.hypixelcore.commands.unnick;
import me.itskazos.hypixelcore.commands.vanish;
import me.itskazos.hypixelcore.commands.wdr;

public class Main extends JavaPlugin {
	
	public static Main plugin;
	
	@Override
	public void onEnable() {
		this.getCommand("achat").setExecutor(new achat());
		this.getCommand("achrewards").setExecutor(new achrewards());
		this.getCommand("admin").setExecutor(new admin());
		this.getCommand("afk").setExecutor(new afk());
		this.getCommand("afkwarp").setExecutor(new afkwarp());
		this.getCommand("badname").setExecutor(new badname());
		this.getCommand("ban").setExecutor(new ban());
		this.getCommand("boop").setExecutor(new boop());
		this.getCommand("booster").setExecutor(new booster());
		this.getCommand("boosteradmin").setExecutor(new boosteradmin());
		this.getCommand("bt").setExecutor(new bt());
		this.getCommand("build").setExecutor(new build());
		this.getCommand("chat").setExecutor(new chat());
		this.getCommand("chatreport").setExecutor(new chatreport());
		this.getCommand("claimrewards").setExecutor(new claimrewards());
		this.getCommand("clear").setExecutor(new clear());
		this.getCommand("disablepunch").setExecutor(new disablepunch());
		this.getCommand("discord").setExecutor(new discord());
		this.getCommand("emotes").setExecutor(new emotes());
		this.getCommand("friend").setExecutor(new friend());
		this.getCommand("gchat").setExecutor(new gchat());
		this.getCommand("guild").setExecutor(new guild());
		this.getCommand("help").setExecutor(new help());
		this.getCommand("hi").setExecutor(new hi());
		this.getCommand("ignore").setExecutor(new ignore());
		this.getCommand("kaboom").setExecutor(new kaboom());
		this.getCommand("kick").setExecutor(new kick());
		this.getCommand("linkaccount").setExecutor(new linkaccount());
		this.getCommand("lobby").setExecutor(new lobby());
		this.getCommand("maskrank").setExecutor(new maskrank());
		this.getCommand("msg").setExecutor(new msg());
		this.getCommand("myposition").setExecutor(new myposition());
		this.getCommand("nick").setExecutor(new nick());
		this.getCommand("nuke").setExecutor(new nuke());
		this.getCommand("opme").setExecutor(new opme());
		this.getCommand("party").setExecutor(new party());
		this.getCommand("punish").setExecutor(new punish());
		this.getCommand("rank").setExecutor(new rank());
		this.getCommand("setspawn").setExecutor(new setspawn());
		this.getCommand("settings").setExecutor(new settings());
		this.getCommand("spawnmob").setExecutor(new spawnmob());
		this.getCommand("speed").setExecutor(new speed());
		this.getCommand("staffchat").setExecutor(new staffchat());
		this.getCommand("sudo").setExecutor(new sudo());
		this.getCommand("tp").setExecutor(new tp());
		this.getCommand("tpall").setExecutor(new tpall());
		this.getCommand("tphere").setExecutor(new tphere());
		this.getCommand("unnick").setExecutor(new unnick());
		this.getCommand("vanish").setExecutor(new vanish());
		this.getCommand("wdr").setExecutor(new wdr());
		new shutup(this);
		createFiles();
		plugin = this;
	}
	public void onDisable() {
		
	}
	
	private File configf;
	private FileConfiguration config;
	
	private void createFiles() {
		configf = new File(getDataFolder(), "config.yml");
		
		if (!configf.exists()) {
			configf.getParentFile().mkdirs();
			saveResource("config.yml", false);
		}
		config = new YamlConfiguration();
		
		try {
			config.load(configf);
		} catch (IOException | InvalidConfigurationException e) {
			e.printStackTrace();
		}
	}
	
	
}
