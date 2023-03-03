package com.starsng.sng_arsenal.item;

import com.starsng.sng_arsenal.SngArsenal;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = SngArsenal.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs
{
	public static CreativeModeTab SNG_ARSENAL;
	
	@SubscribeEvent
	public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event)
	{
		SNG_ARSENAL = event.registerCreativeModeTab(
				new ResourceLocation(SngArsenal.MODID, "sng_arsenal"),
				builder -> builder.icon(() -> new ItemStack(ModItems.SNG_INGOT.get())).title(Component.literal("SNG Arsenal")).build()
		);
    }
}
