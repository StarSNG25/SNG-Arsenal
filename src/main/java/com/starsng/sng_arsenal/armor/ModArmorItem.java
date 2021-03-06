package com.starsng.sng_arsenal.armor;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class ModArmorItem extends ArmorItem
{
	public ModArmorItem(IArmorMaterial armorMaterial, EquipmentSlotType slotType, Properties properties)
	{
		super(armorMaterial, slotType, properties);
	}
	
	public String getArmorTexture(ItemStack itemStack, Entity entity, EquipmentSlotType slotType, String type)
	{
		if (material == ModArmorMaterial.SNG)
			if (slotType == EquipmentSlotType.LEGS)
				return "sng_arsenal:textures/models/armor/sng_layer_2.png";
			else
				return "sng_arsenal:textures/models/armor/sng_layer_1.png";
		else if (material == ModArmorMaterial.CONDENSED_SNG)
			if (slotType == EquipmentSlotType.LEGS)
				return "sng_arsenal:textures/models/armor/condensed_sng_layer_2.png";
			else
				return "sng_arsenal:textures/models/armor/condensed_sng_layer_1.png";
		else
			return null;
	}
}
