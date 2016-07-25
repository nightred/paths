package com.jenovarain.paths.items;

import javax.annotation.Nonnull;

import com.jenovarain.paths.Main;
import com.jenovarain.paths.client.lib.LibResources;
import com.jenovarain.paths.core.PathsCreativeTab;
import com.jenovarain.paths.lib.LibMisc;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemMod extends Item {
	
	public ItemMod(String name) {
		
		setCreativeTab(PathsCreativeTab.INSTANCE);
		
		if(shouldRegister())
			GameRegistry.register(this, new ResourceLocation(LibMisc.MODID, name));
		
		setUnlocalizedName(name);
	}
	
	protected boolean shouldRegister() {
		return true;
	}
	
	@Nonnull
	@Override
	public String getUnlocalizedNameInefficiently(@Nonnull ItemStack par1ItemStack) {
		return super.getUnlocalizedNameInefficiently(par1ItemStack).replaceAll("item\\.",  "item." + LibResources.PREFIX_MOD);
	}

}
