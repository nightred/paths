package com.jenovarain.paths.client;

import com.jenovarain.paths.CommonProxy;
import com.jenovarain.paths.client.handler.ModelHandler;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		
	}
		
	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
		
		ModelHandler.registerModels();
		initRenderers();
		
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}
	
	private void initRenderers() {
		
	}

}
