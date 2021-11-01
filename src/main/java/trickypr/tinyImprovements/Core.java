package trickypr.tinyImprovements;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import trickypr.tinyImprovements.items.ColoredNameTags;

@Mod("tiny_improvements")
public class Core {
	public Core() {

	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
			// Register new blocks here
		}

		@SubscribeEvent
		public static void onItemRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
			IForgeRegistry<Item> registry = itemRegistryEvent.getRegistry();

			ColoredNameTags.addToRegistry(registry);
		}
	}
}
