package trickypr.tinyImprovements.items;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.NameTagItem;
import net.minecraftforge.registries.IForgeRegistry;

public class ColoredNameTags extends NameTagItem {
	private String backendColor;

	public ColoredNameTags(String colorName) {
		super(new Properties().tab(CreativeModeTab.TAB_TOOLS));

		setRegistryName(colorName + "_name_tag");
		this.backendColor = colorName;
	}

	public void setTargetCustomNameWithColor(String name, String color, LivingEntity target) {
		CompoundTag tag = target.serializeNBT();

		System.out.println(tag);

		String customName = "{ \"text\": \"" + name + "\", \"color\": \"" + color + "\" }";
		tag.putString("CustomName", customName);
		target.deserializeNBT(tag);
	}

	@Override
	public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity target,
			InteractionHand hand) {
		if (stack.hasCustomHoverName() && !(target instanceof Player)) {
			if (!player.level.isClientSide && target.isAlive()) {
				setTargetCustomNameWithColor(stack.getHoverName().getString(), backendColor, target);

				System.out.println(stack.getHoverName());

				if (target instanceof Mob) {
					((Mob) target).setPersistenceRequired();
				}

				stack.shrink(1);
			}

			return InteractionResult.sidedSuccess(player.level.isClientSide);
		} else {
			return InteractionResult.PASS;
		}
	}

	public static final String[] colors = { "black", "dark_blue", "dark_green", "dark_aqua", "dark_red", "dark_purple",
			"gold", "gray", "dark_gray", "blue", "green", "aqua", "red", "light_purple", "yellow" };

	public static void addToRegistry(final IForgeRegistry<Item> registry) {
		for (String color : colors) {
			registry.register(new ColoredNameTags(color));
		}
	}
}
