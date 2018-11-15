package terrapin47.terraworld.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import terrapin47.terraworld.Terraworld;
import terrapin47.terraworld.util.MiscUtils;

public class ItemBase extends Item {

    private String oredict = null;

    public ItemBase(String name) {
        setRegistryName(name);
        setUnlocalizedName(Terraworld.MODID + "." + name);
        setCreativeTab(CreativeTabs.MATERIALS);
    }

    public ItemBase(String name, String oredict) {
        this(name);
        this.oredict = oredict;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        if (MiscUtils.getConfigForOredict(this.oredict)) {
            ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
        }
    }

    public void register(RegistryEvent.Register<Item> event) {
        if (MiscUtils.getConfigForOredict(this.oredict)) {
            event.getRegistry().register(this);
            OreDictionary.registerOre(this.oredict, this);
        }
    }

}
