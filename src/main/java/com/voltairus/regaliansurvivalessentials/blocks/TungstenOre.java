package com.voltairus.regaliansurvivalessentials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TungstenOre extends Block {

    public TungstenOre() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(8f,5f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE));
    }
}
