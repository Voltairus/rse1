package com.voltairus.regaliansurvivalessentials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ScaffoldedConcrete extends Block {

    public ScaffoldedConcrete() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(35f,1900f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE));
    }
}
