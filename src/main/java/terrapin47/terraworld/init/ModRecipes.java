package terrapin47.terraworld.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        GameRegistry.addSmelting(ModBlocks.ADAMANTINE_ORE, new ItemStack(ModItems.ADAMANTINE_INGOT, 1), 1.0f);
        GameRegistry.addSmelting(ModItems.ADAMANTINE_DUST, new ItemStack(ModItems.ADAMANTINE_INGOT, 1), 0f);
        GameRegistry.addSmelting(ModBlocks.MITHRIL_ORE, new ItemStack(ModItems.MITHRIL_INGOT, 1), 1.0f);
        GameRegistry.addSmelting(ModItems.MITHRIL_DUST, new ItemStack(ModItems.MITHRIL_INGOT, 1), 0f);
        GameRegistry.addSmelting(ModBlocks.PLATINUM_ORE, new ItemStack(ModItems.PLATINUM_INGOT, 1), 1.0f);
        GameRegistry.addSmelting(ModItems.PLATINUM_DUST, new ItemStack(ModItems.PLATINUM_INGOT, 1), 0f);
        GameRegistry.addSmelting(ModBlocks.ZINC_ORE, new ItemStack(ModItems.ZINC_INGOT, 1), 0.7f);
        GameRegistry.addSmelting(ModItems.ZINC_DUST, new ItemStack(ModItems.ZINC_INGOT, 1), 0f);
        GameRegistry.addSmelting(ModItems.AQUARIME_DUST, new ItemStack(ModItems.AQUARIME_INGOT, 1), 0f);
        GameRegistry.addSmelting(ModItems.STEEL_DUST, new ItemStack(ModItems.STEEL_INGOT, 1), 0f);
    }

}
