package terrapin47.terraworld.init;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import slimeknights.tconstruct.common.TinkerPulse;
import slimeknights.tconstruct.library.TinkerRegistry;
import terrapin47.terraworld.block.fluid.FluidMoltenBloodBronze;
import WayofTime.bloodmagic.block.BlockLifeEssence;

public class ModFluids extends TinkerPulse {

    public static final FluidMoltenBloodBronze MOLTEN_BLOOD_BRONZE = new FluidMoltenBloodBronze();

    public static void registerFluids() {
        FluidRegistry.registerFluid(MOLTEN_BLOOD_BRONZE);
        FluidRegistry.addBucketForFluid(MOLTEN_BLOOD_BRONZE);
    }

    //Register smeltery recipes
    private static void registerAlloys() {
        if(!isSmelteryLoaded())
            return;

        TinkerRegistry.registerAlloy(new FluidStack(MOLTEN_BLOOD_BRONZE, 288),
                new FluidStack(FluidRegistry.getFluid("bronze"), 144),
                new FluidStack(BlockLifeEssence.getLifeEssence(), 1000));

    }

}
