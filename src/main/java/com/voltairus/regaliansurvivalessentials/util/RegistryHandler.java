package com.voltairus.regaliansurvivalessentials.util;

import com.voltairus.regaliansurvivalessentials.RegalianSurvivalEssentials;
import com.voltairus.regaliansurvivalessentials.blocks.*;
import com.voltairus.regaliansurvivalessentials.blocks.TungstenBlock;
import com.voltairus.regaliansurvivalessentials.items.ItemBase;
import com.voltairus.regaliansurvivalessentials.items.ModMusicDiscItem;
import com.voltairus.regaliansurvivalessentials.items.SpecialItem;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, RegalianSurvivalEssentials.MOD_ID);
public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, RegalianSurvivalEssentials.MOD_ID);
public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS, RegalianSurvivalEssentials.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
//The categories below are for general resources, like blocks and items
    // Items
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", ItemBase::new);
    public static final RegistryObject<Item> TUNGSTEN_ROD = ITEMS.register("tungsten_rod", ItemBase::new);
    public static final RegistryObject<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget", ItemBase::new);
    public static final RegistryObject<Item> STRANGE_GLYPH = ITEMS.register("strange_glyph", ItemBase::new);
    public static final RegistryObject<Item> DEATH_BY_LORE = ITEMS.register("death_by_lore", ItemBase::new);
    public static final RegistryObject<Item> HARDENED_PLASTIC = ITEMS.register("hardened_plastic", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> TUNGSTEN_BLOCK = BLOCKS.register("tungsten_block", TungstenBlock::new);
    public static final RegistryObject<Block> TUNGSTEN_ORE = BLOCKS.register("tungsten_ore", TungstenOre::new);
    public static final RegistryObject<Block> GENERIC_CONCRETE = BLOCKS.register("generic_concrete", GenericConcrete::new);
    public static final RegistryObject<Block> REINFORCED_CONCRETE = BLOCKS.register("reinforced_concrete", ReinforcedConcrete::new);
    public static final RegistryObject<Block> SCAFFOLDED_CONCRETE = BLOCKS.register("scaffolded_concrete", ScaffoldedConcrete::new);
    public static final RegistryObject<Block> TENT_DOOR = BLOCKS.register("tent_door", () -> new TentDoor(Block.Properties.from(Blocks.BIRCH_DOOR)));

    //Block Items
    public static final RegistryObject<Item> TUNGSTEN_BLOCK_ITEM = ITEMS.register("tungsten_block",() -> new BlockItemBase(TUNGSTEN_BLOCK.get()));
    public static final RegistryObject<Item> TUNGSTEN_ORE_ITEM = ITEMS.register("tungsten_ore",() -> new BlockItemBase(TUNGSTEN_ORE.get()));
    public static final RegistryObject<Item> GENERIC_CONCRETE_ITEM = ITEMS.register("generic_concrete",() -> new BlockItemBase(GENERIC_CONCRETE.get()));
    public static final RegistryObject<Item> REINFORCED_CONCRETE_ITEM = ITEMS.register("reinforced_concrete",() -> new BlockItemBase(REINFORCED_CONCRETE.get()));
    public static final RegistryObject<Item> SCAFFOLDED_CONCRETE_ITEM = ITEMS.register("scaffolded_concrete",() -> new BlockItemBase(SCAFFOLDED_CONCRETE.get()));
    public static final RegistryObject<Item> TENT_DOOR_ITEM = ITEMS.register("tent_door",() -> new BlockItemBase(TENT_DOOR.get()));

//The categories below are for advanced resources, such as tools, armor, and other special items. Be aware that these are grouped a little differently than the simple categories above.

    //Sounds
    public static final RegistryObject<SoundEvent> SCANNER = SOUNDS.register("item.material_scanner.scanner_beep",
            () -> new SoundEvent(new ResourceLocation(RegalianSurvivalEssentials.MOD_ID, "scanner_beep")));

    public static final Lazy<SoundEvent> DISC_TUNDRA_MUSIC = Lazy
            .of(() -> new SoundEvent(new ResourceLocation(RegalianSurvivalEssentials.MOD_ID, "disc_tundra")));

    //Music Discs
    public static final RegistryObject<Item> DISC_TUNDRA = ITEMS.register("disc_tundra",
            () -> new ModMusicDiscItem(5, RegistryHandler.DISC_TUNDRA_MUSIC.get(),
                    new Item.Properties().group(RegalianSurvivalEssentials.TAB).maxStackSize(1).rarity(Rarity.RARE)));


    //Tools
    public static final RegistryObject<SwordItem> TUNGSTEN_KNIFE = ITEMS.register("tungsten_knife",
            () -> new SwordItem(ToolMaterialList.TUNGSTEN, 7, 0f,
                    new Item.Properties().group(RegalianSurvivalEssentials.TAB)));

    public static final RegistryObject<SwordItem> PLASTIC_TOOL = ITEMS.register("plastic_tool",
            () -> new SwordItem(ToolMaterialList.PLASTIC, 1, 0.8f,
                    new Item.Properties().group(RegalianSurvivalEssentials.TAB)));


    public static final RegistryObject<ArmorItem> TEST_HELMET = ITEMS.register("colonist_helmet",
            () -> new ArmorItem(ArmorMaterialList.COLONIST, EquipmentSlotType.HEAD,
                    new Item.Properties().group(RegalianSurvivalEssentials.TAB)));

    public static final RegistryObject<ArmorItem> TEST_CHESTPLATE = ITEMS.register("colonist_chestplate",
            () -> new ArmorItem(ArmorMaterialList.COLONIST, EquipmentSlotType.CHEST,
                    new Item.Properties().group(RegalianSurvivalEssentials.TAB)));

    public static final RegistryObject<ArmorItem> TEST_LEGGINGS = ITEMS.register("colonist_leggings",
            () -> new ArmorItem(ArmorMaterialList.COLONIST, EquipmentSlotType.LEGS,
                    new Item.Properties().group(RegalianSurvivalEssentials.TAB)));

    public static final RegistryObject<ArmorItem> TEST_BOOTS = ITEMS.register("colonist_boots",
            () -> new ArmorItem(ArmorMaterialList.COLONIST, EquipmentSlotType.FEET,
                    new Item.Properties().group(RegalianSurvivalEssentials.TAB)));

    //Special Tools SUBCATEGORY

    public static final RegistryObject<SpecialItem> MATERIAL_SCANNER = ITEMS.register("material_scanner",
            () -> new SpecialItem(new Item.Properties().group(RegalianSurvivalEssentials.TAB)));

}
