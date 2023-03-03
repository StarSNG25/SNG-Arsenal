package com.starsng.sng_arsenal.item.armor;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class ModArmorItem extends ArmorItem
{
	public ModArmorItem(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot, Properties properties)
	{
		super(armorMaterial, equipmentSlot, properties);
	}
	
	public String getArmorTexture(ItemStack itemStack, Entity entity, EquipmentSlot equipmentSlot, String type)
	{
		String dir = "sng_arsenal:textures/models/armor/";
		
		if (material == ModArmorMaterials.SNG)
			if (equipmentSlot == EquipmentSlot.LEGS)
				return dir + "sng_layer_2.png";
			else
				return dir + "sng_layer_1.png";
		else //if (material == ModArmorMaterial.CONDENSED_SNG)
			if (equipmentSlot == EquipmentSlot.LEGS)
				return dir + "condensed_sng_layer_2.png";
			else
				return dir + "condensed_sng_layer_1.png";
	}
}
