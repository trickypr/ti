package com.trickypr.tinyImprovements.init;

import java.util.ArrayList;
import java.util.List;

import com.trickypr.tinyImprovements.blocks.BlockBase;
import com.trickypr.tinyImprovements.blocks.EndPodiumBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block END_PODIUM_BORDER_STRAIGHT_SECOND = new EndPodiumBase("end_podium_border_straight_second", Material.BARRIER, CreativeTabs.DECORATIONS);
	public static final Block END_PODIUM_BORDER_STRAIGHT = new EndPodiumBase("end_podium_border_straight", Material.BARRIER, CreativeTabs.DECORATIONS);
	
	public static final Block END_PODIUM_CORNER_1 = new EndPodiumBase("end_podium_border_straight_second", Material.BARRIER, CreativeTabs.DECORATIONS);
	public static final Block END_PODIUM_CORNER_2 = new EndPodiumBase("end_podium_border_straight", Material.BARRIER, CreativeTabs.DECORATIONS);
	public static final Block END_PODIUM_CORNER_3 = new EndPodiumBase("end_podium_border_straight_second", Material.BARRIER, CreativeTabs.DECORATIONS);
	public static final Block END_PODIUM_CORNER_4 = new EndPodiumBase("end_podium_border_straight", Material.BARRIER, CreativeTabs.DECORATIONS);
}
