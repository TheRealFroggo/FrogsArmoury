package net.frostfrog.frogsarmoury.items;

import net.frostfrog.frogsarmoury.client.model.ArmorBaseModel;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public class ArmorBaseItem extends ArmorItem {

    private Supplier<Supplier<ArmorBaseModel>> armorModel;

    public ArmorBaseItem(IArmorMaterial material, EquipmentSlotType equipmentSlot, Item.Properties properties, Supplier<Supplier<ArmorBaseModel>> armorModel) {
        super(material, equipmentSlot, properties);
        this.armorModel = armorModel;
        //set the creative tab, and everything you might want to set here additionally
    }
    
    @OnlyIn(Dist.CLIENT)
    @Override
    public final BipedModel getArmorModel(LivingEntity entity, ItemStack itemStack, EquipmentSlotType armorSlot, BipedModel defaultArmor) {
        return armorModel.get().get().applyEntityStats(defaultArmor).applySlot(armorSlot);
    }

    @Override
    public final String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return armorModel.get().get().getTexture();
    }
}