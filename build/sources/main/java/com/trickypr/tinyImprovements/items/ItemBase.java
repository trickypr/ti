package com.trickypr.tinyImprovements.items;

import com.trickypr.tinyImprovements.Main;
import com.trickypr.tinyImprovements.init.ModItems;
import com.trickypr.tinyImprovements.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name, CreativeTabs tab) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void regesterModels() {
		Main.proxy.regesterItemRender(this, 0, "inventory");
	}

}
