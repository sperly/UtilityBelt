package org.sperly.utilitybelt.client.settings;

import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;
import org.sperly.utilitybelt.reference.Names;

public class Keybindings
{
    public static KeyBinding tool_switch = new KeyBinding(Names.Keys.TOOL_SWITCH, Keyboard.KEY_C, Names.Keys.CATEGORY);
}
