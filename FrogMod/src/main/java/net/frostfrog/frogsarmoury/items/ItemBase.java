package net.frostfrog.frogsarmoury.items;

import net.frostfrog.frogsarmoury.FrogsArmoury;
import net.minecraft.item.Item;

public class ItemBase extends Item
{
    public ItemBase()
    {
        super(new Item.Properties().group(FrogsArmoury.TAB));
    }
}
