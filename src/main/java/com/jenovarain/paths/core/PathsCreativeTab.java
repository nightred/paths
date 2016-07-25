package com.jenovarain.paths.core;

import java.util.List;
import javax.annotation.Nonnull;

import com.jenovarain.paths.Main;
import com.jenovarain.paths.items.ModItems;
import com.jenovarain.paths.lib.LibMisc;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class PathsCreativeTab extends CreativeTabs {

	public static PathsCreativeTab INSTANCE = new PathsCreativeTab();
	List<ItemStack> list;
	
	public PathsCreativeTab() {
		super(LibMisc.MODID);
		setNoTitle();
	}
	
	@Override
	public Item getTabIconItem() {
		return getIconItemStack().getItem();
	}
	
	@Nonnull
	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(ModItems.guide);
	}
	
	@Override
	public void displayAllRelevantItems(@Nonnull List<ItemStack> list) {
		this.list = list;
		
		addItem(ModItems.guide);
	}
	
	private void addItem(Item item) {
		item.getSubItems(item, this, list);
	}
	
	private void addBlock(Block block) {
		ItemStack stack = new ItemStack(block);
		block.getSubBlocks(stack.getItem(), this, list);
	}
	
	private void addStack(ItemStack stack) {
		list.add(stack);
	}

}
