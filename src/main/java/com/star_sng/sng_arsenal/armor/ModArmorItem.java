package com.star_sng.sng_arsenal.armor;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class ModArmorItem extends ArmorItem
{
	public ModArmorItem(IArmorMaterial armorMaterial, EquipmentSlotType sllotType, Properties properties)
	{
		super(armorMaterial, sllotType, properties);
	}

	@SuppressWarnings("unchecked")
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType slotType, A _default)
	{
		ModArmorModel model = new ModArmorModel(1.0f);
		
		model.Helmet.visible = slotType == EquipmentSlotType.HEAD;
		model.Chestplate.visible = slotType == EquipmentSlotType.CHEST;
		model.RightSleeve.visible = slotType == EquipmentSlotType.CHEST;
		model.LeftSleeve.visible = slotType == EquipmentSlotType.CHEST;
		model.RightLegging.visible = slotType == EquipmentSlotType.LEGS;
		model.LeftLegging.visible = slotType == EquipmentSlotType.LEGS;
		model.RightBoot.visible = slotType == EquipmentSlotType.FEET;
		model.LeftBoot.visible = slotType == EquipmentSlotType.FEET;
		
		model.young = _default.young;
		model.riding = _default.riding;
		model.crouching = _default.crouching;
		model.rightArmPose = _default.rightArmPose;
		model.leftArmPose = _default.leftArmPose;
		
		return (A) model;
	}
	
	public String getArmorTexture(ItemStack itemStack, Entity entity, EquipmentSlotType slotType, String type)
	{
		if (slotType == EquipmentSlotType.LEGS)
			return "sng_arsenal:textures/models/armor/sng_layer_2.png";
		else
			return "sng_arsenal:textures/models/armor/sng_layer_1.png";
	}
}
