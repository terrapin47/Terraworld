package terrapin47.terraworld.init;

import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import terrapin47.terraworld.block.BlockBase;

public class ModBlocks {

    @GameRegistry.ObjectHolder("terraworld:adamantine_ore")
    public static final BlockBase ADAMANTINE_ORE = new BlockBase("adamantine_ore", Material.ROCK);

    @GameRegistry.ObjectHolder("terraworld:adamantine_block")
    public static final BlockBase ADAMANTINE_BLOCK = new BlockBase("adamantine_block", Material.ROCK);

    @GameRegistry.ObjectHolder("terraworld:mithril_ore")
    public static final BlockBase MITHRIL_ORE = new BlockBase("mithril_ore", Material.ROCK);

    @GameRegistry.ObjectHolder("terraworld:mithril_block")
    public static final BlockBase MITHRIL_BLOCK = new BlockBase("mithril_block", Material.ROCK);

    @GameRegistry.ObjectHolder("terraworld:platinum_ore")
    public static final BlockBase PLATINUM_ORE = new BlockBase("platinum_ore", Material.ROCK);

    @GameRegistry.ObjectHolder("terraworld:platinum_block")
    public static final BlockBase PLATINUM_BLOCK = new BlockBase("platinum_block", Material.ROCK);

    @GameRegistry.ObjectHolder("terraworld:zinc_ore")
    public static final BlockBase ZINC_ORE = new BlockBase("zinc_ore", Material.ROCK);

    @GameRegistry.ObjectHolder("terraworld:zinc_block")
    public static final BlockBase ZINC_BLOCK = new BlockBase("zinc_block", Material.ROCK);

    @GameRegistry.ObjectHolder("terraworld:aquarime_block")
    public static final BlockBase AQUARIME_BLOCK = new BlockBase("aquarime_block", Material.ROCK);

    @GameRegistry.ObjectHolder("terraworld:steel_block")
    public static final BlockBase STEEL_BLOCK = new BlockBase("steel_block", Material.ROCK);

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ADAMANTINE_ORE.initModel();
        ADAMANTINE_ORE.initOreDict("oreAdamantine");
        ADAMANTINE_BLOCK.initModel();
        ADAMANTINE_BLOCK.initOreDict("blockAdamantine");
        MITHRIL_ORE.initModel();
        MITHRIL_ORE.initOreDict("oreMithril");
        MITHRIL_BLOCK.initModel();
        MITHRIL_BLOCK.initOreDict("blockMithril");
        PLATINUM_ORE.initModel();
        PLATINUM_ORE.initOreDict("orePlatinum");
        PLATINUM_BLOCK.initModel();
        PLATINUM_BLOCK.initOreDict("blockPlatinum");
        ZINC_ORE.initModel();
        ZINC_ORE.initOreDict("oreZinc");
        ZINC_BLOCK.initModel();
        ZINC_BLOCK.initOreDict("blockZinc");
        AQUARIME_BLOCK.initModel();
        AQUARIME_BLOCK.initOreDict("blockAquarime");
        STEEL_BLOCK.initModel();
        STEEL_BLOCK.initOreDict("blockSteel");
    }

}