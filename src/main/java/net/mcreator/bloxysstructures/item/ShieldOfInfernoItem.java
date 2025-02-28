
package net.mcreator.bloxysstructures.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ShieldOfInfernoItem extends ShieldItem {
	public ShieldOfInfernoItem() {
		super(new Item.Properties().durability(756).fireResistant());
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(Items.IRON_INGOT), new ItemStack(Items.COPPER_INGOT), new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.NETHERITE_INGOT), new ItemStack(Items.DIAMOND), new ItemStack(Items.NETHERITE_SCRAP),
				new ItemStack(Items.EMERALD), new ItemStack(Items.LAVA_BUCKET)).test(repairitem);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.bloxysstructures.shield_of_inferno.description_0"));
	}
}
