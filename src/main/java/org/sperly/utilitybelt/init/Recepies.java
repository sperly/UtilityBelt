package org.sperly.utilitybelt.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;


public class Recepies
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.basicBelt), " i ", "lll", "   ", 'i', "blockIron", 'l', new ItemStack(Items.leather)));
    }
}
