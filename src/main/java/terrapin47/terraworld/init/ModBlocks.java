package terrapin47.terraworld.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import terrapin47.terraworld.block.BlockBase;
import terrapin47.terraworld.block.fluid.FluidMoltenBlock;

public class ModBlocks {

    @GameRegistry.ObjectHolder("terraworld:adamantine_ore")
    public static final BlockBase ADAMANTINE_ORE = new BlockBase("adamantine_ore", "oreAdamantine", Material.ROCK, 12.0f, "pickaxe", 4);

    @GameRegistry.ObjectHolder("terraworld:adamantine_block")
    public static final BlockBase ADAMANTINE_BLOCK = new BlockBase("adamantine_block", "blockAdamantine", Material.ROCK, 12.0f, "pickaxe", 2);

    @GameRegistry.ObjectHolder("terraworld:mithril_ore")
    public static final BlockBase MITHRIL_ORE = new BlockBase("mithril_ore", "oreMithril", Material.ROCK, 5.0f, "pickaxe", 2);

    @GameRegistry.ObjectHolder("terraworld:mithril_block")
    public static final BlockBase MITHRIL_BLOCK = new BlockBase("mithril_block", "blockMithril", Material.ROCK, 5.0f, "pickaxe", 2);

    @GameRegistry.ObjectHolder("terraworld:platinum_ore")
    public static final BlockBase PLATINUM_ORE = new BlockBase("platinum_ore", "orePlatinum", Material.ROCK, 10.0f, "pickaxe", 2);

    @GameRegistry.ObjectHolder("terraworld:platinum_block")
    public static final BlockBase PLATINUM_BLOCK = new BlockBase("platinum_block", "blockPlatinum", Material.ROCK, 10.0f, "pickaxe", 2);

    @GameRegistry.ObjectHolder("terraworld:zinc_ore")
    public static final BlockBase ZINC_ORE = new BlockBase("zinc_ore", "oreZinc", Material.ROCK, 1.0f, "pickaxe", 1);

    @GameRegistry.ObjectHolder("terraworld:zinc_block")
    public static final BlockBase ZINC_BLOCK = new BlockBase("zinc_block", "blockZinc", Material.ROCK, 1.0f, "pickaxe", 2);

    @GameRegistry.ObjectHolder("terraworld:aquarime_block")
    public static final BlockBase AQUARIME_BLOCK = new BlockBase("aquarime_block", "blockAquarime", Material.ROCK, 7.0f, "pickaxe", 2);

    @GameRegistry.ObjectHolder("terraworld:steel_block")
    public static final BlockBase STEEL_BLOCK = new BlockBase("steel_block", "blockSteel", Material.ROCK, 8.0f, "pickaxe", 2);

    @GameRegistry.ObjectHolder("terraworld:orichalcum_ore")
    public static final BlockBase ORICHALCUM_ORE = new BlockBase("orichalcum_ore", "oreOrichalcum", Material.ROCK, 10.0f, "pickaxe", 4);

    @GameRegistry.ObjectHolder("terraworld:orichalcum_block")
    public static final BlockBase ORICHALCUM_BLOCK = new BlockBase("orichalcum_block", "blockOrichalcum", Material.ROCK, 10.f, "pickaxe", 2);

    @GameRegistry.ObjectHolder("terraworld:blood_bronze_block")
    public static final BlockBase BLOOD_BRONZE_BLOCK = new BlockBase("blood_bronze_block", "blockBloodBronze", Material.ROCK, 5.f, "pickaxe", 2);

    @GameRegistry.ObjectHolder("terraworld:blood_bronze_fluid_block")
    public static final FluidMoltenBlock BLOOD_BRONZE_FLUID_BLOCK = new FluidMoltenBlock("blood_bronze_fluid_block", ModFluids.MOLTEN_BLOOD_BRONZE);

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ADAMANTINE_ORE.initModel();
        ADAMANTINE_BLOCK.initModel();
        MITHRIL_ORE.initModel();
        MITHRIL_BLOCK.initModel();
        PLATINUM_ORE.initModel();
        PLATINUM_BLOCK.initModel();
        ZINC_ORE.initModel();
        ZINC_BLOCK.initModel();
        AQUARIME_BLOCK.initModel();
        STEEL_BLOCK.initModel();
        ORICHALCUM_BLOCK.initModel();
        ORICHALCUM_ORE.initModel();
        BLOOD_BRONZE_BLOCK.initModel();
        BLOOD_BRONZE_FLUID_BLOCK.initModel();
    }

    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        ADAMANTINE_ORE.register(event);
        ADAMANTINE_BLOCK.register(event);
        MITHRIL_ORE.register(event);
        MITHRIL_BLOCK.register(event);
        PLATINUM_ORE.register(event);
        PLATINUM_BLOCK.register(event);
        ZINC_ORE.register(event);
        ZINC_BLOCK.register(event);
        AQUARIME_BLOCK.register(event);
        STEEL_BLOCK.register(event);
        ORICHALCUM_ORE.register(event);
        ORICHALCUM_BLOCK.register(event);
        BLOOD_BRONZE_BLOCK.register(event);
        BLOOD_BRONZE_FLUID_BLOCK.register(event);
    }

    public static void registerItems(RegistryEvent.Register<Item> event) {
        ADAMANTINE_ORE.registerAsItem(event);
        ADAMANTINE_BLOCK.registerAsItem(event);
        MITHRIL_ORE.registerAsItem(event);
        MITHRIL_BLOCK.registerAsItem(event);
        PLATINUM_ORE.registerAsItem(event);
        PLATINUM_BLOCK.registerAsItem(event);
        ZINC_ORE.registerAsItem(event);
        ZINC_BLOCK.registerAsItem(event);
        AQUARIME_BLOCK.registerAsItem(event);
        STEEL_BLOCK.registerAsItem(event);
        ORICHALCUM_ORE.registerAsItem(event);
        ORICHALCUM_BLOCK.registerAsItem(event);
        BLOOD_BRONZE_BLOCK.registerAsItem(event);
        BLOOD_BRONZE_FLUID_BLOCK.registerAsItem(event);
    }
}