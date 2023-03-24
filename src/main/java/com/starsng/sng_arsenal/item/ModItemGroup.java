package com.starsng.sng_arsenal.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModItemGroup
{
	public static final ItemGroup TAB_SNG_ARSENAL = new ItemGroup("SNG Arsenal")
	{
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon()
		{
			return new ItemStack(ModItems.SNG_INGOT.get());
		}
	};
}
