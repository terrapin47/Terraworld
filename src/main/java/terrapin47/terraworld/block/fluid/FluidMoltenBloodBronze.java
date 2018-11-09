package terrapin47.terraworld.block.fluid;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import slimeknights.tconstruct.TConstruct;

import java.awt.Color;

public class FluidMoltenBloodBronze extends Fluid {

    public FluidMoltenBloodBronze() {
        super("molten_blood_bronze", new ResourceLocation(TConstruct.modID, "blocks/fluids/molten_metal"), new ResourceLocation(TConstruct.modID, "blocks/fluids/molten_metal_flow"));
        this.setColor(new Color(227, 74, 89, 255));
        this.setDensity(1000);
        this.setViscosity(1000);
        this.setTemperature(1000);
        this.setLuminosity(10);
    }

}
