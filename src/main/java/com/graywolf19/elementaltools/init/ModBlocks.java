package com.graywolf19.elementaltools.init;

import java.util.ArrayList;
import java.util.List;

//import com.graywolf19.elementaltools.blocks.BlockBase;
import com.graywolf19.elementaltools.blocks.CrystalOreBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block AMETHYST_ORE = new CrystalOreBase("amethyst_ore", Material.ROCK);
	public static final Block AQUAMARINE_ORE = new CrystalOreBase("aquamarine_ore", Material.ROCK);
	public static final Block CITRINE_ORE = new CrystalOreBase("citrine_ore", Material.ROCK);
	public static final Block GARNET_ORE = new CrystalOreBase("garnet_ore", Material.ROCK);
	public static final Block OPAL_ORE = new CrystalOreBase("opal_ore", Material.ROCK);
	public static final Block PERIDOT_ORE = new CrystalOreBase("peridot_ore", Material.ROCK);
	public static final Block RUBY_ORE = new CrystalOreBase("ruby_ore", Material.ROCK);
	public static final Block SAPPHIRE_ORE = new CrystalOreBase("sapphire_ore", Material.ROCK);
	public static final Block TOPAZ_ORE = new CrystalOreBase("topaz_ore", Material.ROCK);
	public static final Block WHITE_QUARTZ_ORE = new CrystalOreBase("white_quartz_ore", Material.ROCK);
}
