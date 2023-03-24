package com.starsng.sng_arsenal.util;

import com.starsng.sng_arsenal.SngArsenal;
import com.starsng.sng_arsenal.blocks.ModBlocks;
import com.starsng.sng_arsenal.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SngArsenal.MODID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SngArsenal.MODID);
	
	public RegistryHandler(IEventBus modEventBus)
	{
		ITEMS.register(modEventBus);
		BLOCKS.register(modEventBus);
		
		new ModItems();
		new ModBlocks();
	}
}
