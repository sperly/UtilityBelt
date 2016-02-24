package org.sperly.utilitybelt.gui;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import org.sperly.utilitybelt.reference.Reference;
import org.sperly.utilitybelt.utility.ConfigurationHandler;


public class GuiConfiguration extends GuiConfig
{
    public GuiConfiguration(GuiScreen guiScreen) {
        super(
                guiScreen,
                new ConfigElement(ConfigurationHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.config.toString()));
    }
}
