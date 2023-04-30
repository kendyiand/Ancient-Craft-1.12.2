package com.eneskey.mymod.main;

import com.eneskey.mymod.reference.Reference;
import com.eneskey.mymod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFT_VERSION)
public class Main {

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {}

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {}

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {}
}
