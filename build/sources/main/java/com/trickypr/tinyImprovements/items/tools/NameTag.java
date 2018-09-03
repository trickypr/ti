package com.trickypr.tinyImprovements.items.tools;

import com.trickypr.tinyImprovements.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

public class NameTag extends ItemBase {
	private String colorValue; 

	public NameTag(String name, CreativeTabs tab, String color) {
		super(name, tab);
		colorValue = color;
	}
	
	public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target, EnumHand hand)
    {
        if (stack.hasDisplayName() && !(target instanceof EntityPlayer))
        {
            target.setCustomNameTag(colorValue + stack.getDisplayName());

            if (target instanceof EntityLiving)
            {
                ((EntityLiving)target).enablePersistence();
            }

            stack.shrink(1);
            return true;
        }
        else
        {
            return false;
        }
    }
}
