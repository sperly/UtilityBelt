package org.sperly.utilitybelt.utility;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import org.sperly.utilitybelt.reference.Reference;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration config;
    public static String testValue = "NoString";

    public static void init(File configFile)
    {
        if(config == null)
        {
            config = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        testValue = config.getString("TestValue", Configuration.CATEGORY_GENERAL, "Default", "A test value");

        if(config.hasChanged())
        {
            config.save();
        }
    }
}
