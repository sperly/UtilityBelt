package org.sperly.utilitybelt.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.sperly.utilitybelt.init.ModItems;
import org.sperly.utilitybelt.reference.Reference;


public class CreativeTabUtilityBelt
{
    public static final CreativeTabs UtilityBeltTab = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.basicBelt;
        }
    };
}
