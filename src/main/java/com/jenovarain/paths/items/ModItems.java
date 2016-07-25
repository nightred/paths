package com.jenovarain.paths.items;

import net.minecraft.item.Item;

public final class ModItems {
	
	public static Item guide;
	
	public static void init() {
		
		guide = new GuideItem();
	}

}
