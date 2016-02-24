package org.sperly.utilitybelt.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import org.sperly.utilitybelt.creativetab.CreativeTabUtilityBelt;
import org.sperly.utilitybelt.reference.Reference;

public class BlockGeneric extends Block
{
    public BlockGeneric(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabUtilityBelt.UtilityBeltTab);
    }

    public BlockGeneric()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}
