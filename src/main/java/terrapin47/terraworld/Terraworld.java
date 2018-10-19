package terrapin47.terraworld;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import terrapin47.terraworld.init.ModRecipes;
import terrapin47.terraworld.proxy.CommonProxy;

@Mod(modid = Terraworld.MODID, name = Terraworld.MODNAME, version = Terraworld.MODVERSION, useMetadata = true)
public class Terraworld {

    public static final String MODID = "terraworld";
    public static final String MODNAME = "Terraworld";
    public static final String MODVERSION= "1.0.3";

    @SidedProxy(clientSide = "terrapin47.terraworld.proxy.ClientProxy", serverSide = "terrapin47.terraworld.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Terraworld instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
