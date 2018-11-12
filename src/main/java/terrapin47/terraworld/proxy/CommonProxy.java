package terrapin47.terraworld.proxy;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import terrapin47.terraworld.init.ModBlocks;
import terrapin47.terraworld.init.ModFluids;
import terrapin47.terraworld.init.ModItems;
import terrapin47.terraworld.init.ModTinkerMaterials;

@Mod.EventBusSubscriber
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        ModFluids.registerFluids();
        ModTinkerMaterials.preInit();
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
        ModFluids.registerAlloys();
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        ModBlocks.registerBlocks(event);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ModItems.registerItems(event);
        ModBlocks.registerItems(event);
        ModTinkerMaterials.init();
    }
}

