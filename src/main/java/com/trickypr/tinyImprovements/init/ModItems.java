package com.trickypr.tinyImprovements.init;

import java.util.ArrayList;
import java.util.List;

import com.trickypr.tinyImprovements.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Colored name tags 
	public static final Item NT_RED = new ItemBase("red_name_tag", CreativeTabs.TOOLS);
	public static final Item NT_GREEN = new ItemBase("green_name_tag", CreativeTabs.TOOLS);
	public static final Item NT_BROWN = new ItemBase("brown_name_tag", CreativeTabs.TOOLS);
	public static final Item NT_LAPUS = new ItemBase("lapus_name_tag", CreativeTabs.TOOLS);
}
