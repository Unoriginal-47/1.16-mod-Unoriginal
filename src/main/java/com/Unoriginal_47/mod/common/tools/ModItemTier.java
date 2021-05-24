package com.Unoriginal_47.mod.common.tools;

import java.util.function.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;


public enum ModItemTier implements IItemTier {
	EMERALD(3, 1800, 12.0F, 3.5F, 12, () ->{
		return Ingredient.of(Items.EMERALD);
		}
	);
	
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final Supplier<Ingredient> repairIngredient;
	
	ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient){
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.enchantability = enchantability;
		this.repairIngredient = repairIngredient;
	}
	

	@Override
	public int getUses() {
		
		return maxUses;
	}

	@Override
	public float getSpeed() {
		
		return efficiency;
	}

	@Override
	public float getAttackDamageBonus() {
		// TODO Auto-generated method stub
		return attackDamage;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return harvestLevel;
	}

	@Override
	public int getEnchantmentValue() {
		// TODO Auto-generated method stub
		return enchantability;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return repairIngredient.get();
	}

}
