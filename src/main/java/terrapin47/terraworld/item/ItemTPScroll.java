package terrapin47.terraworld.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.world.World;
import terrapin47.terraworld.Terraworld;
import terrapin47.terraworld.item.ItemTPEffect;

@Mod.EventBusSubscriber(modid = Terraworld.MODID)
public class ItemTPScroll extends Item {

    public ItemTPScroll() {
        String name = "tp_scroll";
        setRegistryName(name);
        setUnlocalizedName(Terraworld.MODID + "." + name);
        setMaxDamage(0);
        setCreativeTab(CreativeTabs.MISC);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        if (!world.isRemote && hand == EnumHand.MAIN_HAND)
        {
            if(!player.capabilities.isCreativeMode) {
                ItemStack stack = player.getHeldItem(hand);
                stack.setCount(stack.getCount() - 1);
            }
            new ItemTPEffect(player);
        }
        return super.onItemRightClick(world, player, hand);
    }

    public void register(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(this);
    }

}