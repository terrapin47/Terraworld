package terrapin47.terraworld;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import terrapin47.terraworld.init.ModRecipes;
import terrapin47.terraworld.proxy.CommonProxy;

@Mod(modid = Terraworld.MODID, name = Terraworld.MODNAME, version = Terraworld.MODVERSION, useMetadata = true, dependencies = "required-after:baubles;required-after:botania")
public class Terraworld {

    public static final String MODID = "terraworld";
    public static final String MODNAME = "Terraworld";
    public static final String MODVERSION= "1.0.8";

    @SidedProxy(clientSide = "terrapin47.terraworld.proxy.ClientProxy", serverSide = "terrapin47.terraworld.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Terraworld instance;

    public static Logger logger;

    static {
        FluidRegistry.enableUniversalBucket();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        ModRecipes.init();

        if(!Loader.isModLoaded("baubles"))
            System.out.println("Required mod Baubles isn't installed");

        if(!Loader.isModLoaded("botania"))
            System.out.println("Required mod Botania isn't installed");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
