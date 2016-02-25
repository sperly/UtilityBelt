package org.sperly.utilitybelt.client.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import org.sperly.utilitybelt.client.settings.Keybindings;
import org.sperly.utilitybelt.reference.Key;
import org.sperly.utilitybelt.utility.LogHelper;

public class KeyInputEventHandler
{
    private static Key getPressedKeyBinding()
    {
        if(Keybindings.tool_switch.isPressed())
        {
            return Key.TOOL_SWITCH;
        }
        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPressedKeyBinding());
    }
}
