package terrapin47.terraworld.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import terrapin47.terraworld.item.ItemBase;

public class ModItems {

    @GameRegistry.ObjectHolder("terraworld:adamantine_ingot")
    public static final ItemBase ADAMANTINE_INGOT = new ItemBase("adamantine_ingot");

    @GameRegistry.ObjectHolder("terraworld:adamantine_dust")
    public static final ItemBase ADAMANTINE_DUST = new ItemBase("adamantine_dust");

    @GameRegistry.ObjectHolder("terraworld:adamantine_nugget")
    public static final ItemBase ADAMANTINE_NUGGET = new ItemBase("adamantine_nugget");

    @GameRegistry.ObjectHolder("terraworld:mithril_ingot")
    public static final ItemBase MITHRIL_INGOT = new ItemBase("mithril_ingot");

    @GameRegistry.ObjectHolder("terraworld:mithril_dust")
    public static final ItemBase MITHRIL_DUST = new ItemBase("mithril_dust");

    @GameRegistry.ObjectHolder("terraworld:mithril_nugget")
    public static final ItemBase MITHRIL_NUGGET = new ItemBase("mithril_nugget");

    @GameRegistry.ObjectHolder("terraworld:platinum_ingot")
    public static final ItemBase PLATINUM_INGOT = new ItemBase("platinum_ingot");

    @GameRegistry.ObjectHolder("terraworld:platinum_dust")
    public static final ItemBase PLATINUM_DUST = new ItemBase("platinum_dust");

    @GameRegistry.ObjectHolder("terraworld:platinum_nugget")
    public static final ItemBase PLATINUM_NUGGET = new ItemBase("platinum_nugget");

    @GameRegistry.ObjectHolder("terraworld:zinc_ingot")
    public static final ItemBase ZINC_INGOT = new ItemBase("zinc_ingot");

    @GameRegistry.ObjectHolder("terraworld:zinc_dust")
    public static final ItemBase ZINC_DUST = new ItemBase("zinc_dust");

    @GameRegistry.ObjectHolder("terraworld:zinc_nugget")
    public static final ItemBase ZINC_NUGGET = new ItemBase("zinc_nugget");

    @GameRegistry.ObjectHolder("terraworld:aquarime_ingot")
    public static final ItemBase AQUARIME_INGOT = new ItemBase("aquarime_ingot");

    @GameRegistry.ObjectHolder("terraworld:aquarime_dust")
    public static final ItemBase AQUARIME_DUST = new ItemBase("aquarime_dust");

    @GameRegistry.ObjectHolder("terraworld:aquarime_nugget")
    public static final ItemBase AQUARIME_NUGGET = new ItemBase("aquarime_nugget");

    @GameRegistry.ObjectHolder("terraworld:steel_ingot")
    public static final ItemBase STEEL_INGOT = new ItemBase("steel_ingot");

    @GameRegistry.ObjectHolder("terraworld:steel_dust")
    public static final ItemBase STEEL_DUST = new ItemBase("steel_dust");

    @GameRegistry.ObjectHolder("terraworld:steel_nugget")
    public static final ItemBase STEEL_NUGGET = new ItemBase("steel_nugget");

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ADAMANTINE_INGOT.initModel();
        ADAMANTINE_INGOT.initOreDict("ingotAdamantine");
        ADAMANTINE_DUST.initModel();
        ADAMANTINE_DUST.initOreDict("dustAdamantine");
        ADAMANTINE_NUGGET.initModel();
        ADAMANTINE_NUGGET.initOreDict("nuggetAdamantine");

        MITHRIL_INGOT.initModel();
        MITHRIL_INGOT.initOreDict("ingotMithril");
        MITHRIL_DUST.initModel();
        MITHRIL_DUST.initOreDict("dustMithril");
        MITHRIL_NUGGET.initModel();
        MITHRIL_NUGGET.initOreDict("nuggetMithril");

        PLATINUM_INGOT.initModel();
        PLATINUM_INGOT.initOreDict("ingotPlatinum");
        PLATINUM_DUST.initModel();
        PLATINUM_DUST.initOreDict("dustPlatinum");
        PLATINUM_NUGGET.initModel();
        PLATINUM_NUGGET.initOreDict("nuggetPlatinum");

        ZINC_INGOT.initModel();
        ZINC_INGOT.initOreDict("ingotZinc");
        ZINC_DUST.initModel();
        ZINC_DUST.initOreDict("dustZinc");
        ZINC_NUGGET.initModel();
        ZINC_NUGGET.initOreDict("nuggetZinc");

        AQUARIME_INGOT.initModel();
        AQUARIME_INGOT.initOreDict("ingotAquarime");
        AQUARIME_DUST.initModel();
        AQUARIME_DUST.initOreDict("dustAquarime");
        AQUARIME_NUGGET.initModel();
        AQUARIME_NUGGET.initOreDict("nuggetAquarime");

        STEEL_INGOT.initModel();
        STEEL_INGOT.initOreDict("ingotSteel");
        STEEL_DUST.initModel();
        STEEL_DUST.initOreDict("dustSteel");
        STEEL_NUGGET.initModel();
        STEEL_NUGGET.initOreDict("nuggetSteel");
    }

}
