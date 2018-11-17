package terrapin47.terraworld.tinkertraits;

import WayofTime.bloodmagic.core.RegistrarBloodMagicItems;
import WayofTime.bloodmagic.util.helper.NBTHelper;
import net.minecraft.entity.*;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.chunk.Chunk;
import slimeknights.tconstruct.library.traits.*;
import WayofTime.bloodmagic.soul.*;

public class TraitSoulStealer extends AbstractTrait {
    public static final TraitSoulStealer soulstealer = new TraitSoulStealer();

    public TraitSoulStealer() {
        super("soulstealer", 0xF26263);
    }

    public static TraitSoulStealer Get()
    {
        return soulstealer;
    }

    @Override
    public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt, boolean wasCritical, boolean wasHit) {
        //Get demon will if target died and is not friendly
        if(target.getHealth() <= 0 && target.isCreatureType(EnumCreatureType.MONSTER, false)) {
            IDemonWill soul = ((IDemonWill) RegistrarBloodMagicItems.MONSTER_SOUL);
            int looting = EnchantmentHelper.getLootingModifier(player);
            double willModifier = target instanceof EntitySlime ? 0.67 : 1;
            for (int i = 0; i <= looting; i++) {
                if (i == 0 || target.getEntityWorld().rand.nextDouble() < 0.4) {
                    ItemStack soulStack = soul.createWill(EnumDemonWillType.DEFAULT.ordinal(), willModifier * (target.getEntityWorld().rand.nextDouble()  * target.getMaxHealth() / 20d));
                    PlayerDemonWillHandler.addDemonWill((EntityPlayer)player, soulStack);
                }
            }
        }
    }

}
