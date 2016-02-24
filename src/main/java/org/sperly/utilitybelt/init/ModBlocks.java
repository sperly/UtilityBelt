package org.sperly.utilitybelt.init;


import cpw.mods.fml.common.registry.GameRegistry;
import org.sperly.utilitybelt.block.BlockGeneric;
import org.sperly.utilitybelt.block.BlockToolium;
import org.sperly.utilitybelt.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockGeneric tooliumBlock = new BlockToolium();

    public static void init()
    {
        GameRegistry.registerBlock(tooliumBlock, "tooliumBlock");
    }
}
