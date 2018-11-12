package terrapin47.terraworld.item;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.util.DamageSource;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.world.World;
import terrapin47.terraworld.Terraworld;
import java.util.List;
import java.util.UUID;

@Mod.EventBusSubscriber(modid = Terraworld.MODID)
public class ItemBloodyThornRing extends Item implements IBauble {

    protected static final UUID HEALTH_MODIFIER_1 = UUID.fromString("2b1b168e-e53b-11e8-9f32-f2801f1b9fd1"); //Two separate modifiers to prevent crash
    protected static final AttributeModifier HEALTH_MOD_1 = new AttributeModifier(HEALTH_MODIFIER_1, "BLOODYTHORNRING_HEALTH_MOD_1", 4.0D, 0);
    protected static final UUID HEALTH_MODIFIER_2 = UUID.fromString("4dca1dba-5835-4216-8f56-0f6d9af37b36");
    protected static final AttributeModifier HEALTH_MOD_2 = new AttributeModifier(HEALTH_MODIFIER_2, "BLOODYTHORNRING_HEALTH_MOD_2", 4.0D, 0);

    public ItemBloodyThornRing() {
        String name = "bloody_thorn_ring";
        setRegistryName(name);
        setUnlocalizedName(Terraworld.MODID + "." + name);
        setCreativeTab(CreativeTabs.COMBAT);
        setMaxStackSize(1);
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemstack) {
        return BaubleType.RING;
    }

    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
            IAttributeInstance maxHealth = player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
            if(!maxHealth.hasModifier(HEALTH_MOD_1)) //Separate modifiers for different rings
                maxHealth.applyModifier(HEALTH_MOD_1);
            else if(!maxHealth.hasModifier(HEALTH_MOD_2))
                maxHealth.applyModifier(HEALTH_MOD_2);
    }

    @Override
    public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
        IAttributeInstance maxHealth = player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
        if(player.getHealth() > player.getMaxHealth() - 4.0f)
            player.setHealth(player.getMaxHealth() - 4.0f);
        else player.setHealth(1.0f);
        if(maxHealth.hasModifier(HEALTH_MOD_2))
            maxHealth.removeModifier(HEALTH_MODIFIER_2);
        else if(maxHealth.hasModifier(HEALTH_MOD_1))
            maxHealth.removeModifier(HEALTH_MODIFIER_1);
    }

    @SubscribeEvent
    public static void onPlayerAttacked(LivingHurtEvent event)
    {
        if(event.getEntityLiving() instanceof EntityPlayer) {
            DamageSource damageSource = event.getSource();
            if (damageSource.getImmediateSource() != null && damageSource.getImmediateSource() instanceof EntityLivingBase) {
                EntityLivingBase player = event.getEntityLiving();
                //Make player take one heart of damage when taking damage.
                player.setHealth(player.getHealth() - 2.0f);
                Entity attackingEntity = damageSource.getTrueSource();
                //Reflect two hearts of damage if it is a living entity
                EntityLivingBase livingEntity = (EntityLivingBase) attackingEntity;
                livingEntity.attackEntityFrom(DamageSource.causeIndirectDamage(player, livingEntity), 4.0f);
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    public void register(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(this);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("Increases max life and reflects a little damage... At the cost of pain.");
    }

}