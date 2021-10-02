package me.itskazos.hypixelcore.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftHumanEntity;
import org.bukkit.craftbukkit.v1_8_R3.inventory.CraftItemStack;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_8_R3.EntityHuman;
import net.minecraft.server.v1_8_R3.Item;
import net.minecraft.server.v1_8_R3.ItemStack;
import net.minecraft.server.v1_8_R3.NBTTagCompound;
import net.minecraft.server.v1_8_R3.NBTTagList;
import net.minecraft.server.v1_8_R3.NBTTagString;
import net.minecraft.server.v1_8_R3.StatisticList;

public class admin implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    	Player p = (Player) sender;
    	if (args.length < 1) {
	        HumanEntity humanEntity = (HumanEntity) p;
	        CraftHumanEntity craftHumanityEntity = (CraftHumanEntity) humanEntity;
	        EntityHuman entityHuman = craftHumanityEntity.getHandle();
	        
	        ItemStack book = new ItemStack(Item.getById(387));
	        NBTTagCompound tag = new NBTTagCompound();
	        tag.setString("author", "ItsKazos");
	        tag.setString("title", "Hi");
	        tag.set("display", new NBTTagCompound());
	        
	        NBTTagCompound display = tag.getCompound("display");
	        display.setString("Name", ChatColor.translateAlternateColorCodes('&', "Book GUI"));
	        NBTTagList lore = new NBTTagList();
	        lore.add(new NBTTagString("If you see this, please report it to an admin!"));
	        display.set("Lore", lore);
	        NBTTagList pages = new NBTTagList();
	
	        NBTTagCompound paneltitle = new NBTTagCompound();
	        paneltitle.setString("text", "Welcome to the admin panel, " + p.getName().toString() + "!");
	
	        NBTTagCompound json = new NBTTagCompound();
	        json.setString("text", "\n\n➤ Enter Admin Mode");
	        json.set("clickEvent", new NBTTagCompound());
	        json.set("hoverEvent", new NBTTagCompound());
	        
	        NBTTagCompound clickEvent = json.getCompound("clickEvent");
	        clickEvent.setString("action", "run_command");
	        clickEvent.setString("value", "/admin mode");
	        NBTTagCompound hoverEvent = json.getCompound("hoverEvent");
	        hoverEvent.setString("action", "show_text");
	        hoverEvent.set("value", new NBTTagCompound());
	        hoverEvent.setString("insertion", "what is this?");
	        NBTTagCompound hoverValue = hoverEvent.getCompound("value");
	        hoverValue.setString("text", "Click here to enter admin mode!");
	
	        NBTTagCompound json1 = new NBTTagCompound();
	        json1.setString("text", "\n➤ Manage Players");
	        json1.set("clickEvent", new NBTTagCompound());
	        json1.set("hoverEvent", new NBTTagCompound());
	        
	        NBTTagCompound clickEvent1 = json1.getCompound("clickEvent");
	        clickEvent1.setString("action", "run_command");
	        clickEvent1.setString("value", "/admin players");
	        NBTTagCompound hoverEvent1 = json1.getCompound("hoverEvent");
	        hoverEvent1.setString("action", "show_text");
	        hoverEvent1.set("value", new NBTTagCompound());
	        hoverEvent1.setString("insertion", "what is this?");
	        NBTTagCompound hoverValue1 = hoverEvent1.getCompound("value");
	        hoverValue1.setString("text", "Click here to manage online players!");
	
	        NBTTagCompound json2 = new NBTTagCompound();
	        json2.setString("text", "\n➤ Manage Staff");
	        json2.set("clickEvent", new NBTTagCompound());
	        json2.set("hoverEvent", new NBTTagCompound());
	        
	        NBTTagCompound clickEvent2 = json2.getCompound("clickEvent");
	        clickEvent2.setString("action", "run_command");
	        clickEvent2.setString("value", "/admin staff");
	        NBTTagCompound hoverEvent2 = json2.getCompound("hoverEvent");
	        hoverEvent2.setString("action", "show_text");
	        hoverEvent2.set("value", new NBTTagCompound());
	        hoverEvent2.setString("insertion", "what is this?");
	        NBTTagCompound hoverValue2 = hoverEvent2.getCompound("value");
	        hoverValue2.setString("text", "Click here to manage online staff!");
	        
	        pages.add(new NBTTagString("[" + paneltitle.toString() + "," + json.toString() + "," + json1.toString() + "," + json2.toString() + "]"));
	        
	        tag.set("pages", pages);
	        book.setTag(tag);
	        org.bukkit.inventory.ItemStack hand = p.getItemInHand();
	        p.setItemInHand(CraftItemStack.asBukkitCopy(book));
	        entityHuman.openBook(book);
	        p.setItemInHand(hand);
	        entityHuman.b(StatisticList.USE_ITEM_COUNT[387]);
    	} else {
    		if (args[0].equalsIgnoreCase("mode")) {
    	        HumanEntity humanEntity = (HumanEntity) p;
    	        CraftHumanEntity craftHumanityEntity = (CraftHumanEntity) humanEntity;
    	        EntityHuman entityHuman = craftHumanityEntity.getHandle();
    	        
    	        ItemStack book = new ItemStack(Item.getById(387));
    	        NBTTagCompound tag = new NBTTagCompound();
    	        tag.setString("author", "ItsKazos");
    	        tag.setString("title", "Hi");
    	        tag.set("display", new NBTTagCompound());
    	        
    	        NBTTagCompound display = tag.getCompound("display");
    	        display.setString("Name", ChatColor.translateAlternateColorCodes('&', "Book GUI"));
    	        NBTTagList lore = new NBTTagList();
    	        lore.add(new NBTTagString("If you see this, please report it to an admin!"));
    	        display.set("Lore", lore);
    	        NBTTagList pages = new NBTTagList();
    	
    	        NBTTagCompound paneltitle = new NBTTagCompound();
    	        paneltitle.setString("text", "Welcome to the admin panel, " + p.getName().toString() + "!");
    	
    	        NBTTagCompound json = new NBTTagCompound();
    	        json.setString("text", "\n\n➤ Enter Admin Mode");
    	        json.set("clickEvent", new NBTTagCompound());
    	        json.set("hoverEvent", new NBTTagCompound());
    	        
    	        NBTTagCompound clickEvent = json.getCompound("clickEvent");
    	        clickEvent.setString("action", "run_command");
    	        clickEvent.setString("value", "/rank owner");
    	        NBTTagCompound hoverEvent = json.getCompound("hoverEvent");
    	        hoverEvent.setString("action", "show_text");
    	        hoverEvent.set("value", new NBTTagCompound());
    	        hoverEvent.setString("insertion", "what is this?");
    	        NBTTagCompound hoverValue = hoverEvent.getCompound("value");
    	        hoverValue.setString("text", "Click here to enter admin mode!");
    	
    	        NBTTagCompound json1 = new NBTTagCompound();
    	        json1.setString("text", "\n➤ Manage Players");
    	        json1.set("clickEvent", new NBTTagCompound());
    	        json1.set("hoverEvent", new NBTTagCompound());
    	        
    	        NBTTagCompound clickEvent1 = json1.getCompound("clickEvent");
    	        clickEvent1.setString("action", "run_command");
    	        clickEvent1.setString("value", "/admin players");
    	        NBTTagCompound hoverEvent1 = json1.getCompound("hoverEvent");
    	        hoverEvent1.setString("action", "show_text");
    	        hoverEvent1.set("value", new NBTTagCompound());
    	        hoverEvent1.setString("insertion", "what is this?");
    	        NBTTagCompound hoverValue1 = hoverEvent1.getCompound("value");
    	        hoverValue1.setString("text", "Click here to manage online players!");
    	
    	        NBTTagCompound json2 = new NBTTagCompound();
    	        json2.setString("text", "\n➤ Manage Staff");
    	        json2.set("clickEvent", new NBTTagCompound());
    	        json2.set("hoverEvent", new NBTTagCompound());
    	        
    	        NBTTagCompound clickEvent2 = json2.getCompound("clickEvent");
    	        clickEvent2.setString("action", "run_command");
    	        clickEvent2.setString("value", "/admin staff");
    	        NBTTagCompound hoverEvent2 = json2.getCompound("hoverEvent");
    	        hoverEvent2.setString("action", "show_text");
    	        hoverEvent2.set("value", new NBTTagCompound());
    	        hoverEvent2.setString("insertion", "what is this?");
    	        NBTTagCompound hoverValue2 = hoverEvent2.getCompound("value");
    	        hoverValue2.setString("text", "Click here to manage online staff!");
    	        
    	        pages.add(new NBTTagString("[" + paneltitle.toString() + "," + json.toString() + "," + json1.toString() + "," + json2.toString() + "]"));
    	        
    	        tag.set("pages", pages);
    	        book.setTag(tag);
    	        org.bukkit.inventory.ItemStack hand = p.getItemInHand();
    	        p.setItemInHand(CraftItemStack.asBukkitCopy(book));
    	        entityHuman.openBook(book);
    	        p.setItemInHand(hand);
    	        entityHuman.b(StatisticList.USE_ITEM_COUNT[387]);
    		} else {

        		if (args[0].equalsIgnoreCase("players")) {
        			if (args.length > 1) {
	        	        HumanEntity humanEntity = (HumanEntity) p;
	        	        CraftHumanEntity craftHumanityEntity = (CraftHumanEntity) humanEntity;
	        	        EntityHuman entityHuman = craftHumanityEntity.getHandle();
	        	        
	        	        ItemStack book = new ItemStack(Item.getById(387));
	        	        NBTTagCompound tag = new NBTTagCompound();
	        	        tag.setString("author", "ItsKazos");
	        	        tag.setString("title", "Hi");
	        	        tag.set("display", new NBTTagCompound());
	        	        
	        	        NBTTagCompound display = tag.getCompound("display");
	        	        display.setString("Name", ChatColor.translateAlternateColorCodes('&', "Book GUI"));
	        	        NBTTagList lore = new NBTTagList();
	        	        lore.add(new NBTTagString("If you see this, please report it to an admin!"));
	        	        display.set("Lore", lore);
	        	        NBTTagList pages = new NBTTagList();
	
	        	        NBTTagCompound paneltitle = new NBTTagCompound();
	        	        paneltitle.setString("text", "Select an online player to manage!\n");
	        	        
	        	        List myList = new ArrayList();
	        	        myList.add(paneltitle.toString());
	
	    	            for(Player player : Bukkit.getOnlinePlayers()) {
	            	        NBTTagCompound json1 = new NBTTagCompound();
	            	        json1.setString("text", "\n" + player.getDisplayName().toString());
	            	        json1.set("clickEvent", new NBTTagCompound());
	            	        json1.set("hoverEvent", new NBTTagCompound());
	            	        
	            	        NBTTagCompound clickEvent1 = json1.getCompound("clickEvent");
	            	        clickEvent1.setString("action", "run_command");
	            	        clickEvent1.setString("value", "/admin players " + player.getName());
	            	        NBTTagCompound hoverEvent1 = json1.getCompound("hoverEvent");
	            	        hoverEvent1.setString("action", "show_text");
	            	        hoverEvent1.set("value", new NBTTagCompound());
	            	        hoverEvent1.setString("insertion", "what is this?");
	            	        NBTTagCompound hoverValue1 = hoverEvent1.getCompound("value");
	            	        hoverValue1.setString("text", "Click here to manage " + player.getDisplayName().toString());
	            	        myList.add(json1.toString());
	            	        if (myList.size() == 10) {
	            	        	pages.add(new NBTTagString("[" + myList.toString() + "]"));
	            	        	myList.removeAll(myList);
	                	        myList.add(paneltitle.toString());
	            	        }
	    	            }
	        	        
	    	            pages.add(new NBTTagString("[" + myList.toString() + "]"));
	        	        
	        	        tag.set("pages", pages);
	        	        book.setTag(tag);
	        	        org.bukkit.inventory.ItemStack hand = p.getItemInHand();
	        	        p.setItemInHand(CraftItemStack.asBukkitCopy(book));
	        	        entityHuman.openBook(book);
	        	        p.setItemInHand(hand);
	        	        entityHuman.b(StatisticList.USE_ITEM_COUNT[387]);
        			} else {
	        	        HumanEntity humanEntity = (HumanEntity) p;
	        	        CraftHumanEntity craftHumanityEntity = (CraftHumanEntity) humanEntity;
	        	        EntityHuman entityHuman = craftHumanityEntity.getHandle();
	        	        
	        	        ItemStack book = new ItemStack(Item.getById(387));
	        	        NBTTagCompound tag = new NBTTagCompound();
	        	        tag.setString("author", "ItsKazos");
	        	        tag.setString("title", "Hi");
	        	        tag.set("display", new NBTTagCompound());
	        	        
	        	        NBTTagCompound display = tag.getCompound("display");
	        	        display.setString("Name", ChatColor.translateAlternateColorCodes('&', "Book GUI"));
	        	        NBTTagList lore = new NBTTagList();
	        	        lore.add(new NBTTagString("If you see this, please report it to an admin!"));
	        	        display.set("Lore", lore);
	        	        NBTTagList pages = new NBTTagList();
	
	        	        NBTTagCompound paneltitle = new NBTTagCompound();
	        	        paneltitle.setString("text", "Select an online player to manage!\n");
	        	        
	        	        List myList = new ArrayList();
	        	        myList.add(paneltitle.toString());
	
	    	            for(Player player : Bukkit.getOnlinePlayers()) {
	            	        NBTTagCompound json1 = new NBTTagCompound();
	            	        json1.setString("text", "\n" + player.getDisplayName().toString());
	            	        json1.set("clickEvent", new NBTTagCompound());
	            	        json1.set("hoverEvent", new NBTTagCompound());
	            	        
	            	        NBTTagCompound clickEvent1 = json1.getCompound("clickEvent");
	            	        clickEvent1.setString("action", "run_command");
	            	        clickEvent1.setString("value", "/admin players " + player.getName());
	            	        NBTTagCompound hoverEvent1 = json1.getCompound("hoverEvent");
	            	        hoverEvent1.setString("action", "show_text");
	            	        hoverEvent1.set("value", new NBTTagCompound());
	            	        hoverEvent1.setString("insertion", "what is this?");
	            	        NBTTagCompound hoverValue1 = hoverEvent1.getCompound("value");
	            	        hoverValue1.setString("text", "Click here to manage " + player.getDisplayName().toString());
	            	        myList.add(json1.toString());
	            	        if (myList.size() == 10) {
	            	        	pages.add(new NBTTagString("[" + myList.toString() + "]"));
	            	        	myList.removeAll(myList);
	                	        myList.add(paneltitle.toString());
	            	        }
	    	            }
	        	        
	    	            pages.add(new NBTTagString("[" + myList.toString() + "]"));
	        	        
	        	        tag.set("pages", pages);
	        	        book.setTag(tag);
	        	        org.bukkit.inventory.ItemStack hand = p.getItemInHand();
	        	        p.setItemInHand(CraftItemStack.asBukkitCopy(book));
	        	        entityHuman.openBook(book);
	        	        p.setItemInHand(hand);
	        	        entityHuman.b(StatisticList.USE_ITEM_COUNT[387]);
        				
        			}
        		} else {

            		if (args[0].equalsIgnoreCase("staff")) {
            	        HumanEntity humanEntity = (HumanEntity) p;
            	        CraftHumanEntity craftHumanityEntity = (CraftHumanEntity) humanEntity;
            	        EntityHuman entityHuman = craftHumanityEntity.getHandle();
            	        
            	        ItemStack book = new ItemStack(Item.getById(387));
            	        NBTTagCompound tag = new NBTTagCompound();
            	        tag.setString("author", "ItsKazos");
            	        tag.setString("title", "Hi");
            	        tag.set("display", new NBTTagCompound());
            	        
            	        NBTTagCompound display = tag.getCompound("display");
            	        display.setString("Name", ChatColor.translateAlternateColorCodes('&', "Book GUI"));
            	        NBTTagList lore = new NBTTagList();
            	        lore.add(new NBTTagString("If you see this, please report it to an admin!"));
            	        display.set("Lore", lore);
            	        NBTTagList pages = new NBTTagList();
            	
            	        NBTTagCompound paneltitle = new NBTTagCompound();
            	        paneltitle.setString("text", "Welcome to the admin panel, " + p.getName().toString() + "!");
            	
            	        NBTTagCompound json = new NBTTagCompound();
            	        json.setString("text", "\n\n➤ Enter Admin Mode");
            	        json.set("clickEvent", new NBTTagCompound());
            	        json.set("hoverEvent", new NBTTagCompound());
            	        
            	        NBTTagCompound clickEvent = json.getCompound("clickEvent");
            	        clickEvent.setString("action", "run_command");
            	        clickEvent.setString("value", "/rank owner");
            	        NBTTagCompound hoverEvent = json.getCompound("hoverEvent");
            	        hoverEvent.setString("action", "show_text");
            	        hoverEvent.set("value", new NBTTagCompound());
            	        hoverEvent.setString("insertion", "what is this?");
            	        NBTTagCompound hoverValue = hoverEvent.getCompound("value");
            	        hoverValue.setString("text", "Click here to enter admin mode!");
            	
            	        NBTTagCompound json1 = new NBTTagCompound();
            	        json1.setString("text", "\n➤ Manage Players");
            	        json1.set("clickEvent", new NBTTagCompound());
            	        json1.set("hoverEvent", new NBTTagCompound());
            	        
            	        NBTTagCompound clickEvent1 = json1.getCompound("clickEvent");
            	        clickEvent1.setString("action", "run_command");
            	        clickEvent1.setString("value", "/admin players");
            	        NBTTagCompound hoverEvent1 = json1.getCompound("hoverEvent");
            	        hoverEvent1.setString("action", "show_text");
            	        hoverEvent1.set("value", new NBTTagCompound());
            	        hoverEvent1.setString("insertion", "what is this?");
            	        NBTTagCompound hoverValue1 = hoverEvent1.getCompound("value");
            	        hoverValue1.setString("text", "Click here to manage online players!");
            	
            	        NBTTagCompound json2 = new NBTTagCompound();
            	        json2.setString("text", "\n➤ Manage Staff");
            	        json2.set("clickEvent", new NBTTagCompound());
            	        json2.set("hoverEvent", new NBTTagCompound());
            	        
            	        NBTTagCompound clickEvent2 = json2.getCompound("clickEvent");
            	        clickEvent2.setString("action", "run_command");
            	        clickEvent2.setString("value", "/admin staff");
            	        NBTTagCompound hoverEvent2 = json2.getCompound("hoverEvent");
            	        hoverEvent2.setString("action", "show_text");
            	        hoverEvent2.set("value", new NBTTagCompound());
            	        hoverEvent2.setString("insertion", "what is this?");
            	        NBTTagCompound hoverValue2 = hoverEvent2.getCompound("value");
            	        hoverValue2.setString("text", "Click here to manage online staff!");
            	        
            	        pages.add(new NBTTagString("[" + paneltitle.toString() + "," + json.toString() + "," + json1.toString() + "," + json2.toString() + "]"));
            	        
            	        tag.set("pages", pages);
            	        book.setTag(tag);
            	        org.bukkit.inventory.ItemStack hand = p.getItemInHand();
            	        p.setItemInHand(CraftItemStack.asBukkitCopy(book));
            	        entityHuman.openBook(book);
            	        p.setItemInHand(hand);
            	        entityHuman.b(StatisticList.USE_ITEM_COUNT[387]);
            		} else {
            			
            		}
        		}
    		}
    	}
        return true;
    }

}
