package com.starsng.sng_arsenal.item.armor;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class ModArmorItem extends ArmorItem
{
	public ModArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties properties)
	{
		super(material, slot, properties);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type)
	{
		String dir = "sng_arsenal:textures/models/armor/" + material.getName();
		
		switch (slot)
		{
			case LEGS:
				return dir + "_layer_2.png";
			default:
				return dir + "_layer_1.png";
		}
	}
}
