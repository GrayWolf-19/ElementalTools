package com.graywolf19.elementaltools.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CrystalOreBase extends BlockBase
{

	public CrystalOreBase(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
	}

}
