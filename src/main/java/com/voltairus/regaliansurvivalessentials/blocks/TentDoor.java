package com.voltairus.regaliansurvivalessentials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TentDoor extends DoorBlock {

    public TentDoor(Properties builder) {
        super(Block.Properties.create(Material.WOOD)
                .hardnessAndResistance(5f,5f)
                .sound(SoundType.CLOTH)
                .harvestLevel(1)
                .harvestTool(ToolType.AXE));
    }
}
