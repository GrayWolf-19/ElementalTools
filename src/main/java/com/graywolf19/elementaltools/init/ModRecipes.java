package com.graywolf19.elementaltools.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.AMETHYST_ORE, new ItemStack(ModItems.AMETHYST, 2), 1.5f);
		GameRegistry.addSmelting(ModBlocks.AQUAMARINE_ORE, new ItemStack(ModItems.AQUAMARINE, 2), 1.5f);
		GameRegistry.addSmelting(ModBlocks.CITRINE_ORE, new ItemStack(ModItems.CITRINE, 2), 1.5f);
		GameRegistry.addSmelting(ModBlocks.GARNET_ORE, new ItemStack(ModItems.GARNET, 2), 1.5f);
		GameRegistry.addSmelting(ModBlocks.OPAL_ORE, new ItemStack(ModItems.OPAL, 2), 1.5f);
		GameRegistry.addSmelting(ModBlocks.PERIDOT_ORE, new ItemStack(ModItems.PERIDOT, 2), 1.5f);
		GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY, 2), 1.5f);
		GameRegistry.addSmelting(ModBlocks.SAPPHIRE_ORE, new ItemStack(ModItems.SAPPHIRE, 2), 1.5f);
		GameRegistry.addSmelting(ModBlocks.TOPAZ_ORE, new ItemStack(ModItems.TOPAZ, 2), 1.5f);
		GameRegistry.addSmelting(ModBlocks.WHITE_QUARTZ_ORE, new ItemStack(ModItems.WHITE_QUARTZ, 2), 1.5f);
	}
}
