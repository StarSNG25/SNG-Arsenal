package com.starsng.sng_arsenal;

import com.starsng.sng_arsenal.util.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SngArsenal.MODID)
public class SngArsenal
{
	public static final String MODID = "sng_arsenal";
	
	public SngArsenal()
	{
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		new RegistryHandler(modEventBus);
		MinecraftForge.EVENT_BUS.register(this);
	}
}
