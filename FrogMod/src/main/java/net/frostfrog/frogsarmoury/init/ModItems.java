package net.frostfrog.frogsarmoury.init;

import net.frostfrog.frogsarmoury.FrogsArmoury;
import net.frostfrog.frogsarmoury.armour.ModArmourMaterial;
import net.frostfrog.frogsarmoury.client.model.Crown;
import net.frostfrog.frogsarmoury.items.ArmorBaseItem;
import net.frostfrog.frogsarmoury.items.ItemBase;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FrogsArmoury.MOD_ID);

    // Items
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", ItemBase::new);

    // Armours
    // Crown
    public static final RegistryObject<ArmorItem> CROWN = ITEMS.register("crown",
            ()->new ArmorBaseItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD,
                    new Item.Properties().group(FrogsArmoury.TAB), ()-> ClientArmorHelper::Crown));
    // Barbaric
    public static final RegistryObject<ArmorItem> BARBARIC_HELMET = ITEMS.register("barbaric_helmet",
            ()-> new ArmorBaseItem(ModArmourMaterial.FARAAM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(FrogsArmoury.TAB), ()-> ClientArmorHelper::Barbaric));
    public static final RegistryObject<ArmorItem> BARBARIC_CHESTPLATE = ITEMS.register("barbaric_chestplate",
            ()-> new ArmorBaseItem(ModArmourMaterial.FARAAM, EquipmentSlotType.CHEST,
                    new Item.Properties().group(FrogsArmoury.TAB), ()-> ClientArmorHelper::Barbaric));
    public static final RegistryObject<ArmorItem> BARBARIC_LEGGINGS = ITEMS.register("barbaric_leggings",
            ()-> new ArmorBaseItem(ModArmourMaterial.FARAAM, EquipmentSlotType.LEGS,
                    new Item.Properties().group(FrogsArmoury.TAB), ()-> ClientArmorHelper::Barbaric));
    public static final RegistryObject<ArmorItem> BARBARIC_BOOTS = ITEMS.register("barbaric_boots",
            ()-> new ArmorBaseItem(ModArmourMaterial.FARAAM, EquipmentSlotType.FEET,
                    new Item.Properties().group(FrogsArmoury.TAB), ()-> ClientArmorHelper::Barbaric));
    // Faraam
    public static final RegistryObject<ArmorItem> FARAAM_HELMET = ITEMS.register("faraam_helmet",
            ()-> new ArmorItem(ModArmourMaterial.FARAAM, EquipmentSlotType.HEAD, new Item.Properties().group(FrogsArmoury.TAB)));
    public static final RegistryObject<ArmorItem> FARAAM_CHESTPLATE = ITEMS.register("faraam_chestplate",
            ()-> new ArmorItem(ModArmourMaterial.FARAAM, EquipmentSlotType.CHEST, new Item.Properties().group(FrogsArmoury.TAB)));
    public static final RegistryObject<ArmorItem> FARAAM_LEGGINGS = ITEMS.register("faraam_leggings",
            ()-> new ArmorItem(ModArmourMaterial.FARAAM, EquipmentSlotType.LEGS, new Item.Properties().group(FrogsArmoury.TAB)));
    public static final RegistryObject<ArmorItem> FARAAM_BOOTS = ITEMS.register("faraam_boots",
            ()-> new ArmorItem(ModArmourMaterial.FARAAM, EquipmentSlotType.FEET, new Item.Properties().group(FrogsArmoury.TAB)));
}