package com.Unoriginal_47.mod.core.init;



import com.Unoriginal_47.mod.common.armour.ModArmourTier;
import com.Unoriginal_47.mod.common.tools.ModItemTier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Iteminit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,"emerald_expansion");
	

	//Tools
	
	public static final RegistryObject<PickaxeItem> Emerald_Pickaxe = ITEMS.register("emeraldpickaxe", () -> 
	new PickaxeItem(ModItemTier.EMERALD,2,-2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<AxeItem> Emerald_Axe = ITEMS.register("emeraldaxe",() -> 
	new AxeItem(ModItemTier.EMERALD,6F,-3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<ShovelItem> Emerald_Shovel = ITEMS.register("emeraldshovel",() -> 
	new ShovelItem(ModItemTier.EMERALD,1.5F,-3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<HoeItem> Emerald_Hoe = ITEMS.register("emeraldhoe",() -> 
	new HoeItem(ModItemTier.EMERALD,-3,-0.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

	//Combat
	public static final RegistryObject<SwordItem> Emerald_Sword = ITEMS.register("emeraldsword", () -> 
	new SwordItem(ModItemTier.EMERALD,3,-2.8F,new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> Emerald_Chestplate = ITEMS.register("emeraldchestplate",() -> 
	new ArmorItem(ModArmourTier.EMERALD_ARMOUR, EquipmentSlotType.CHEST, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> Emerald_Helmet = ITEMS.register("emeraldhelmet",() -> 
	new ArmorItem(ModArmourTier.EMERALD_ARMOUR, EquipmentSlotType.HEAD, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> Emerald_Leggings = ITEMS.register("emeraldleggings",() -> 
	new ArmorItem(ModArmourTier.EMERALD_ARMOUR, EquipmentSlotType.LEGS, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> Emerald_Boots = ITEMS.register("emeraldboots",() -> 
	new ArmorItem(ModArmourTier.EMERALD_ARMOUR, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
}