package terrapin47.terraworld.item;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import terrapin47.terraworld.Terraworld;

public class ItemPlumedBelt extends Item implements IBauble {

	private String oredict = null;

	public ItemPlumedBelt() {
		String name = "plumed_belt";
		setRegistryName(name);
        setUnlocalizedName(Terraworld.MODID + "." + name);
		setCreativeTab(CreativeTabs.MATERIALS);
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.BELT;
	}

	@Override
	public void onWornTick(ItemStack stack, EntityLivingBase entity) {
		if (entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer)entity;
			player.fallDistance = 0f;
		}
	}

	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}

	public void register(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(this);

		// Probably bad practice?
		if (!(this.oredict == null)) {
			OreDictionary.registerOre(this.oredict, this);
		}
	}

}