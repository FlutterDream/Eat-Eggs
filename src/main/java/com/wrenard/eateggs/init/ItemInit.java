package com.wrenard.eateggs.init;

import com.wrenard.eateggs.EatEggs;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = EatEggs.MOD_ID, bus = Bus.MOD)
@ObjectHolder(EatEggs.MOD_ID)
public class ItemInit 
{
	public static final Item cooked_egg = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(1.0f).meat().build())).setRegistryName("cooked_egg"));
	}

}
