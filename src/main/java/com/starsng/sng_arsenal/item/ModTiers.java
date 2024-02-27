package com.starsng.sng_arsenal.item;

import java.util.function.Supplier;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModTiers implements Tier
{
	SNG(5, 3500, 12.0f, 6.0f, 20, () ->
	{
		return Ingredient.of(ModItems.SNG_INGOT.get());
	}),
	CONDENSED_SNG(6, 7000, 24.0f, 12.0f, 22, () ->
	{
		return Ingredient.of(ModItems.CONDENSED_SNG_INGOT.get());
	});
	
	private final int level;
	private final int uses;
	private final float speed;
	private final float damage;
	private final int enchantmentValue;
	private final Supplier<Ingredient> repairIngredient;
	
	ModTiers(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient)
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
		return uses;
	}
	
	@Override
	public float getSpeed()
	{
		return speed;
	}
	
	@Override
	public float getAttackDamageBonus()
	{
		return damage;
	}
	
	@Override
	public int getLevel()
	{
		return level;
	}
	
	@Override
	public int getEnchantmentValue()
	{
		return enchantmentValue;
	}
	
	@Override
	public Ingredient getRepairIngredient()
	{
		return repairIngredient.get();
	}
}
