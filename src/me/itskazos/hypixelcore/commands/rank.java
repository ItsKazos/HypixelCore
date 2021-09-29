package me.itskazos.hypixelcore.commands;

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

import net.minecraft.server.v1_8_R3.ItemStack;
import net.minecraft.server.v1_8_R3.EntityHuman;
import net.minecraft.server.v1_8_R3.Item;
import net.minecraft.server.v1_8_R3.NBTTagCompound;
import net.minecraft.server.v1_8_R3.NBTTagList;
import net.minecraft.server.v1_8_R3.NBTTagString;
import net.minecraft.server.v1_8_R3.StatisticList;

public class rank implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    	Player p = (Player) sender;
    	if(p.hasPermission("hypixelcore.staff.rank")) {
        	if (args.length > 1) {
	            Player ranked = Bukkit.getPlayer(args[0]);
	            if (ranked != null) {
	            	if (args[1].equalsIgnoreCase("owner")) {
			            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.RED + "OWNER");
			            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.RED + "OWNER");
			            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set owner");
	            	} else {

		            	if (args[1].equalsIgnoreCase("admin")) {
				            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.RED + "ADMIN");
				            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.RED + "ADMIN");
				            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set admin");
		            	} else {

			            	if (args[1].equalsIgnoreCase("mod")) {
					            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.DARK_GREEN + "MOD");
					            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.DARK_GREEN + "MOD");
					            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set mod");
			            	} else {

				            	if (args[1].equalsIgnoreCase("helper")) {
						            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.BLUE + "HELPER");
						            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.BLUE + "HELPER");
						            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set helper");
				            	} else {

					            	if (args[1].equalsIgnoreCase("jrhelper")) {
							            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.BLUE + "JR HELPER");
							            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.BLUE + "JR HELPER");
							            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set jrhelper");
					            	} else {

						            	if (args[1].equalsIgnoreCase("minidev")) {
								            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.LIGHT_PURPLE + "MINI-DEV");
								            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.LIGHT_PURPLE + "MINI-DEV");
								            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set minidev");
						            	} else {

							            	if (args[1].equalsIgnoreCase("buildteam")) {
									            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.DARK_AQUA + "BUILD TEAM");
									            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.DARK_AQUA + "BUILD TEAM");
									            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set buildteam");
							            	} else {

								            	if (args[1].equalsIgnoreCase("youtube")) {
										            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.WHITE + "YOUTUBE");
										            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.WHITE + "YOUTUBE");
										            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set youtube");
								            	} else {

									            	if (args[1].equalsIgnoreCase("downer")) {
											            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.RED + "D.OWNER");
											            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.RED + "D.OWNER");
											            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set downer");
									            	} else {
			
										            	if (args[1].equalsIgnoreCase("dadmin")) {
												            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.RED + "D.ADMIN");
												            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.RED + "D.ADMIN");
												            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set dadmin");
										            	} else {
			
											            	if (args[1].equalsIgnoreCase("dmod")) {
													            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.DARK_GREEN + "D.MOD");
													            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.DARK_GREEN + "D.MOD");
													            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set dmod");
											            	} else {
			
												            	if (args[1].equalsIgnoreCase("dhelper")) {
														            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.BLUE + "D.HELPER");
														            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.BLUE + "D.HELPER");
														            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set dhelper");
												            	} else {
			
													            	if (args[1].equalsIgnoreCase("mvp++")) {
															            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.GOLD + "MVP" + ChatColor.RED + "++");
															            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.GOLD + "MVP" + ChatColor.RED + "++");
															            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set mvp++");
													            	} else {
			
														            	if (args[1].equalsIgnoreCase("mvp+")) {
																            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.AQUA + "MVP" + ChatColor.RED + "+");
																            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.AQUA + "MVP" + ChatColor.RED + "+");
																            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set mvp+");
														            	} else {
			
															            	if (args[1].equalsIgnoreCase("mvp")) {
																	            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.AQUA + "MVP");
																	            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.AQUA + "MVP");
																	            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set mvp");
															            	} else {
			
																            	if (args[1].equalsIgnoreCase("vip+")) {
																		            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.GREEN + "VIP" + ChatColor.GOLD + "+");
																		            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.GREEN + "VIP" + ChatColor.GOLD + "+");
																		            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set vip+");
																            	} else {
			
																	            	if (args[1].equalsIgnoreCase("vip")) {
																			            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.GREEN + "VIP");
																			            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.GREEN + "VIP");
																			            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set vip");
																	            	} else {
			
																		            	if (args[1].equalsIgnoreCase("default")) {
																				            p.sendMessage(ChatColor.GREEN + ranked.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.GRAY + "DEFAULT");
																				            ranked.sendMessage(ChatColor.GREEN + "You are now " + ChatColor.GRAY + "DEFAULT");
																				            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + ranked.getName().toString() + " parent set default");
																		            	} else {
																		            		p.sendMessage(ChatColor.RED + "Unknown rank!");
																		            	}
																            		}
															            		}
														            		}
														            	}
													            	}
												            	}
											            	}
										            	}
									            	}
								            	}
							            	}
						            	}
					            	}
				            	}
			            	}
		            	}
	            	}
	            } else {
	            	OfflinePlayer rankedoffline = Bukkit.getOfflinePlayer(args[0]);
	            	if (args[1].equalsIgnoreCase("owner")) {
			            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.RED + "OWNER");
			            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set owner");
	            	} else {

		            	if (args[1].equalsIgnoreCase("admin")) {
				            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.RED + "ADMIN");
				            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set admin");
		            	} else {

			            	if (args[1].equalsIgnoreCase("mod")) {
					            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.DARK_GREEN + "MOD");
					            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set mod");
			            	} else {

				            	if (args[1].equalsIgnoreCase("helper")) {
						            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.BLUE + "HELPER");
						            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set helper");
				            	} else {

					            	if (args[1].equalsIgnoreCase("jrhelper")) {
							            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.BLUE + "JR HELPER");
							            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set jrhelper");
					            	} else {

						            	if (args[1].equalsIgnoreCase("minidev")) {
								            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.LIGHT_PURPLE + "MINI-DEV");
								            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set minidev");
						            	} else {

							            	if (args[1].equalsIgnoreCase("buildteam")) {
									            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.DARK_AQUA + "BUILD TEAM");
									            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set buildteam");
							            	} else {

								            	if (args[1].equalsIgnoreCase("youtube")) {
										            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.WHITE + "YOUTUBE");
										            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set youtube");
								            	} else {

									            	if (args[1].equalsIgnoreCase("downer")) {
											            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.RED + "D.OWNER");
											            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set downer");
									            	} else {
			
										            	if (args[1].equalsIgnoreCase("dadmin")) {
												            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.RED + "D.ADMIN");
												            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set dadmin");
										            	} else {
			
											            	if (args[1].equalsIgnoreCase("dmod")) {
													            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.DARK_GREEN + "D.MOD");
													            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set dmod");
											            	} else {
			
												            	if (args[1].equalsIgnoreCase("dhelper")) {
														            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.BLUE + "D.HELPER");
														            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set dhelper");
												            	} else {
			
													            	if (args[1].equalsIgnoreCase("mvp++")) {
															            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.GOLD + "MVP" + ChatColor.RED + "++");
															            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set mvp++");
													            	} else {
			
														            	if (args[1].equalsIgnoreCase("mvp+")) {
																            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.AQUA + "MVP" + ChatColor.RED + "+");
																            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set mvp+");
														            	} else {
			
															            	if (args[1].equalsIgnoreCase("mvp")) {
																	            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.AQUA + "MVP");
																	            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set mvp");
															            	} else {
			
																            	if (args[1].equalsIgnoreCase("vip+")) {
																		            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.GREEN + "VIP" + ChatColor.GOLD + "+");
																		            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set vip+");
																            	} else {
			
																	            	if (args[1].equalsIgnoreCase("vip")) {
																			            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.GREEN + "VIP");
																			            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set vip");
																	            	} else {
			
																		            	if (args[1].equalsIgnoreCase("default")) {
																				            p.sendMessage(ChatColor.GREEN + rankedoffline.getName().toString() + ChatColor.GREEN + " is now " + ChatColor.GRAY + "DEFAULT");
																				            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + rankedoffline.getName().toString() + " parent set default");
																		            	} else {
																		            		p.sendMessage(ChatColor.RED + "Unknown rank!");
																		            	}
																            		}
															            		}
														            		}
														            	}
													            	}
												            	}
											            	}
										            	}
									            	}
								            	}
							            	}
						            	}
					            	}
				            	}
			            	}
		            	}
	            	}
	            }
        	} else {
        		if (args.length > 0) {
            		Player ranked = Bukkit.getPlayer(args[0]);
            		if (ranked != null) {
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
                        
                        NBTTagCompound staffranks = new NBTTagCompound();
                        staffranks.setString("text", "Now, select a staff rank to issue to " + ranked.getName().toString() + "!");

                        NBTTagCompound regularranks = new NBTTagCompound();
                        regularranks.setString("text", "Now, select a rank to issue to " + ranked.getName().toString() + "!");
                        
                        NBTTagCompound json = new NBTTagCompound();
                        json.setString("text", "\n\n➤ " + ChatColor.RED + "OWNER");
                        json.set("clickEvent", new NBTTagCompound());
                        json.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent = json.getCompound("clickEvent");
                        clickEvent.setString("action", "run_command");
                        clickEvent.setString("value", "/rank " + ranked.getName().toString() + " owner");
                        NBTTagCompound hoverEvent = json.getCompound("hoverEvent");
                        hoverEvent.setString("action", "show_text");
                        hoverEvent.set("value", new NBTTagCompound());
                        hoverEvent.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue = hoverEvent.getCompound("value");
                        hoverValue.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.RED + "OWNER");
                        
                        NBTTagCompound json2 = new NBTTagCompound();
                        json2.setString("text", "\n➤ " + ChatColor.RED + "ADMIN");
                        json2.set("clickEvent", new NBTTagCompound());
                        json2.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent1 = json2.getCompound("clickEvent");
                        clickEvent1.setString("action", "run_command");
                        clickEvent1.setString("value", "/rank " + ranked.getName().toString() + " admin");
                        NBTTagCompound hoverEvent1 = json2.getCompound("hoverEvent");
                        hoverEvent1.setString("action", "show_text");
                        hoverEvent1.set("value", new NBTTagCompound());
                        hoverEvent1.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue1 = hoverEvent1.getCompound("value");
                        hoverValue1.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.RED + "ADMIN");
                        
                        NBTTagCompound json3 = new NBTTagCompound();
                        json3.setString("text", "\n➤ " + ChatColor.DARK_GREEN + "MOD");
                        json3.set("clickEvent", new NBTTagCompound());
                        json3.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent3 = json3.getCompound("clickEvent");
                        clickEvent3.setString("action", "run_command");
                        clickEvent3.setString("value", "/rank " + ranked.getName().toString() + " mod");
                        NBTTagCompound hoverEvent3 = json3.getCompound("hoverEvent");
                        hoverEvent3.setString("action", "show_text");
                        hoverEvent3.set("value", new NBTTagCompound());
                        hoverEvent3.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue3 = hoverEvent3.getCompound("value");
                        hoverValue3.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.DARK_GREEN + "MOD");
                        
                        NBTTagCompound json4 = new NBTTagCompound();
                        json4.setString("text", "\n➤ " + ChatColor.BLUE + "HELPER");
                        json4.set("clickEvent", new NBTTagCompound());
                        json4.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent4 = json4.getCompound("clickEvent");
                        clickEvent4.setString("action", "run_command");
                        clickEvent4.setString("value", "/rank " + ranked.getName().toString() + " helper");
                        NBTTagCompound hoverEvent4 = json4.getCompound("hoverEvent");
                        hoverEvent4.setString("action", "show_text");
                        hoverEvent4.set("value", new NBTTagCompound());
                        hoverEvent4.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue4 = hoverEvent4.getCompound("value");
                        hoverValue4.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.BLUE + "HELPER");
                        
                        NBTTagCompound json5 = new NBTTagCompound();
                        json5.setString("text", "\n➤ " + ChatColor.BLUE + "JR HELPER");
                        json5.set("clickEvent", new NBTTagCompound());
                        json5.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent5 = json5.getCompound("clickEvent");
                        clickEvent5.setString("action", "run_command");
                        clickEvent5.setString("value", "/rank " + ranked.getName().toString() + " jrhelper");
                        NBTTagCompound hoverEvent5 = json5.getCompound("hoverEvent");
                        hoverEvent5.setString("action", "show_text");
                        hoverEvent5.set("value", new NBTTagCompound());
                        hoverEvent5.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue5 = hoverEvent5.getCompound("value");
                        hoverValue5.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.BLUE + "JR HELPER");
                        
                        NBTTagCompound json6 = new NBTTagCompound();
                        json6.setString("text", "\n➤ " + ChatColor.LIGHT_PURPLE + "MINI-DEV");
                        json6.set("clickEvent", new NBTTagCompound());
                        json6.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent6 = json6.getCompound("clickEvent");
                        clickEvent6.setString("action", "run_command");
                        clickEvent6.setString("value", "/rank " + ranked.getName().toString() + " minidev");
                        NBTTagCompound hoverEvent6 = json6.getCompound("hoverEvent");
                        hoverEvent6.setString("action", "show_text");
                        hoverEvent6.set("value", new NBTTagCompound());
                        hoverEvent6.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue6 = hoverEvent6.getCompound("value");
                        hoverValue6.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.LIGHT_PURPLE + "MINI-DEV");
                        
                        NBTTagCompound json7 = new NBTTagCompound();
                        json7.setString("text", "\n➤ " + ChatColor.DARK_AQUA + "BUILD TEAM");
                        json7.set("clickEvent", new NBTTagCompound());
                        json7.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent7 = json7.getCompound("clickEvent");
                        clickEvent7.setString("action", "run_command");
                        clickEvent7.setString("value", "/rank " + ranked.getName().toString() + " buildteam");
                        NBTTagCompound hoverEvent7 = json7.getCompound("hoverEvent");
                        hoverEvent7.setString("action", "show_text");
                        hoverEvent7.set("value", new NBTTagCompound());
                        hoverEvent7.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue7 = hoverEvent7.getCompound("value");
                        hoverValue7.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.DARK_AQUA + "BUILD TEAM");
                        
                        NBTTagCompound json8 = new NBTTagCompound();
                        json8.setString("text", "\n➤ " + ChatColor.WHITE + "YOUTUBE");
                        json8.set("clickEvent", new NBTTagCompound());
                        json8.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent8 = json8.getCompound("clickEvent");
                        clickEvent8.setString("action", "run_command");
                        clickEvent8.setString("value", "/rank " + ranked.getName().toString() + " youtube");
                        NBTTagCompound hoverEvent8 = json8.getCompound("hoverEvent");
                        hoverEvent8.setString("action", "show_text");
                        hoverEvent8.set("value", new NBTTagCompound());
                        hoverEvent8.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue8 = hoverEvent8.getCompound("value");
                        hoverValue8.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.WHITE + "YOUTUBE");
                        
                        NBTTagCompound json9 = new NBTTagCompound();
                        json9.setString("text", "\n➤ " + ChatColor.RED + "D.OWNER");
                        json9.set("clickEvent", new NBTTagCompound());
                        json9.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent9 = json9.getCompound("clickEvent");
                        clickEvent9.setString("action", "run_command");
                        clickEvent9.setString("value", "/rank " + ranked.getName().toString() + " downer");
                        NBTTagCompound hoverEvent9 = json9.getCompound("hoverEvent");
                        hoverEvent9.setString("action", "show_text");
                        hoverEvent9.set("value", new NBTTagCompound());
                        hoverEvent9.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue9 = hoverEvent9.getCompound("value");
                        hoverValue9.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.RED + "D.OWNER");
                        
                        NBTTagCompound json10 = new NBTTagCompound();
                        json10.setString("text", "\n➤ " + ChatColor.RED + "D.ADMIN");
                        json10.set("clickEvent", new NBTTagCompound());
                        json10.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent10 = json10.getCompound("clickEvent");
                        clickEvent10.setString("action", "run_command");
                        clickEvent10.setString("value", "/rank " + ranked.getName().toString() + " dadmin");
                        NBTTagCompound hoverEvent10 = json10.getCompound("hoverEvent");
                        hoverEvent10.setString("action", "show_text");
                        hoverEvent10.set("value", new NBTTagCompound());
                        hoverEvent10.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue10 = hoverEvent10.getCompound("value");
                        hoverValue10.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.RED + "D.ADMIN");
                        
                        NBTTagCompound json11 = new NBTTagCompound();
                        json11.setString("text", "\n➤ " + ChatColor.DARK_GREEN + "D.MOD");
                        json11.set("clickEvent", new NBTTagCompound());
                        json11.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent11 = json11.getCompound("clickEvent");
                        clickEvent11.setString("action", "run_command");
                        clickEvent11.setString("value", "/rank " + ranked.getName().toString() + " dmod");
                        NBTTagCompound hoverEvent11 = json11.getCompound("hoverEvent");
                        hoverEvent11.setString("action", "show_text");
                        hoverEvent11.set("value", new NBTTagCompound());
                        hoverEvent11.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue11 = hoverEvent11.getCompound("value");
                        hoverValue11.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.DARK_GREEN + "D.MOD");
                        
                        NBTTagCompound json12 = new NBTTagCompound();
                        json12.setString("text", "\n➤ " + ChatColor.BLUE + "D.HELPER");
                        json12.set("clickEvent", new NBTTagCompound());
                        json12.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent12 = json12.getCompound("clickEvent");
                        clickEvent12.setString("action", "run_command");
                        clickEvent12.setString("value", "/rank " + ranked.getName().toString() + " dhelper");
                        NBTTagCompound hoverEvent12 = json12.getCompound("hoverEvent");
                        hoverEvent12.setString("action", "show_text");
                        hoverEvent12.set("value", new NBTTagCompound());
                        hoverEvent12.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue12 = hoverEvent12.getCompound("value");
                        hoverValue12.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.BLUE + "D.HELPER");
                        
                        NBTTagCompound json13 = new NBTTagCompound();
                        json13.setString("text", "\n➤ " + ChatColor.GOLD + "MVP" + ChatColor.RED + "++");
                        json13.set("clickEvent", new NBTTagCompound());
                        json13.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent13 = json13.getCompound("clickEvent");
                        clickEvent13.setString("action", "run_command");
                        clickEvent13.setString("value", "/rank " + ranked.getName().toString() + " mvp++");
                        NBTTagCompound hoverEvent13 = json13.getCompound("hoverEvent");
                        hoverEvent13.setString("action", "show_text");
                        hoverEvent13.set("value", new NBTTagCompound());
                        hoverEvent13.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue13 = hoverEvent13.getCompound("value");
                        hoverValue13.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.GOLD + "MVP" + ChatColor.RED + "++");
                        
                        NBTTagCompound json14 = new NBTTagCompound();
                        json14.setString("text", "\n➤ " + ChatColor.AQUA + "MVP" + ChatColor.RED + "+");
                        json14.set("clickEvent", new NBTTagCompound());
                        json14.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent14 = json14.getCompound("clickEvent");
                        clickEvent14.setString("action", "run_command");
                        clickEvent14.setString("value", "/rank " + ranked.getName().toString() + " mvp+");
                        NBTTagCompound hoverEvent14 = json14.getCompound("hoverEvent");
                        hoverEvent14.setString("action", "show_text");
                        hoverEvent14.set("value", new NBTTagCompound());
                        hoverEvent14.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue14 = hoverEvent14.getCompound("value");
                        hoverValue14.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.AQUA + "MVP" + ChatColor.RED + "+");

                        NBTTagCompound json15 = new NBTTagCompound();
                        json15.setString("text", "\n➤ " + ChatColor.AQUA + "MVP");
                        json15.set("clickEvent", new NBTTagCompound());
                        json15.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent15 = json15.getCompound("clickEvent");
                        clickEvent15.setString("action", "run_command");
                        clickEvent15.setString("value", "/rank " + ranked.getName().toString() + " mvp");
                        NBTTagCompound hoverEvent15 = json15.getCompound("hoverEvent");
                        hoverEvent15.setString("action", "show_text");
                        hoverEvent15.set("value", new NBTTagCompound());
                        hoverEvent15.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue15 = hoverEvent15.getCompound("value");
                        hoverValue15.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.AQUA + "MVP");

                        NBTTagCompound json16 = new NBTTagCompound();
                        json16.setString("text", "\n➤ " + ChatColor.GREEN + "VIP" + ChatColor.GOLD + "+");
                        json16.set("clickEvent", new NBTTagCompound());
                        json16.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent16 = json16.getCompound("clickEvent");
                        clickEvent16.setString("action", "run_command");
                        clickEvent16.setString("value", "/rank " + ranked.getName().toString() + " vip+");
                        NBTTagCompound hoverEvent16 = json16.getCompound("hoverEvent");
                        hoverEvent16.setString("action", "show_text");
                        hoverEvent16.set("value", new NBTTagCompound());
                        hoverEvent16.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue16 = hoverEvent16.getCompound("value");
                        hoverValue16.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.GREEN + "VIP" + ChatColor.GOLD + "+");

                        NBTTagCompound json17 = new NBTTagCompound();
                        json17.setString("text", "\n➤ " + ChatColor.GREEN + "VIP");
                        json17.set("clickEvent", new NBTTagCompound());
                        json17.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent17 = json17.getCompound("clickEvent");
                        clickEvent17.setString("action", "run_command");
                        clickEvent17.setString("value", "/rank " + ranked.getName().toString() + " vip");
                        NBTTagCompound hoverEvent17 = json17.getCompound("hoverEvent");
                        hoverEvent17.setString("action", "show_text");
                        hoverEvent17.set("value", new NBTTagCompound());
                        hoverEvent17.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue17 = hoverEvent17.getCompound("value");
                        hoverValue17.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.GREEN + "VIP");

                        NBTTagCompound json18 = new NBTTagCompound();
                        json18.setString("text", "\n➤ " + ChatColor.GRAY + "DEFAULT");
                        json18.set("clickEvent", new NBTTagCompound());
                        json18.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent18 = json18.getCompound("clickEvent");
                        clickEvent18.setString("action", "run_command");
                        clickEvent18.setString("value", "/rank " + ranked.getName().toString() + " default");
                        NBTTagCompound hoverEvent18 = json18.getCompound("hoverEvent");
                        hoverEvent18.setString("action", "show_text");
                        hoverEvent18.set("value", new NBTTagCompound());
                        hoverEvent18.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue18 = hoverEvent18.getCompound("value");
                        hoverValue18.setString("text", "Click here to set " + ranked.getName().toString() + "'s rank to " + ChatColor.GRAY + "DEFAULT");
                        
                        pages.add(new NBTTagString("[" + regularranks.toString() + "," + json8.toString() + "," + json9.toString() + "," + json10.toString() + "," + json11.toString() + "," + json12.toString() + "," + json13.toString() + "," + json14.toString() + "," + json15.toString() + "," + json16.toString() + "," + json17.toString() + "," + json18.toString() + "]"));
                        pages.add(new NBTTagString("[" + staffranks.toString() + "," + json.toString() + "," + json2.toString() + "," + json3.toString() + "," + json4.toString() + "," + json5.toString() + "," + json6.toString() + "," + json7.toString() + "]"));
                        
                        tag.set("pages", pages);
                        book.setTag(tag);
                        org.bukkit.inventory.ItemStack hand = p.getItemInHand();
                        p.setItemInHand(CraftItemStack.asBukkitCopy(book));
                        entityHuman.openBook(book);
                        p.setItemInHand(hand);
                        entityHuman.b(StatisticList.USE_ITEM_COUNT[387]);
            		} else {
            			OfflinePlayer rankedoffline = Bukkit.getOfflinePlayer(args[0]);
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

                        NBTTagCompound staffranks = new NBTTagCompound();
                        staffranks.setString("text", "Now, select a staff rank to issue to " + rankedoffline.getName().toString() + "!");

                        NBTTagCompound regularranks = new NBTTagCompound();
                        regularranks.setString("text", "Now, select a rank to issue to " + rankedoffline.getName().toString() + "!");
                        
                        NBTTagCompound json = new NBTTagCompound();
                        json.setString("text", "\n\n➤ " + ChatColor.RED + "OWNER");
                        json.set("clickEvent", new NBTTagCompound());
                        json.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent = json.getCompound("clickEvent");
                        clickEvent.setString("action", "run_command");
                        clickEvent.setString("value", "/rank " + rankedoffline.getName().toString() + " owner");
                        NBTTagCompound hoverEvent = json.getCompound("hoverEvent");
                        hoverEvent.setString("action", "show_text");
                        hoverEvent.set("value", new NBTTagCompound());
                        hoverEvent.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue = hoverEvent.getCompound("value");
                        hoverValue.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.RED + "OWNER");
                        
                        NBTTagCompound json2 = new NBTTagCompound();
                        json2.setString("text", "\n➤ " + ChatColor.RED + "ADMIN");
                        json2.set("clickEvent", new NBTTagCompound());
                        json2.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent1 = json2.getCompound("clickEvent");
                        clickEvent1.setString("action", "run_command");
                        clickEvent1.setString("value", "/rank " + rankedoffline.getName().toString() + " admin");
                        NBTTagCompound hoverEvent1 = json2.getCompound("hoverEvent");
                        hoverEvent1.setString("action", "show_text");
                        hoverEvent1.set("value", new NBTTagCompound());
                        hoverEvent1.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue1 = hoverEvent1.getCompound("value");
                        hoverValue1.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.RED + "ADMIN");
                        
                        NBTTagCompound json3 = new NBTTagCompound();
                        json3.setString("text", "\n➤ " + ChatColor.DARK_GREEN + "MOD");
                        json3.set("clickEvent", new NBTTagCompound());
                        json3.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent3 = json3.getCompound("clickEvent");
                        clickEvent3.setString("action", "run_command");
                        clickEvent3.setString("value", "/rank " + rankedoffline.getName().toString() + " mod");
                        NBTTagCompound hoverEvent3 = json3.getCompound("hoverEvent");
                        hoverEvent3.setString("action", "show_text");
                        hoverEvent3.set("value", new NBTTagCompound());
                        hoverEvent3.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue3 = hoverEvent3.getCompound("value");
                        hoverValue3.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.DARK_GREEN + "MOD");
                        
                        NBTTagCompound json4 = new NBTTagCompound();
                        json4.setString("text", "\n➤ " + ChatColor.BLUE + "HELPER");
                        json4.set("clickEvent", new NBTTagCompound());
                        json4.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent4 = json4.getCompound("clickEvent");
                        clickEvent4.setString("action", "run_command");
                        clickEvent4.setString("value", "/rank " + rankedoffline.getName().toString() + " helper");
                        NBTTagCompound hoverEvent4 = json4.getCompound("hoverEvent");
                        hoverEvent4.setString("action", "show_text");
                        hoverEvent4.set("value", new NBTTagCompound());
                        hoverEvent4.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue4 = hoverEvent4.getCompound("value");
                        hoverValue4.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.BLUE + "HELPER");
                        
                        NBTTagCompound json5 = new NBTTagCompound();
                        json5.setString("text", "\n➤ " + ChatColor.BLUE + "JR HELPER");
                        json5.set("clickEvent", new NBTTagCompound());
                        json5.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent5 = json5.getCompound("clickEvent");
                        clickEvent5.setString("action", "run_command");
                        clickEvent5.setString("value", "/rank " + rankedoffline.getName().toString() + " jrhelper");
                        NBTTagCompound hoverEvent5 = json5.getCompound("hoverEvent");
                        hoverEvent5.setString("action", "show_text");
                        hoverEvent5.set("value", new NBTTagCompound());
                        hoverEvent5.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue5 = hoverEvent5.getCompound("value");
                        hoverValue5.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.BLUE + "JR HELPER");
                        
                        NBTTagCompound json6 = new NBTTagCompound();
                        json6.setString("text", "\n➤ " + ChatColor.LIGHT_PURPLE + "MINI-DEV");
                        json6.set("clickEvent", new NBTTagCompound());
                        json6.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent6 = json6.getCompound("clickEvent");
                        clickEvent6.setString("action", "run_command");
                        clickEvent6.setString("value", "/rank " + rankedoffline.getName().toString() + " minidev");
                        NBTTagCompound hoverEvent6 = json6.getCompound("hoverEvent");
                        hoverEvent6.setString("action", "show_text");
                        hoverEvent6.set("value", new NBTTagCompound());
                        hoverEvent6.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue6 = hoverEvent6.getCompound("value");
                        hoverValue6.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.LIGHT_PURPLE + "MINI-DEV");
                        
                        NBTTagCompound json7 = new NBTTagCompound();
                        json7.setString("text", "\n➤ " + ChatColor.DARK_AQUA + "BUILD TEAM");
                        json7.set("clickEvent", new NBTTagCompound());
                        json7.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent7 = json7.getCompound("clickEvent");
                        clickEvent7.setString("action", "run_command");
                        clickEvent7.setString("value", "/rank " + rankedoffline.getName().toString() + " buildteam");
                        NBTTagCompound hoverEvent7 = json7.getCompound("hoverEvent");
                        hoverEvent7.setString("action", "show_text");
                        hoverEvent7.set("value", new NBTTagCompound());
                        hoverEvent7.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue7 = hoverEvent7.getCompound("value");
                        hoverValue7.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.DARK_AQUA + "BUILD TEAM");
                        
                        NBTTagCompound json8 = new NBTTagCompound();
                        json8.setString("text", "\n➤ " + ChatColor.WHITE + "YOUTUBE");
                        json8.set("clickEvent", new NBTTagCompound());
                        json8.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent8 = json8.getCompound("clickEvent");
                        clickEvent8.setString("action", "run_command");
                        clickEvent8.setString("value", "/rank " + rankedoffline.getName().toString() + " youtube");
                        NBTTagCompound hoverEvent8 = json8.getCompound("hoverEvent");
                        hoverEvent8.setString("action", "show_text");
                        hoverEvent8.set("value", new NBTTagCompound());
                        hoverEvent8.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue8 = hoverEvent8.getCompound("value");
                        hoverValue8.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.WHITE + "YOUTUBE");
                        
                        NBTTagCompound json9 = new NBTTagCompound();
                        json9.setString("text", "\n➤ " + ChatColor.RED + "D.OWNER");
                        json9.set("clickEvent", new NBTTagCompound());
                        json9.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent9 = json9.getCompound("clickEvent");
                        clickEvent9.setString("action", "run_command");
                        clickEvent9.setString("value", "/rank " + rankedoffline.getName().toString() + " downer");
                        NBTTagCompound hoverEvent9 = json9.getCompound("hoverEvent");
                        hoverEvent9.setString("action", "show_text");
                        hoverEvent9.set("value", new NBTTagCompound());
                        hoverEvent9.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue9 = hoverEvent9.getCompound("value");
                        hoverValue9.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.RED + "D.OWNER");
                        
                        NBTTagCompound json10 = new NBTTagCompound();
                        json10.setString("text", "\n➤ " + ChatColor.RED + "D.ADMIN");
                        json10.set("clickEvent", new NBTTagCompound());
                        json10.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent10 = json10.getCompound("clickEvent");
                        clickEvent10.setString("action", "run_command");
                        clickEvent10.setString("value", "/rank " + rankedoffline.getName().toString() + " dadmin");
                        NBTTagCompound hoverEvent10 = json10.getCompound("hoverEvent");
                        hoverEvent10.setString("action", "show_text");
                        hoverEvent10.set("value", new NBTTagCompound());
                        hoverEvent10.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue10 = hoverEvent10.getCompound("value");
                        hoverValue10.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.RED + "D.ADMIN");
                        
                        NBTTagCompound json11 = new NBTTagCompound();
                        json11.setString("text", "\n➤ " + ChatColor.DARK_GREEN + "D.MOD");
                        json11.set("clickEvent", new NBTTagCompound());
                        json11.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent11 = json11.getCompound("clickEvent");
                        clickEvent11.setString("action", "run_command");
                        clickEvent11.setString("value", "/rank " + rankedoffline.getName().toString() + " dmod");
                        NBTTagCompound hoverEvent11 = json11.getCompound("hoverEvent");
                        hoverEvent11.setString("action", "show_text");
                        hoverEvent11.set("value", new NBTTagCompound());
                        hoverEvent11.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue11 = hoverEvent11.getCompound("value");
                        hoverValue11.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.DARK_GREEN + "D.MOD");
                        
                        NBTTagCompound json12 = new NBTTagCompound();
                        json12.setString("text", "\n➤ " + ChatColor.BLUE + "D.HELPER");
                        json12.set("clickEvent", new NBTTagCompound());
                        json12.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent12 = json12.getCompound("clickEvent");
                        clickEvent12.setString("action", "run_command");
                        clickEvent12.setString("value", "/rank " + rankedoffline.getName().toString() + " dhelper");
                        NBTTagCompound hoverEvent12 = json12.getCompound("hoverEvent");
                        hoverEvent12.setString("action", "show_text");
                        hoverEvent12.set("value", new NBTTagCompound());
                        hoverEvent12.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue12 = hoverEvent12.getCompound("value");
                        hoverValue12.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.BLUE + "D.HELPER");
                        
                        NBTTagCompound json13 = new NBTTagCompound();
                        json13.setString("text", "\n➤ " + ChatColor.GOLD + "MVP" + ChatColor.RED + "++");
                        json13.set("clickEvent", new NBTTagCompound());
                        json13.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent13 = json13.getCompound("clickEvent");
                        clickEvent13.setString("action", "run_command");
                        clickEvent13.setString("value", "/rank " + rankedoffline.getName().toString() + " mvp++");
                        NBTTagCompound hoverEvent13 = json13.getCompound("hoverEvent");
                        hoverEvent13.setString("action", "show_text");
                        hoverEvent13.set("value", new NBTTagCompound());
                        hoverEvent13.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue13 = hoverEvent13.getCompound("value");
                        hoverValue13.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.GOLD + "MVP" + ChatColor.RED + "++");
                        
                        NBTTagCompound json14 = new NBTTagCompound();
                        json14.setString("text", "\n➤ " + ChatColor.AQUA + "MVP" + ChatColor.RED + "+");
                        json14.set("clickEvent", new NBTTagCompound());
                        json14.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent14 = json14.getCompound("clickEvent");
                        clickEvent14.setString("action", "run_command");
                        clickEvent14.setString("value", "/rank " + rankedoffline.getName().toString() + " mvp+");
                        NBTTagCompound hoverEvent14 = json14.getCompound("hoverEvent");
                        hoverEvent14.setString("action", "show_text");
                        hoverEvent14.set("value", new NBTTagCompound());
                        hoverEvent14.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue14 = hoverEvent14.getCompound("value");
                        hoverValue14.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.AQUA + "MVP" + ChatColor.RED + "+");

                        NBTTagCompound json15 = new NBTTagCompound();
                        json15.setString("text", "\n➤ " + ChatColor.AQUA + "MVP");
                        json15.set("clickEvent", new NBTTagCompound());
                        json15.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent15 = json15.getCompound("clickEvent");
                        clickEvent15.setString("action", "run_command");
                        clickEvent15.setString("value", "/rank " + rankedoffline.getName().toString() + " mvp");
                        NBTTagCompound hoverEvent15 = json15.getCompound("hoverEvent");
                        hoverEvent15.setString("action", "show_text");
                        hoverEvent15.set("value", new NBTTagCompound());
                        hoverEvent15.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue15 = hoverEvent15.getCompound("value");
                        hoverValue15.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.AQUA + "MVP");

                        NBTTagCompound json16 = new NBTTagCompound();
                        json16.setString("text", "\n➤ " + ChatColor.GREEN + "VIP" + ChatColor.GOLD + "+");
                        json16.set("clickEvent", new NBTTagCompound());
                        json16.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent16 = json16.getCompound("clickEvent");
                        clickEvent16.setString("action", "run_command");
                        clickEvent16.setString("value", "/rank " + rankedoffline.getName().toString() + " vip+");
                        NBTTagCompound hoverEvent16 = json16.getCompound("hoverEvent");
                        hoverEvent16.setString("action", "show_text");
                        hoverEvent16.set("value", new NBTTagCompound());
                        hoverEvent16.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue16 = hoverEvent16.getCompound("value");
                        hoverValue16.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.GREEN + "VIP" + ChatColor.GOLD + "+");

                        NBTTagCompound json17 = new NBTTagCompound();
                        json17.setString("text", "\n➤ " + ChatColor.GREEN + "VIP");
                        json17.set("clickEvent", new NBTTagCompound());
                        json17.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent17 = json17.getCompound("clickEvent");
                        clickEvent17.setString("action", "run_command");
                        clickEvent17.setString("value", "/rank " + rankedoffline.getName().toString() + " vip");
                        NBTTagCompound hoverEvent17 = json17.getCompound("hoverEvent");
                        hoverEvent17.setString("action", "show_text");
                        hoverEvent17.set("value", new NBTTagCompound());
                        hoverEvent17.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue17 = hoverEvent17.getCompound("value");
                        hoverValue17.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.GREEN + "VIP");

                        NBTTagCompound json18 = new NBTTagCompound();
                        json18.setString("text", "\n➤ " + ChatColor.GRAY + "DEFAULT");
                        json18.set("clickEvent", new NBTTagCompound());
                        json18.set("hoverEvent", new NBTTagCompound());
                        
                        NBTTagCompound clickEvent18 = json18.getCompound("clickEvent");
                        clickEvent18.setString("action", "run_command");
                        clickEvent18.setString("value", "/rank " + rankedoffline.getName().toString() + " default");
                        NBTTagCompound hoverEvent18 = json18.getCompound("hoverEvent");
                        hoverEvent18.setString("action", "show_text");
                        hoverEvent18.set("value", new NBTTagCompound());
                        hoverEvent18.setString("insertion", "what is this?");
                        NBTTagCompound hoverValue18 = hoverEvent18.getCompound("value");
                        hoverValue18.setString("text", "Click here to set " + rankedoffline.getName().toString() + "'s rank to " + ChatColor.GRAY + "DEFAULT");
                        
                        pages.add(new NBTTagString("[" + regularranks.toString() + "," + json8.toString() + "," + json9.toString() + "," + json10.toString() + "," + json11.toString() + "," + json12.toString() + "," + json13.toString() + "," + json14.toString() + "," + json15.toString() + "," + json16.toString() + "," + json17.toString() + "," + json18.toString() + "]"));
                        pages.add(new NBTTagString("[" + staffranks.toString() + "," + json.toString() + "," + json2.toString() + "," + json3.toString() + "," + json4.toString() + "," + json5.toString() + "," + json6.toString() + "," + json7.toString() + "]"));
                        
                        tag.set("pages", pages);
                        book.setTag(tag);
                        org.bukkit.inventory.ItemStack hand = p.getItemInHand();
                        p.setItemInHand(CraftItemStack.asBukkitCopy(book));
                        entityHuman.openBook(book);
                        p.setItemInHand(hand);
                        entityHuman.b(StatisticList.USE_ITEM_COUNT[387]);
            		}
        		} else {
                	p.sendMessage(ChatColor.RED + "Usage: /rank (player) [rank]");
            	}
        	}
    	} else {
    		p.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
    	}
        return true;
    }
}
