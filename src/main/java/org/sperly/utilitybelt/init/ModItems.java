package org.sperly.utilitybelt.init;

import cpw.mods.fml.common.registry.GameRegistry;
import org.sperly.utilitybelt.item.ItemGeneric;
import org.sperly.utilitybelt.item.ItemBasicUtilityBelt;
import org.sperly.utilitybelt.reference.Reference;
import org.sperly.utilitybelt.utility.LogHelper;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemGeneric basicBelt = new ItemBasicUtilityBelt();

    public static void init()
    {
        GameRegistry.registerItem(basicBelt, "basicUtilityBelt");
        LogHelper.info("Added item: basicUtilityBelt");
    }
}
