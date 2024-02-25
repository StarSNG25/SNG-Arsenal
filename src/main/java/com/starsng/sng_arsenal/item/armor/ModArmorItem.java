package com.starsng.sng_arsenal.item.armor;

import com.starsng.sng_arsenal.SngArsenal;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class ModArmorItem extends ArmorItem
{
	public ModArmorItem(ArmorMaterial material, ArmorItem.Type type, Properties properties)
	{
		super(material, type, properties);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type)
	{
		return SngArsenal.MODID + ":textures/models/armor/" + material.getName() + (slot == EquipmentSlot.LEGS ? "_layer_2.png" : "_layer_1.png");
	}
}
