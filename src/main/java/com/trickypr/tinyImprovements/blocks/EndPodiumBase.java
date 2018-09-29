package com.trickypr.tinyImprovements.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.BlockLog;
import net.minecraft.block.SoundType;

public class EndPodiumBase extends BlockBase {
	public EndPodiumBase(String name, Material material, CreativeTabs tab) {
		super(name, material, tab);
		
		setSoundType(SoundType.GROUND);
		
		setLightLevel(14);
		setBlockUnbreakable();
	}
}
