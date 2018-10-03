package com.trickypr.tinyImprovements.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.SoundType;

public class EndPodiumBase extends BlockBase {
	public EndPodiumBase(String name, CreativeTabs tab) {
		super(name, Material.BARRIER, tab);
		
		setSoundType(SoundType.STONE);
		
		setLightLevel(1f);
		setBlockUnbreakable();
	}
}
