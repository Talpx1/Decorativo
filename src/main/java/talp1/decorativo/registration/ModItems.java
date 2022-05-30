
package talp1.decorativo.registration;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import talp1.decorativo.Decorativo;

public class ModItems {
    public static void init(){
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "white_floral_decoration"), new BlockItem(ModBlocks.WHITE_FLORAL_DECORATION, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "black_floral_decoration"), new BlockItem(ModBlocks.BLACK_FLORAL_DECORATION, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "red_floral_decoration"), new BlockItem(ModBlocks.RED_FLORAL_DECORATION, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "green_floral_decoration"), new BlockItem(ModBlocks.GREEN_FLORAL_DECORATION, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "brown_floral_decoration"), new BlockItem(ModBlocks.BROWN_FLORAL_DECORATION, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "blue_floral_decoration"), new BlockItem(ModBlocks.BLUE_FLORAL_DECORATION, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "purple_floral_decoration"), new BlockItem(ModBlocks.PURPLE_FLORAL_DECORATION, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "cyan_floral_decoration"), new BlockItem(ModBlocks.CYAN_FLORAL_DECORATION, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "light_gray_floral_decoration"), new BlockItem(ModBlocks.LIGHT_GRAY_FLORAL_DECORATION, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "gray_floral_decoration"), new BlockItem(ModBlocks.GRAY_FLORAL_DECORATION, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "pink_floral_decoration"), new BlockItem(ModBlocks.PINK_FLORAL_DECORATION, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "lime_floral_decoration"), new BlockItem(ModBlocks.LIME_FLORAL_DECORATION, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "yellow_floral_decoration"), new BlockItem(ModBlocks.YELLOW_FLORAL_DECORATION, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "light_blue_floral_decoration"), new BlockItem(ModBlocks.LIGHT_BLUE_FLORAL_DECORATION, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "magenta_floral_decoration"), new BlockItem(ModBlocks.MAGENTA_FLORAL_DECORATION, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "orange_floral_decoration"), new BlockItem(ModBlocks.ORANGE_FLORAL_DECORATION, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "basket"), new BlockItem(ModBlocks.BASKET, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "basket_of_blue_flowers"), new BlockItem(ModBlocks.BASKET_OF_BLUE_FLOWERS, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "basket_of_green_flowers"), new BlockItem(ModBlocks.BASKET_OF_GREEN_FLOWERS, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "basket_of_light_blue_flowers"), new BlockItem(ModBlocks.BASKET_OF_LIGHT_BLUE_FLOWERS, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "basket_of_magenta_flowers"), new BlockItem(ModBlocks.BASKET_OF_MAGENTA_FLOWERS, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "basket_of_multicolor_flowers"), new BlockItem(ModBlocks.BASKET_OF_MULTICOLOR_FLOWERS, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "basket_of_pink_flowers"), new BlockItem(ModBlocks.BASKET_OF_PINK_FLOWERS, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "basket_of_orange_flowers"), new BlockItem(ModBlocks.BASKET_OF_ORANGE_FLOWERS, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "basket_of_purple_flowers"), new BlockItem(ModBlocks.BASKET_OF_PURPLE_FLOWERS, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "basket_of_red_flowers"), new BlockItem(ModBlocks.BASKET_OF_RED_FLOWERS, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "basket_of_yellow_flowers"), new BlockItem(ModBlocks.BASKET_OF_YELLOW_FLOWERS, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "bottle"), new BlockItem(ModBlocks.BOTTLE, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Decorativo.MOD_ID, "small_bottle"), new BlockItem(ModBlocks.SMALL_BOTTLE, new FabricItemSettings().group(Decorativo.ITEM_GROUP)));

//        3d_potions
//        colored_campfires
//        colored_lanterns
//        colored_leaves
//        3d_kitchen_tools
//        decorated_glass_panes
//        colored bottles
//        bottles with flowers
    }

}
