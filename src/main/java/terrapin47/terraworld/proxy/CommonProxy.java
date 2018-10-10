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
        event.getRegistry().register(ModBlocks.ADAMANTINE_ORE);
        event.getRegistry().register(ModBlocks.ADAMANTINE_BLOCK);
        event.getRegistry().register(ModBlocks.MITHRIL_ORE);
        event.getRegistry().register(ModBlocks.MITHRIL_BLOCK);
        event.getRegistry().register(ModBlocks.PLATINUM_ORE);
        event.getRegistry().register(ModBlocks.PLATINUM_BLOCK);
        event.getRegistry().register(ModBlocks.ZINC_ORE);
        event.getRegistry().register(ModBlocks.ZINC_BLOCK);
        event.getRegistry().register(ModBlocks.AQUARIME_BLOCK);
        event.getRegistry().register(ModBlocks.STEEL_BLOCK);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(ModItems.ADAMANTINE_INGOT);
        event.getRegistry().register(ModItems.ADAMANTINE_DUST);
        event.getRegistry().register(ModItems.ADAMANTINE_NUGGET);
        event.getRegistry().register(new ItemBlock(ModBlocks.ADAMANTINE_ORE).setRegistryName(ModBlocks.ADAMANTINE_ORE.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.ADAMANTINE_BLOCK).setRegistryName(ModBlocks.ADAMANTINE_BLOCK.getRegistryName()));
        event.getRegistry().register(ModItems.MITHRIL_INGOT);
        event.getRegistry().register(ModItems.MITHRIL_DUST);
        event.getRegistry().register(ModItems.MITHRIL_NUGGET);
        event.getRegistry().register(new ItemBlock(ModBlocks.MITHRIL_ORE).setRegistryName(ModBlocks.MITHRIL_ORE.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.MITHRIL_BLOCK).setRegistryName(ModBlocks.MITHRIL_BLOCK.getRegistryName()));
        event.getRegistry().register(ModItems.PLATINUM_INGOT);
        event.getRegistry().register(ModItems.PLATINUM_DUST);
        event.getRegistry().register(ModItems.PLATINUM_NUGGET);
        event.getRegistry().register(new ItemBlock(ModBlocks.PLATINUM_ORE).setRegistryName(ModBlocks.PLATINUM_ORE.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.PLATINUM_BLOCK).setRegistryName(ModBlocks.PLATINUM_BLOCK.getRegistryName()));
        event.getRegistry().register(ModItems.ZINC_INGOT);
        event.getRegistry().register(ModItems.ZINC_DUST);
        event.getRegistry().register(ModItems.ZINC_NUGGET);
        event.getRegistry().register(new ItemBlock(ModBlocks.ZINC_ORE).setRegistryName(ModBlocks.ZINC_ORE.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.ZINC_BLOCK).setRegistryName(ModBlocks.ZINC_BLOCK.getRegistryName()));
        event.getRegistry().register(ModItems.AQUARIME_INGOT);
        event.getRegistry().register(ModItems.AQUARIME_DUST);
        event.getRegistry().register(ModItems.AQUARIME_NUGGET);
        event.getRegistry().register(new ItemBlock(ModBlocks.AQUARIME_BLOCK).setRegistryName(ModBlocks.AQUARIME_BLOCK.getRegistryName()));
        event.getRegistry().register(ModItems.STEEL_INGOT);
        event.getRegistry().register(ModItems.STEEL_DUST);
        event.getRegistry().register(ModItems.STEEL_NUGGET);
        event.getRegistry().register(new ItemBlock(ModBlocks.STEEL_BLOCK).setRegistryName(ModBlocks.STEEL_BLOCK.getRegistryName()));
    }
}

