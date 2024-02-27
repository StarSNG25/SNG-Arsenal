package com.starsng.sng_arsenal.item.armor;

import java.util.EnumMap;
import java.util.function.Supplier;
import com.starsng.sng_arsenal.item.ModItems;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModArmorMaterials implements ArmorMaterial
{
	SNG("sng", 50, Util.make(new EnumMap<>(ArmorItem.Type.class), (sng) -> {
		sng.put(ArmorItem.Type.BOOTS, 5);
		sng.put(ArmorItem.Type.LEGGINGS, 8);
		sng.put(ArmorItem.Type.CHESTPLATE, 10);
		sng.put(ArmorItem.Type.HELMET, 5);
	}), 20, SoundEvents.ARMOR_EQUIP_IRON, 5.0f, 0.3f, () ->
	{
		return Ingredient.of(ModItems.SNG_INGOT.get());
	}),
	CONDENSED_SNG("condensed_sng", 100, Util.make(new EnumMap<>(ArmorItem.Type.class), (condensedSng) -> {
		condensedSng.put(ArmorItem.Type.BOOTS, 10);
		condensedSng.put(ArmorItem.Type.LEGGINGS, 16);
		condensedSng.put(ArmorItem.Type.CHESTPLATE, 20);
		condensedSng.put(ArmorItem.Type.HELMET, 10);
	}), 22, SoundEvents.ARMOR_EQUIP_IRON, 10.0f, 0.6f, () ->
	{
		return Ingredient.of(ModItems.CONDENSED_SNG_INGOT.get());
	});
	
	private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (armor) ->
	{
		armor.put(ArmorItem.Type.BOOTS, 13);
		armor.put(ArmorItem.Type.LEGGINGS, 15);
		armor.put(ArmorItem.Type.CHESTPLATE, 16);
		armor.put(ArmorItem.Type.HELMET, 11);
	});
	private final String name;
	private final int durabilityMultiplier;
	private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
	private final int enchantmentValue;
	private final SoundEvent sound;
	private final float toughness;
	private final float knockbackResistance;
	private final Supplier<Ingredient> repairIngredient;
	
	private ModArmorMaterials(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionFunctionForType, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient)
	{
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.protectionFunctionForType = protectionFunctionForType;
		this.enchantmentValue = enchantmentValue;
		this.sound = sound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient;
	}
	
	@Override
	public int getDurabilityForType(ArmorItem.Type type)
	{
		return HEALTH_FUNCTION_FOR_TYPE.get(type) * durabilityMultiplier;
	}
	
	@Override
	public int getDefenseForType(ArmorItem.Type type)
	{
		return protectionFunctionForType.get(type);
	}
	
	@Override
	public int getEnchantmentValue()
	{
		return enchantmentValue;
	}
	
	@Override
	public SoundEvent getEquipSound()
	{
		return sound;
	}
	
	@Override
	public Ingredient getRepairIngredient()
	{
		return repairIngredient.get();
	}
	
	@Override
	public String getName()
	{
		return name;
	}
	
	@Override
	public float getToughness()
	{
		return toughness;
	}
	
	@Override
	public float getKnockbackResistance()
	{
		return knockbackResistance;
	}
}
