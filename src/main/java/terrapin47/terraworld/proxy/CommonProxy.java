package terrapin47.terraworld.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import terrapin47.terraworld.init.ModBlocks;
import terrapin47.terraworld.init.ModItems;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        ModBlocks.ADAMANTINE_ORE.register(event);
        ModBlocks.ADAMANTINE_BLOCK.register(event);
        ModBlocks.MITHRIL_ORE.register(event);
        ModBlocks.MITHRIL_BLOCK.register(event);
        ModBlocks.PLATINUM_ORE.register(event);
        ModBlocks.PLATINUM_BLOCK.register(event);
        ModBlocks.ZINC_ORE.register(event);
        ModBlocks.ZINC_BLOCK.register(event);
        ModBlocks.AQUARIME_BLOCK.register(event);
        ModBlocks.STEEL_BLOCK.register(event);
        ModBlocks.ORICHALCUM_ORE.register(event);
        ModBlocks.ORICHALCUM_BLOCK.register(event);

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ModItems.ADAMANTINE_INGOT.register(event);
        ModItems.ADAMANTINE_DUST.register(event);
        ModItems.ADAMANTINE_NUGGET.register(event);
        ModBlocks.ADAMANTINE_ORE.registerAsItem(event);
        ModBlocks.ADAMANTINE_BLOCK.registerAsItem(event);
        ModItems.MITHRIL_INGOT.register(event);
        ModItems.MITHRIL_DUST.register(event);
        ModItems.MITHRIL_NUGGET.register(event);
        ModBlocks.MITHRIL_ORE.registerAsItem(event);
        ModBlocks.MITHRIL_BLOCK.registerAsItem(event);
        ModItems.PLATINUM_INGOT.register(event);
        ModItems.PLATINUM_DUST.register(event);
        ModItems.PLATINUM_NUGGET.register(event);
        ModBlocks.PLATINUM_ORE.registerAsItem(event);
        ModBlocks.PLATINUM_BLOCK.registerAsItem(event);
        ModItems.ZINC_INGOT.register(event);
        ModItems.ZINC_DUST.register(event);
        ModItems.ZINC_NUGGET.register(event);
        ModBlocks.ZINC_ORE.registerAsItem(event);
        ModBlocks.ZINC_BLOCK.registerAsItem(event);
        ModItems.AQUARIME_INGOT.register(event);
        ModItems.AQUARIME_DUST.register(event);
        ModItems.AQUARIME_NUGGET.register(event);
        ModBlocks.AQUARIME_BLOCK.registerAsItem(event);
        ModItems.STEEL_INGOT.register(event);
        ModItems.STEEL_DUST.register(event);
        ModItems.STEEL_NUGGET.register(event);
        ModBlocks.STEEL_BLOCK.registerAsItem(event);
        ModItems.ORICHALCUM_INGOT.register(event);
        ModItems.ORICHALCUM_DUST.register(event);
        ModItems.ORICHALCUM_NUGGET.register(event);
        ModBlocks.ORICHALCUM_ORE.registerAsItem(event);
        ModBlocks.ORICHALCUM_BLOCK.registerAsItem(event);

    }
}

