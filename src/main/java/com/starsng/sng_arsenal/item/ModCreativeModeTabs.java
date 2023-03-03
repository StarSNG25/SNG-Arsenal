	package com.starsng.sng_arsenal.item;

import com.starsng.sng_arsenal.SngArsenal;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = SngArsenal.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs
{
	@SubscribeEvent
	public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event)
	{
		event.registerCreativeModeTab(new ResourceLocation(SngArsenal.MODID, "sng_arsenal"),
				builder -> builder
						.title(Component.literal("SNG Arsenal"))
						.icon(() -> new ItemStack(ModItems.SNG_INGOT.get()))
						.displayItems((enabledFlags, populator, hasPermissions) ->
						{
							//Ingredients
							populator.accept(ModItems.RAW_SNG.get());
				        	populator.accept(ModItems.SNG_INGOT.get());
				        	populator.accept(ModItems.CONDENSED_SNG_INGOT.get());
				        	
				        	//Natural Blocks
				        	populator.accept(ModItems.SNG_ORE_ITEM.get());
							populator.accept(ModItems.DEEPSLATE_SNG_ORE_ITEM.get());
							
							//Building Blocks
							populator.accept(ModItems.RAW_SNG_BLOCK_ITEM.get());
							populator.accept(ModItems.SNG_BLOCK_ITEM.get());
							populator.accept(ModItems.CONDENSED_SNG_BLOCK_ITEM.get());
							
							//Combat
							populator.accept(ModItems.SNG_SWORD.get());
							populator.accept(ModItems.SNG_HELMET.get());
							populator.accept(ModItems.SNG_CHESTPLATE.get());
							populator.accept(ModItems.SNG_LEGGINGS.get());
							populator.accept(ModItems.SNG_BOOTS.get());
							populator.accept(ModItems.CONDENSED_SNG_SWORD.get());
							populator.accept(ModItems.CONDENSED_SNG_HELMET.get());
							populator.accept(ModItems.CONDENSED_SNG_CHESTPLATE.get());
							populator.accept(ModItems.CONDENSED_SNG_LEGGINGS.get());
							populator.accept(ModItems.CONDENSED_SNG_BOOTS.get());
							
							//Tools and Utilities
							populator.accept(ModItems.SNG_PICKAXE.get());
							populator.accept(ModItems.SNG_AXE.get());
							populator.accept(ModItems.SNG_SHOVEL.get());
							populator.accept(ModItems.SNG_HOE.get());
							populator.accept(ModItems.FLINT_AND_SNG.get());
							populator.accept(ModItems.SNG_SHEARS.get());
							populator.accept(ModItems.CONDENSED_SNG_PICKAXE.get());
							populator.accept(ModItems.CONDENSED_SNG_AXE.get());
							populator.accept(ModItems.CONDENSED_SNG_SHOVEL.get());
							populator.accept(ModItems.CONDENSED_SNG_HOE.get());
							populator.accept(ModItems.FLINT_AND_CONDENSED_SNG.get());
							populator.accept(ModItems.CONDENSED_SNG_SHEARS.get());
						})
		);
    }
}
