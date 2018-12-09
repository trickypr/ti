package com.trickypr.tinyImprovements.blocks;

import com.trickypr.tinyImprovements.Main;
import com.trickypr.tinyImprovements.init.ModBlocks;
import com.trickypr.tinyImprovements.init.ModItems;
import com.trickypr.tinyImprovements.util.IHasModel;

import net.minecraft.block.BlockChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ChestTest extends BlockChest implements IHasModel {
	public ChestTest(Type chestTypeIn, String name) {
		super(chestTypeIn);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void regesterModels() {
		Main.proxy.regesterItemRender(Item.getItemFromBlock(this), 0, "inventory");
	}
}
