package com.trickypr.tinyImprovements.init;

import java.util.ArrayList;
import java.util.List;

import com.trickypr.tinyImprovements.items.tools.BedCompass;
import com.trickypr.tinyImprovements.items.tools.NameTag;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Colored name tags 
	public static final Item NT_RED = new NameTag("red_name_tag", CreativeTabs.TOOLS, "§c");
	public static final Item NT_GREEN = new NameTag("green_name_tag", CreativeTabs.TOOLS, "§a");
	public static final Item NT_BROWN = new NameTag("brown_name_tag", CreativeTabs.TOOLS, "§4");
	public static final Item NT_LAPUS = new NameTag("lapus_name_tag", CreativeTabs.TOOLS, "§1");
	public static final Item NT_PURPLE = new NameTag("purple_name_tag", CreativeTabs.TOOLS, "§5");	
	public static final Item NT_CYAN = new NameTag("cyan_name_tag", CreativeTabs.TOOLS, "§b");
	public static final Item NT_LIGHT_GREY = new NameTag("light_grey_name_tag", CreativeTabs.TOOLS, "§7");
	public static final Item NT_GREY = new NameTag("grey_name_tag", CreativeTabs.TOOLS, "§8");
	public static final Item NT_PINK = new NameTag("pink_name_tag", CreativeTabs.TOOLS, "§d");
	public static final Item NT_LIME = new NameTag("lime_name_tag", CreativeTabs.TOOLS, "§a");
	public static final Item NT_YELLOW = new NameTag("yellow_name_tag", CreativeTabs.TOOLS, "§e");
	public static final Item NT_LIGHT_BLUE = new NameTag("blue_name_tag", CreativeTabs.TOOLS, "§9");
	public static final Item NT_MAGENTA = new NameTag("magenta_name_tag", CreativeTabs.TOOLS, "§d");
	public static final Item NT_ORANGE = new NameTag("orange_name_tag", CreativeTabs.TOOLS, "§6");
	public static final Item NT_BLACK = new NameTag("black_name_tag", CreativeTabs.TOOLS, "§0");
	
	// Testing
	public static final Item BED_COMPASS = new BedCompass("bed_compass", CreativeTabs.TOOLS);
}