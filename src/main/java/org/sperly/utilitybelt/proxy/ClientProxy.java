package org.sperly.utilitybelt.proxy;


import cpw.mods.fml.client.registry.ClientRegistry;
import org.sperly.utilitybelt.client.settings.Keybindings;


public class ClientProxy extends CommonProxy
{
    @Override
    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(Keybindings.tool_switch);
    }
}
