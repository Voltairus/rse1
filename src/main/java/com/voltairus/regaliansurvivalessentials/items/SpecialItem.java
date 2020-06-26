package com.voltairus.regaliansurvivalessentials.items;

import com.voltairus.regaliansurvivalessentials.util.RegistryHandler;
import com.voltairus.regaliansurvivalessentials.util.helpers.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class SpecialItem extends Item {
    public SpecialItem(Properties properties) {
        super(properties);
    }
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (KeyboardHelper.isHoldingShift()) {
            tooltip.add(new StringTextComponent("A special device for calculating the uses of gathered materials."));
        } else {
            tooltip.add(new StringTextComponent("Hold" + "\u00A7e" + " Shift " + "\u00A77" + "for more information!"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        worldIn.playSound(playerIn, playerIn.getPosition(), RegistryHandler.SCANNER.get(), SoundCategory.AMBIENT, 1.0F, 1.0F);
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

}
