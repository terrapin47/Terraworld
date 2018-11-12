package terrapin47.terraworld.init;

import c4.conarm.lib.materials.CoreMaterialStats;
import c4.conarm.lib.materials.PlatesMaterialStats;
import c4.conarm.lib.materials.TrimMaterialStats;
import net.minecraft.item.ItemStack;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.client.MaterialRenderInfo;
import slimeknights.tconstruct.library.materials.BowMaterialStats;
import slimeknights.tconstruct.library.materials.ExtraMaterialStats;
import slimeknights.tconstruct.library.materials.HandleMaterialStats;
import slimeknights.tconstruct.library.materials.HeadMaterialStats;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.smeltery.TinkerSmeltery;
import c4.conarm.lib.materials.ArmorMaterialType;
import terrapin47.terraworld.tinkertraits.TraitBloodstained;
import terrapin47.terraworld.tinkertraits.TraitSoulStealer;

import static slimeknights.tconstruct.library.utils.HarvestLevels.COBALT;

public class ModTinkerMaterials {

    public static final Material BLOOD_BRONZE_MAT = new Material("blood bronze", 0xF26263);

    static public void preInit() {
        BLOOD_BRONZE_MAT.addItemIngot("ingotBloodBronze");
        BLOOD_BRONZE_MAT.addItem("ingotBloodBronze", Material.VALUE_Ingot, 1);
        BLOOD_BRONZE_MAT.setRepresentativeItem("ingotBloodBronze");
        BLOOD_BRONZE_MAT.setFluid(ModFluids.MOLTEN_BLOOD_BRONZE);
        BLOOD_BRONZE_MAT.setCraftable(false).setCastable(true);
        BLOOD_BRONZE_MAT.addTrait(TraitSoulStealer.Get());
        BLOOD_BRONZE_MAT.addTrait(TraitBloodstained.Get(), ArmorMaterialType.CORE);
        BLOOD_BRONZE_MAT.addTrait(TraitBloodstained.Get(), ArmorMaterialType.PLATES);
        BLOOD_BRONZE_MAT.addTrait(TraitBloodstained.Get(), ArmorMaterialType.TRIM);
        BLOOD_BRONZE_MAT.setRenderInfo(new MaterialRenderInfo.Metal(0x8A0707, 0.25f, 0.25f, -0.1f));
    }

    static public void init()
    {
        TinkerRegistry.addMaterial(BLOOD_BRONZE_MAT);
        TinkerRegistry.addMaterialStats(BLOOD_BRONZE_MAT, new HeadMaterialStats(550, 11.0f, 6.20f, COBALT));
        TinkerRegistry.addMaterialStats(BLOOD_BRONZE_MAT, new HandleMaterialStats(0.70f, 125));
        TinkerRegistry.addMaterialStats(BLOOD_BRONZE_MAT, new ExtraMaterialStats(250));
        TinkerRegistry.addMaterialStats(BLOOD_BRONZE_MAT, new BowMaterialStats(0.70f, 1.25f, 3.2f));
        TinkerRegistry.addMaterialStats(BLOOD_BRONZE_MAT, new CoreMaterialStats(17.5f, 18));
        TinkerRegistry.addMaterialStats(BLOOD_BRONZE_MAT, new PlatesMaterialStats(0.9f, 15, 2));
        TinkerRegistry.addMaterialStats(BLOOD_BRONZE_MAT, new TrimMaterialStats(7.0f));
        TinkerRegistry.registerMelting("ingotBloodBronze", ModFluids.MOLTEN_BLOOD_BRONZE, 144);
        TinkerRegistry.registerMelting("blockBloodBronze", ModFluids.MOLTEN_BLOOD_BRONZE, 1296);
        TinkerRegistry.registerBasinCasting(new ItemStack(ModBlocks.BLOOD_BRONZE_BLOCK), ItemStack.EMPTY, ModFluids.MOLTEN_BLOOD_BRONZE, 1296);
        TinkerRegistry.registerTableCasting(new ItemStack(ModItems.BLOOD_BRONZE_INGOT), TinkerSmeltery.castIngot, ModFluids.MOLTEN_BLOOD_BRONZE, 144);
        TinkerRegistry.integrate(BLOOD_BRONZE_MAT);
    }

}
