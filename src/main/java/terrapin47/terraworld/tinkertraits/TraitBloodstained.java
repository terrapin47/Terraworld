package terrapin47.terraworld.tinkertraits;

import WayofTime.bloodmagic.core.data.SoulNetwork;
import WayofTime.bloodmagic.core.data.SoulTicket;
import WayofTime.bloodmagic.util.helper.NetworkHelper;
import c4.conarm.common.armor.utils.ArmorHelper;
import c4.conarm.lib.traits.AbstractArmorTrait;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.living.LivingDamageEvent;

public class TraitBloodstained extends AbstractArmorTrait  {
    public static final TraitBloodstained bloodstained = new TraitBloodstained();

    public TraitBloodstained() {
        super("bloodstained", 0xF26263);
    }

    public static TraitBloodstained Get()
    {
        return bloodstained;
    }

    public float onDamaged(ItemStack armor, EntityPlayer player, DamageSource source, float damage, float newDamage, LivingDamageEvent evt) {
        //Add life essence to the player's soul network when damaged by an enemy.
        if(source.getTrueSource().isCreatureType(EnumCreatureType.MONSTER, false)) {
            SoulNetwork network = NetworkHelper.getSoulNetwork(player);
            int newEssence = network.getCurrentEssence()+(int)(10*damage); //New amount of essence, may go past cap.
            int maxEssence = NetworkHelper.getMaximumForTier(network.getOrbTier());; //Maximum amount of essence you can get depending on blood orb.
            if(maxEssence == 0) return super.onDamaged(armor, player, source, damage, newDamage, evt); //Can't hold any essence, return out of function-
            else if(newEssence > maxEssence) network.setCurrentEssence(maxEssence); //Make sure essence doesn't overflow past max.
            else network.setCurrentEssence(newEssence);
        }
        return super.onDamaged(armor, player, source, damage, newDamage, evt);
    }

}
