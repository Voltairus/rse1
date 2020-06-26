package com.voltairus.regaliansurvivalessentials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GenericConcrete extends Block {

    public GenericConcrete() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(20f,1000f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE));
    }
}
