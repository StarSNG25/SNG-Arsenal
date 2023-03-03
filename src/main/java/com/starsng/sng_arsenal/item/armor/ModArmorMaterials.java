package com.starsng.sng_arsenal.item.armor;

import java.util.function.Supplier;
import com.starsng.sng_arsenal.item.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModArmorMaterials implements ArmorMaterial
{
	SNG("sng", 50, new int[]{5, 8, 10, 5}, 20, SoundEvents.ARMOR_EQUIP_IRON, 5.0f, 0.3f, () ->
	{
		return Ingredient.of(ModItems.SNG_INGOT.get());
	}),
	CONDENSED_SNG("condensed_sng", 100, new int[]{10, 16, 20, 10}, 22, SoundEvents.ARMOR_EQUIP_IRON, 10.0f, 0.6f, () ->
	{
		return Ingredient.of(ModItems.CONDENSED_SNG_INGOT.get());
	});
	
	private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] slotProtections;
	private final int enchantmentValue;
	private final SoundEvent sound;
	private final float toughness;
	private final float knockbackResistance;
	private final Supplier<Ingredient> repairIngredient;
	
	private ModArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient)
	{
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.slotProtections = slotProtections;
		this.enchantmentValue = enchantmentValue;
		this.sound = sound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient;
	}
	
	@Override
	public int getDurabilityForSlot(EquipmentSlot slot)
	{
		return HEALTH_PER_SLOT[slot.getIndex()] * durabilityMultiplier;
	}
	
	@Override
	public int getDefenseForSlot(EquipmentSlot slot)
	{
		return slotProtections[slot.getIndex()];
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
