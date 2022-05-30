package talp1.decorativo;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import talp1.decorativo.registration.ModBlocks;
import talp1.decorativo.registration.ModItems;

public class Decorativo implements ModInitializer {
	public static final String MOD_ID = "decorativo";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "main"), () -> new ItemStack(Blocks.COBBLESTONE));

	@Override
	public void onInitialize() {
		ModItems.init();
		ModBlocks.init();
	}

}
