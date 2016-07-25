package com.jenovarain.paths;

import com.jenovarain.paths.lib.LibMisc;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LibMisc.MODID, version = LibMisc.VERSION, name = LibMisc.MODNAME)
public class Main {
	
	@Instance(LibMisc.MODID)
	public static Main instance;
	
	@SidedProxy(clientSide=LibMisc.PROXYCLIENT, serverSide=LibMisc.PROXYSERVER)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}
		
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
	
	

}
