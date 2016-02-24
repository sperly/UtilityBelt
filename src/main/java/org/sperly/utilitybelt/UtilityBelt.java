package org.sperly.utilitybelt;

import org.sperly.utilitybelt.init.ModBlocks;
import org.sperly.utilitybelt.init.ModItems;
import org.sperly.utilitybelt.proxy.IProxy;
import org.sperly.utilitybelt.reference.Reference;
import org.sperly.utilitybelt.utility.ConfigurationHandler;
import org.sperly.utilitybelt.utility.LogHelper;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION, guiFactory= Reference.GUI_FACTORY_CLASS)
public class UtilityBelt
{
    @Mod.Instance(Reference.MOD_NAME)
    public static UtilityBelt instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("PreInitialization complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
