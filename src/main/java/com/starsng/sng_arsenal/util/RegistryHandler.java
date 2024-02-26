package com.starsng.sng_arsenal.util;

import com.starsng.sng_arsenal.SngArsenal;
import com.starsng.sng_arsenal.blocks.ModBlocks;
import com.starsng.sng_arsenal.item.ModCreativeModeTabs;
import com.starsng.sng_arsenal.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RegistryHandler
{
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SngArsenal.MODID);
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SngArsenal.MODID);
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SngArsenal.MODID);
	
	public RegistryHandler(IEventBus modEventBus)
	{
		new ModItems(modEventBus);
		new ModBlocks();
		new ModCreativeModeTabs();
		
		ITEMS.register(modEventBus);
		BLOCKS.register(modEventBus);
		CREATIVE_MODE_TABS.register(modEventBus);
	}
}
