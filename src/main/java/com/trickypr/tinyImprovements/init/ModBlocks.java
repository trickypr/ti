package com.trickypr.tinyImprovements.init;

import java.util.ArrayList;
import java.util.List;

import com.trickypr.tinyImprovements.blocks.EndPodiumBase;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Sides
	public static final Block END_PODIUM_BORDER_STRAIGHT_SECOND = new EndPodiumBase("end_podium_border_straight_second", CreativeTabs.DECORATIONS);
	public static final Block END_PODIUM_BORDER_STRAIGHT = new EndPodiumBase("end_podium_border_straight", CreativeTabs.DECORATIONS);
	
	// Corners
	public static final Block END_PODIUM_CORNER_1 = new EndPodiumBase("end_podium_corner_1", CreativeTabs.DECORATIONS);
	public static final Block END_PODIUM_CORNER_2 = new EndPodiumBase("end_podium_corner_2", CreativeTabs.DECORATIONS);
	public static final Block END_PODIUM_CORNER_3 = new EndPodiumBase("end_podium_corner_3", CreativeTabs.DECORATIONS);
	public static final Block END_PODIUM_CORNER_4 = new EndPodiumBase("end_podium_corner_4", CreativeTabs.DECORATIONS);
	
	// Base / unbreakable end stone
	public static final Block END_STONE_UB = new EndPodiumBase("end_stone_ub", CreativeTabs.DECORATIONS);
}
