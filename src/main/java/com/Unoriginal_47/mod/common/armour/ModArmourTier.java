package com.Unoriginal_47.mod.common.armour;

import java.util.function.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.item.Items;

public enum ModArmourTier implements IArmorMaterial{
	EMERALD_ARMOUR( ":example", 10, new int[] {4, 7, 9, 4}, 17, SoundEvents.ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.of(Items.EMERALD));
	
	
	private static final int[] baseDurability = { 128, 144, 160, 112,};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] armourVal;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final Ingredient repairIngredient;
	

	
	ModArmourTier
	(String name, int durabilityMultiplier, int[] armourVal, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient){
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.armourVal = armourVal;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient.get();
	}
	@Override
	public int getDurabilityForSlot(EquipmentSlotType slot) {
		return this.baseDurability[slot.getIndex()]*this.durabilityMultiplier;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType slot) { 
		return this.armourVal[slot.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		// TODO Auto-generated method stub
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return this.repairIngredient;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}

}
