package com.jenovarain.paths.client.handler;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

import static com.jenovarain.paths.items.ModItems.*;

public final class ModelHandler {
	
	public static void registerModels() {
		
		registerStandardItems();
	}
	
	private static void registerStandardItems() {
		
		registerItemModel(guide);
	}
	
	private static void registerItemModel(Item i, int meta) {
		ResourceLocation loc = i.getRegistryName();
		ModelLoader.setCustomModelResourceLocation(i, meta, new ModelResourceLocation(loc, "inventory"));
	}
	
	private static void registerItemModel(Item i) {
		registerItemModel(i, 0);		
	}
	

}
