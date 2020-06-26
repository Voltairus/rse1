package com.voltairus.regaliansurvivalessentials.util;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ToolMaterialList implements IItemTier {

    // int harvestLevel, int maxUses, float efficiency, float attackDamage, int
    // enchantability, Supplier<Ingredient> repairMaterial


    TUNGSTEN(4, 1500, 6.0F, 2.0F, 250, () -> {
        return Ingredient.fromItems(RegistryHandler.TUNGSTEN_INGOT.get());
    }),
    PLASTIC(1, 2000, 2.0F, 1.0F, 10, () -> {
        return Ingredient.fromItems(RegistryHandler.HARDENED_PLASTIC.get());
    });

    private final int harvestLevel, maxUses, enchantability;
    private final float efficiency, attackDamage;
    private final LazyValue<Ingredient> repairMaterial;

    private ToolMaterialList(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,
                         Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}