package com.voltairus.regaliansurvivalessentials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TungstenBlock extends Block {

    public TungstenBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(25f,900f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE));
    }
}
