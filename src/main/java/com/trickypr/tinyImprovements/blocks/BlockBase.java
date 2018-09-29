package com.trickypr.tinyImprovements.blocks;

import com.trickypr.tinyImprovements.Main;
import com.trickypr.tinyImprovements.init.ModBlocks;
import com.trickypr.tinyImprovements.init.ModItems;
import com.trickypr.tinyImprovements.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	public BlockBase(String name, Material material, CreativeTabs tab) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		if (tab != null) {
			setCreativeTab(tab);
		}
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void regesterModels() {
		Main.proxy.regesterItemRender(Item.getItemFromBlock(this), 0, "inventory");
	}
}
