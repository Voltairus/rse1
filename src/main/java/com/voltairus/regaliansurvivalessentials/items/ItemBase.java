package com.voltairus.regaliansurvivalessentials.items;

import com.voltairus.regaliansurvivalessentials.RegalianSurvivalEssentials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

//this is for the items
public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(RegalianSurvivalEssentials.TAB));
    }
}
