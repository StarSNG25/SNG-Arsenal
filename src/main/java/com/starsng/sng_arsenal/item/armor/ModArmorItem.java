package com.starsng.sng_arsenal.item.armor;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class ModArmorItem extends ArmorItem
{
	public ModArmorItem(IArmorMaterial material, EquipmentSlotType slotType, Properties properties)
	{
		super(material, slotType, properties);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slotType, String type)
	{
		String dir = "sng_arsenal:textures/models/armor/" + material.getName();
		
		switch (slotType)
		{
			case LEGS:
				return dir + "_layer_2.png";
			default:
				return dir + "_layer_1.png";
		}
	}
}
