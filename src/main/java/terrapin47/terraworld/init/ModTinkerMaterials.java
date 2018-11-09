package terrapin47.terraworld.init;

import static slimeknights.tconstruct.library.materials.MaterialTypes.*;
import static slimeknights.tconstruct.library.utils.HarvestLevels.*;
import static slimeknights.tconstruct.tools.TinkerTraits.*;
import net.minecraft.util.text.TextFormatting;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.*;
import slimeknights.tconstruct.library.modifiers.*;
import slimeknights.tconstruct.library.tools.*;
import terrapin47.terraworld.tinkertraits.TraitSoulStealer;

public class ModTinkerMaterials {

    public static final Material BLOOD_BRONZE_MAT = new Material("blood bronze", 0xF26263);

    static public void init() {
        initMaterialStats();
    }

    static private void initMaterialStats()
    {
        BLOOD_BRONZE_MAT.addItem("ingotBloodBronze", 1, Material.VALUE_Ingot);
        BLOOD_BRONZE_MAT.setCastable(true);
        BLOOD_BRONZE_MAT.addTrait(TraitSoulStealer.Get());
        BLOOD_BRONZE_MAT.setRenderInfo(0xF26263);
        TinkerRegistry.addMaterial(BLOOD_BRONZE_MAT);
        TinkerRegistry.addMaterialStats(BLOOD_BRONZE_MAT, new HeadMaterialStats(550, 11.0f, 6.20f, COBALT));
        TinkerRegistry.addMaterialStats(BLOOD_BRONZE_MAT,  new HandleMaterialStats(0.70f, 125));
        TinkerRegistry.addMaterialStats(BLOOD_BRONZE_MAT, new ExtraMaterialStats(250));
    }

}
