package com.starsng.sng_arsenal;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import com.starsng.sng_arsenal.util.RegistryHandler;
import com.starsng.sng_arsenal.world.gen.OreGeneration;

@Mod(SngArsenal.MODID)
public class SngArsenal
{
	public static final String MODID = "sng_arsenal";
	
	public SngArsenal()
	{
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		modEventBus.addListener(this::setup);
		new RegistryHandler(modEventBus);
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
	}
}
