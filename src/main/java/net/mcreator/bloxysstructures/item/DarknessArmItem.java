
package net.mcreator.bloxysstructures.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.network.chat.Component;

import net.mcreator.bloxysstructures.procedures.DarknessArmLivingEntityIsHitWithToolProcedure;

import java.util.List;

public class DarknessArmItem extends SwordItem {
	private static final Tier TOOL_TIER = new Tier() {
		@Override
		public int getUses() {
			return 1408;
		}

		@Override
		public float getSpeed() {
			return 6f;
		}

		@Override
		public float getAttackDamageBonus() {
			return 0;
		}

		@Override
		public TagKey<Block> getIncorrectBlocksForDrops() {
			return BlockTags.INCORRECT_FOR_DIAMOND_TOOL;
		}

		@Override
		public int getEnchantmentValue() {
			return 8;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.of(new ItemStack(Items.IRON_INGOT), new ItemStack(Items.COPPER_INGOT), new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.NETHERITE_INGOT), new ItemStack(Items.DIAMOND), new ItemStack(Items.NETHERITE_SCRAP),
					new ItemStack(Items.EMERALD));
		}
	};

	public DarknessArmItem() {
		super(TOOL_TIER, new Item.Properties().attributes(SwordItem.createAttributes(TOOL_TIER, 6f, -2.4f)).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		DarknessArmLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity, sourceentity);
		return retval;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.bloxysstructures.darkness_arm.description_0"));
		list.add(Component.translatable("item.bloxysstructures.darkness_arm.description_1"));
	}
}
