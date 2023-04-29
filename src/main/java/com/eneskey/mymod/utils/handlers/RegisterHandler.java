package com.eneskey.mymod.utils.handlers;

import com.eneskey.mymod.init.InitItems;
import com.eneskey.mymod.utils.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegisterHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(InitItems.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){
        for(Item item : InitItems.ITEMS){
            if(item instanceof IHasModel){
                ((IHasModel)item).registerModels();
            }
        }
    }
}
