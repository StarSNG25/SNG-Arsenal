package com.starsng.sng_arsenal;

import com.starsng.sng_arsenal.util.RegistryHandler;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(SngArsenal.MODID)
public class SngArsenal
{
	public static final String MODID = "sng_arsenal";
	
	public SngArsenal(IEventBus modEventBus)
	{
		new RegistryHandler(modEventBus);
	}
}
