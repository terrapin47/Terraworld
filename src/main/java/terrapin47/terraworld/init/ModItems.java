package terrapin47.terraworld.init;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import terrapin47.terraworld.item.ItemBase;

public class ModItems {

    @GameRegistry.ObjectHolder("terraworld:adamantine_ingot")
    public static final ItemBase ADAMANTINE_INGOT = new ItemBase("adamantine_ingot", "ingotAdamantine");

    @GameRegistry.ObjectHolder("terraworld:adamantine_dust")
    public static final ItemBase ADAMANTINE_DUST = new ItemBase("adamantine_dust", "dustAdamantine");

    @GameRegistry.ObjectHolder("terraworld:adamantine_nugget")
    public static final ItemBase ADAMANTINE_NUGGET = new ItemBase("adamantine_nugget", "nuggetAdamantine");

    @GameRegistry.ObjectHolder("terraworld:mithril_ingot")
    public static final ItemBase MITHRIL_INGOT = new ItemBase("mithril_ingot", "ingotMithril");

    @GameRegistry.ObjectHolder("terraworld:mithril_dust")
    public static final ItemBase MITHRIL_DUST = new ItemBase("mithril_dust", "dustMithril");

    @GameRegistry.ObjectHolder("terraworld:mithril_nugget")
    public static final ItemBase MITHRIL_NUGGET = new ItemBase("mithril_nugget", "nuggetMithril");

    @GameRegistry.ObjectHolder("terraworld:platinum_ingot")
    public static final ItemBase PLATINUM_INGOT = new ItemBase("platinum_ingot", "ingotPlatinum");

    @GameRegistry.ObjectHolder("terraworld:platinum_dust")
    public static final ItemBase PLATINUM_DUST = new ItemBase("platinum_dust", "dustPlatinum");

    @GameRegistry.ObjectHolder("terraworld:platinum_nugget")
    public static final ItemBase PLATINUM_NUGGET = new ItemBase("platinum_nugget", "nuggetPlatinum");

    @GameRegistry.ObjectHolder("terraworld:zinc_ingot")
    public static final ItemBase ZINC_INGOT = new ItemBase("zinc_ingot", "ingotZinc");

    @GameRegistry.ObjectHolder("terraworld:zinc_dust")
    public static final ItemBase ZINC_DUST = new ItemBase("zinc_dust", "dustZinc");

    @GameRegistry.ObjectHolder("terraworld:zinc_nugget")
    public static final ItemBase ZINC_NUGGET = new ItemBase("zinc_nugget", "nuggetZinc");

    @GameRegistry.ObjectHolder("terraworld:aquarime_ingot")
    public static final ItemBase AQUARIME_INGOT = new ItemBase("aquarime_ingot", "ingotAquarime");

    @GameRegistry.ObjectHolder("terraworld:aquarime_dust")
    public static final ItemBase AQUARIME_DUST = new ItemBase("aquarime_dust", "dustAquarime");

    @GameRegistry.ObjectHolder("terraworld:aquarime_nugget")
    public static final ItemBase AQUARIME_NUGGET = new ItemBase("aquarime_nugget", "nuggetAquarime");

    @GameRegistry.ObjectHolder("terraworld:steel_ingot")
    public static final ItemBase STEEL_INGOT = new ItemBase("steel_ingot", "ingotSteel");

    @GameRegistry.ObjectHolder("terraworld:steel_dust")
    public static final ItemBase STEEL_DUST = new ItemBase("steel_dust", "dustSteel");

    @GameRegistry.ObjectHolder("terraworld:steel_nugget")
    public static final ItemBase STEEL_NUGGET = new ItemBase("steel_nugget", "nuggetSteel");

    @GameRegistry.ObjectHolder("terraworld:orichalcum_ingot")
    public static final ItemBase ORICHALCUM_INGOT = new ItemBase("orichalcum_ingot", "ingotOrichalcum");

    @GameRegistry.ObjectHolder("terraworld:orichalcum_dust")
    public static final ItemBase ORICHALCUM_DUST = new ItemBase("orichalcum_dust", "dustOrichalcum");

    @GameRegistry.ObjectHolder("terraworld:orichalcum_nugget")
    public static final ItemBase ORICHALCUM_NUGGET = new ItemBase("orichalcum_nugget", "nuggetOrichalcum");

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ADAMANTINE_INGOT.initModel();
        ADAMANTINE_DUST.initModel();
        ADAMANTINE_NUGGET.initModel();
        MITHRIL_INGOT.initModel();
        MITHRIL_DUST.initModel();
        MITHRIL_NUGGET.initModel();
        PLATINUM_INGOT.initModel();
        PLATINUM_DUST.initModel();
        PLATINUM_NUGGET.initModel();
        ZINC_INGOT.initModel();
        ZINC_DUST.initModel();
        ZINC_NUGGET.initModel();
        AQUARIME_INGOT.initModel();
        AQUARIME_DUST.initModel();
        AQUARIME_NUGGET.initModel();
        STEEL_INGOT.initModel();
        STEEL_DUST.initModel();
        STEEL_NUGGET.initModel();
        ORICHALCUM_INGOT.initModel();
        ORICHALCUM_DUST.initModel();
        ORICHALCUM_NUGGET.initModel();
    }

    public static void registerItems(RegistryEvent.Register<Item> event) {
        ADAMANTINE_INGOT.register(event);
        ADAMANTINE_DUST.register(event);
        ADAMANTINE_NUGGET.register(event);
        MITHRIL_INGOT.register(event);
        MITHRIL_DUST.register(event);
        MITHRIL_NUGGET.register(event);
        PLATINUM_INGOT.register(event);
        PLATINUM_DUST.register(event);
        PLATINUM_NUGGET.register(event);
        ZINC_INGOT.register(event);
        ZINC_DUST.register(event);
        ZINC_NUGGET.register(event);
        AQUARIME_INGOT.register(event);
        AQUARIME_DUST.register(event);
        AQUARIME_NUGGET.register(event);
        STEEL_INGOT.register(event);
        STEEL_DUST.register(event);
        STEEL_NUGGET.register(event);
        ORICHALCUM_INGOT.register(event);
        ORICHALCUM_DUST.register(event);
        ORICHALCUM_NUGGET.register(event);
    }

}
