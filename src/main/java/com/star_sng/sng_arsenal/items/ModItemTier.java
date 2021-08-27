package com.star_sng.sng_arsenal.items;

import java.util.function.Supplier;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ModItemTier implements IItemTier
{
	SNG(5, 3500, 12.0f, 6.0f, 20, () ->
	{
		return Ingredient.of(ModItems.SNG_INGOT.get());
	}
	),
	CONDENSED_SNG(6, 7000, 18.0f, 9.0f, 20, () ->
	{
		return Ingredient.of(ModItems.CONDENSED_SNG_INGOT.get());
	}
	);
	
	private final int level;
	private final int uses;
	private final float speed;
	private final float damage;
	private final int enchantmentValue;
	private final Supplier<Ingredient> repairIngredient;
	
	ModItemTier(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient)
	{
		this.level = level;
		this.uses = uses;
		this.speed = speed;
		this.damage = damage;
		this.enchantmentValue = enchantmentValue;
		this.repairIngredient = repairIngredient;
	}
	
	@Override
	public int getUses()
	{
		return this.uses;
	}

	@Override
	public float getSpeed()
	{
		return this.speed;
	}

	@Override
	public float getAttackDamageBonus()
	{
		return this.damage;
	}

	@Override
	public int getLevel()
	{
		return this.level;
	}

	@Override
	public int getEnchantmentValue()
	{
		return this.enchantmentValue;
	}

	@Override
	public Ingredient getRepairIngredient()
	{
		return this.repairIngredient.get();
	}
	
}
