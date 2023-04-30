package com.eneskey.mymod.items;

import com.eneskey.mymod.init.InitItems;
import com.eneskey.mymod.main.Main;
import com.eneskey.mymod.utils.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBroadSword extends Item implements IHasModel {
    public ItemBroadSword(String name) {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.COMBAT);
        setMaxStackSize(1);

        InitItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
