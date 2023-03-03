package com.starsng.sng_arsenal;

import com.starsng.sng_arsenal.util.RegistryHandler;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
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
	
	@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientModEvents
	{
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {}
	}
}
