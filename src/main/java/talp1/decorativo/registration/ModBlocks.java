package talp1.decorativo.registration;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.VineBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import talp1.decorativo.Decorativo;
import talp1.decorativo.blocks.BasketBlock;
import talp1.decorativo.blocks.BottleBlock;
import talp1.decorativo.blocks.SmallBottleBlock;

public class ModBlocks {

    public static final VineBlock WHITE_FLORAL_DECORATION = floralDecoration();
    public static final VineBlock BLACK_FLORAL_DECORATION = floralDecoration();
    public static final VineBlock RED_FLORAL_DECORATION = floralDecoration();
    public static final VineBlock GREEN_FLORAL_DECORATION = floralDecoration();
    public static final VineBlock BROWN_FLORAL_DECORATION = floralDecoration();
    public static final VineBlock BLUE_FLORAL_DECORATION = floralDecoration();
    public static final VineBlock PURPLE_FLORAL_DECORATION = floralDecoration();
    public static final VineBlock CYAN_FLORAL_DECORATION = floralDecoration();
    public static final VineBlock LIGHT_GRAY_FLORAL_DECORATION = floralDecoration();
    public static final VineBlock GRAY_FLORAL_DECORATION = floralDecoration();
    public static final VineBlock PINK_FLORAL_DECORATION = floralDecoration();
    public static final VineBlock LIME_FLORAL_DECORATION = floralDecoration();
    public static final VineBlock YELLOW_FLORAL_DECORATION = floralDecoration();
    public static final VineBlock LIGHT_BLUE_FLORAL_DECORATION = floralDecoration();
    public static final VineBlock MAGENTA_FLORAL_DECORATION = floralDecoration();
    public static final VineBlock ORANGE_FLORAL_DECORATION = floralDecoration();

    public static final BasketBlock BASKET = basket();
    public static final BasketBlock BASKET_OF_BLUE_FLOWERS = basket();
    public static final BasketBlock BASKET_OF_GREEN_FLOWERS = basket();
    public static final BasketBlock BASKET_OF_LIGHT_BLUE_FLOWERS = basket();
    public static final BasketBlock BASKET_OF_MAGENTA_FLOWERS = basket();
    public static final BasketBlock BASKET_OF_MULTICOLOR_FLOWERS = basket();
    public static final BasketBlock BASKET_OF_PINK_FLOWERS = basket();
    public static final BasketBlock BASKET_OF_ORANGE_FLOWERS = basket();
    public static final BasketBlock BASKET_OF_PURPLE_FLOWERS = basket();
    public static final BasketBlock BASKET_OF_RED_FLOWERS = basket();
    public static final BasketBlock BASKET_OF_YELLOW_FLOWERS = basket();

    public static final BottleBlock BOTTLE = new BottleBlock(FabricBlockSettings.of(Material.GLASS).breakInstantly().nonOpaque());
    public static final SmallBottleBlock SMALL_BOTTLE = new SmallBottleBlock(FabricBlockSettings.of(Material.GLASS).breakInstantly().nonOpaque());



    public static void init(){
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "white_floral_decoration"), WHITE_FLORAL_DECORATION);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "black_floral_decoration"), BLACK_FLORAL_DECORATION);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "red_floral_decoration"), RED_FLORAL_DECORATION);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "green_floral_decoration"), GREEN_FLORAL_DECORATION);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "brown_floral_decoration"), BROWN_FLORAL_DECORATION);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "blue_floral_decoration"), BLUE_FLORAL_DECORATION);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "purple_floral_decoration"), PURPLE_FLORAL_DECORATION);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "cyan_floral_decoration"), CYAN_FLORAL_DECORATION);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "light_gray_floral_decoration"), LIGHT_GRAY_FLORAL_DECORATION);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "gray_floral_decoration"), GRAY_FLORAL_DECORATION);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "pink_floral_decoration"), PINK_FLORAL_DECORATION);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "lime_floral_decoration"), LIME_FLORAL_DECORATION);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "yellow_floral_decoration"), YELLOW_FLORAL_DECORATION);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "light_blue_floral_decoration"), LIGHT_BLUE_FLORAL_DECORATION);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "magenta_floral_decoration"), MAGENTA_FLORAL_DECORATION);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "orange_floral_decoration"), ORANGE_FLORAL_DECORATION);

        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "basket"), BASKET);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "basket_of_blue_flowers"), BASKET_OF_BLUE_FLOWERS);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "basket_of_green_flowers"), BASKET_OF_GREEN_FLOWERS);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "basket_of_light_blue_flowers"), BASKET_OF_LIGHT_BLUE_FLOWERS);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "basket_of_magenta_flowers"), BASKET_OF_MAGENTA_FLOWERS);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "basket_of_multicolor_flowers"), BASKET_OF_MULTICOLOR_FLOWERS);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "basket_of_pink_flowers"), BASKET_OF_PINK_FLOWERS);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "basket_of_orange_flowers"), BASKET_OF_ORANGE_FLOWERS);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "basket_of_purple_flowers"), BASKET_OF_PURPLE_FLOWERS);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "basket_of_red_flowers"), BASKET_OF_RED_FLOWERS);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "basket_of_yellow_flowers"), BASKET_OF_YELLOW_FLOWERS);

        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "bottle"), BOTTLE);
        Registry.register(Registry.BLOCK, new Identifier(Decorativo.MOD_ID, "small_bottle"), SMALL_BOTTLE);
    }

    private static VineBlock floralDecoration(){
        return new VineBlock(FabricBlockSettings.of(Material.PLANT).breakInstantly().nonOpaque());
    }

    private static BasketBlock basket(){
        return new BasketBlock(FabricBlockSettings.of(Material.DECORATION).breakInstantly());
    }

}
