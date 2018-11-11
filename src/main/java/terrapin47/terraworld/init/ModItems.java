package terrapin47.terraworld.init;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import terrapin47.terraworld.item.ItemBase;
import terrapin47.terraworld.item.ItemBloodyThornRing;
import terrapin47.terraworld.item.ItemPlumedBelt;

public class ModItems {

    @GameRegistry.ObjectHolder("terraworld:copper_dust")
    public static final ItemBase COPPER_DUST = new ItemBase("copper_dust", "dustCopper");

    @GameRegistry.ObjectHolder("terraworld:lead_dust")
    public static final ItemBase LEAD_DUST = new ItemBase("lead_dust", "dustLead");

    @GameRegistry.ObjectHolder("terraworld:silver_dust")
    public static final ItemBase SILVER_DUST = new ItemBase("silver_dust", "dustSilver");

    @GameRegistry.ObjectHolder("terraworld:nickel_dust")
    public static final ItemBase NICKEL_DUST = new ItemBase("nickel_dust", "dustNickel");

    @GameRegistry.ObjectHolder("terraworld:adamantine_ingot")
    public static final ItemBase ADAMANTINE_INGOT = new ItemBase("adamantine_ingot", "ingotAdamantine");

    @GameRegistry.ObjectHolder("terraworld:adamantine_dust")
    public static final ItemBase ADAMANTINE_DUST = new ItemBase("adamantine_dust", "dustAdamantine");

    @GameRegistry.ObjectHolder("terraworld:adamantine_nugget")
    public static final ItemBase ADAMANTINE_NUGGET = new ItemBase("adamantine_nugget", "nuggetAdamantine");

    @GameRegistry.ObjectHolder("terraworld:aluminum_dust")
    public static final ItemBase ALUMINUM_DUST = new ItemBase("aluminum_dust", "dustAluminum");

    @GameRegistry.ObjectHolder("terraworld:mithril_ingot")
    public static final ItemBase MITHRIL_INGOT = new ItemBase("mithril_ingot", "ingotMithril");

    @GameRegistry.ObjectHolder("terraworld:mithril_dust")
    public static final ItemBase MITHRIL_DUST = new ItemBase("mithril_dust", "dustMithril");

    @GameRegistry.ObjectHolder("terraworld:mithril_nugget")
    public static final ItemBase MITHRIL_NUGGET = new ItemBase("mithril_nugget", "nuggetMithril");

    @GameRegistry.ObjectHolder("terraworld:platinum_ingot")
    public static final ItemBase PLATINUM_INGOT = new ItemBase("platinum_ingot", "ingotPlatinum");

    @GameRegistry.ObjectHolder("terraworld:platinum_dust")
    public static final ItemBase PLATINUM_DUST = new ItemBase("platinum_dust", "dustPlatinum");

    @GameRegistry.ObjectHolder("terraworld:platinum_nugget")
    public static final ItemBase PLATINUM_NUGGET = new ItemBase("platinum_nugget", "nuggetPlatinum");

    @GameRegistry.ObjectHolder("terraworld:zinc_ingot")
    public static final ItemBase ZINC_INGOT = new ItemBase("zinc_ingot", "ingotZinc");

    @GameRegistry.ObjectHolder("terraworld:zinc_dust")
    public static final ItemBase ZINC_DUST = new ItemBase("zinc_dust", "dustZinc");

    @GameRegistry.ObjectHolder("terraworld:zinc_nugget")
    public static final ItemBase ZINC_NUGGET = new ItemBase("zinc_nugget", "nuggetZinc");

    @GameRegistry.ObjectHolder("terraworld:aquarime_ingot")
    public static final ItemBase AQUARIME_INGOT = new ItemBase("aquarime_ingot", "ingotAquarime");

    @GameRegistry.ObjectHolder("terraworld:aquarime_dust")
    public static final ItemBase AQUARIME_DUST = new ItemBase("aquarime_dust", "dustAquarime");

    @GameRegistry.ObjectHolder("terraworld:aquarime_nugget")
    public static final ItemBase AQUARIME_NUGGET = new ItemBase("aquarime_nugget", "nuggetAquarime");

    @GameRegistry.ObjectHolder("terraworld:steel_ingot")
    public static final ItemBase STEEL_INGOT = new ItemBase("steel_ingot", "ingotSteel");

    @GameRegistry.ObjectHolder("terraworld:steel_dust")
    public static final ItemBase STEEL_DUST = new ItemBase("steel_dust", "dustSteel");

    @GameRegistry.ObjectHolder("terraworld:steel_nugget")
    public static final ItemBase STEEL_NUGGET = new ItemBase("steel_nugget", "nuggetSteel");

    @GameRegistry.ObjectHolder("terraworld:orichalcum_ingot")
    public static final ItemBase ORICHALCUM_INGOT = new ItemBase("orichalcum_ingot", "ingotOrichalcum");

    @GameRegistry.ObjectHolder("terraworld:orichalcum_dust")
    public static final ItemBase ORICHALCUM_DUST = new ItemBase("orichalcum_dust", "dustOrichalcum");

    @GameRegistry.ObjectHolder("terraworld:orichalcum_nugget")
    public static final ItemBase ORICHALCUM_NUGGET = new ItemBase("orichalcum_nugget", "nuggetOrichalcum");

    @GameRegistry.ObjectHolder("terraworld:blood_bronze_ingot")
    public static final ItemBase BLOOD_BRONZE_INGOT = new ItemBase("blood_bronze_ingot", "ingotBloodBronze");

    @GameRegistry.ObjectHolder("terraworld:stamp_armor_plate")
    public static final ItemBase STAMP_ARMOR_PLATE = new ItemBase("stamp_armor_plate");

    @GameRegistry.ObjectHolder("terraworld:stamp_armor_trim")
    public static final ItemBase STAMP_ARMOR_TRIM = new ItemBase("stamp_armor_trim");

    @GameRegistry.ObjectHolder("terraworld:stamp_arrow_head")
    public static final ItemBase STAMP_ARROW_HEAD = new ItemBase("stamp_arrow_head");

    @GameRegistry.ObjectHolder("terraworld:stamp_arrow_shaft")
    public static final ItemBase STAMP_ARROW_SHAFT = new ItemBase("stamp_arrow_shaft");

    @GameRegistry.ObjectHolder("terraworld:stamp_axe_head")
    public static final ItemBase STAMP_AXE_HEAD = new ItemBase("stamp_axe_head");

    @GameRegistry.ObjectHolder("terraworld:stamp_binding")
    public static final ItemBase STAMP_BINDING = new ItemBase("stamp_binding");

    @GameRegistry.ObjectHolder("terraworld:stamp_boots_core")
    public static final ItemBase STAMP_BOOTS_CORE = new ItemBase("stamp_boots_core");

    @GameRegistry.ObjectHolder("terraworld:stamp_bow_limb")
    public static final ItemBase STAMP_BOW_LIMB = new ItemBase("stamp_bow_limb");

    @GameRegistry.ObjectHolder("terraworld:stamp_bow_string")
    public static final ItemBase STAMP_BOW_STRING = new ItemBase("stamp_bow_string");

    @GameRegistry.ObjectHolder("terraworld:stamp_broad_axe_head")
    public static final ItemBase STAMP_BROAD_AXE_HEAD = new ItemBase("stamp_broad_axe_head");

    @GameRegistry.ObjectHolder("terraworld:stamp_chest_core")
    public static final ItemBase STAMP_CHEST_CORE = new ItemBase("stamp_chest_core");

    @GameRegistry.ObjectHolder("terraworld:stamp_cross_guard")
    public static final ItemBase STAMP_CROSS_GUARD = new ItemBase("stamp_cross_guard");

    @GameRegistry.ObjectHolder("terraworld:stamp_emerald")
    public static final ItemBase STAMP_EMERALD = new ItemBase("stamp_emerald");

    @GameRegistry.ObjectHolder("terraworld:stamp_excavator_head")
    public static final ItemBase STAMP_EXCAVATOR_HEAD = new ItemBase("stamp_excavator_head");

    @GameRegistry.ObjectHolder("terraworld:stamp_fletching")
    public static final ItemBase STAMP_FLETCHING = new ItemBase("stamp_fletching");

    @GameRegistry.ObjectHolder("terraworld:stamp_hammer_head")
    public static final ItemBase STAMP_HAMMER_HEAD = new ItemBase("stamp_hammer_head");

    @GameRegistry.ObjectHolder("terraworld:stamp_hand_guard")
    public static final ItemBase STAMP_HAND_GUARD = new ItemBase("stamp_hand_guard");

    @GameRegistry.ObjectHolder("terraworld:stamp_helmet_core")
    public static final ItemBase STAMP_HELMET_CORE = new ItemBase("stamp_helmet_core");

    @GameRegistry.ObjectHolder("terraworld:stamp_kama_head")
    public static final ItemBase STAMP_KAMA_HEAD = new ItemBase("stamp_kama_head");

    @GameRegistry.ObjectHolder("terraworld:stamp_knife_blade")
    public static final ItemBase STAMP_KNIFE_BLADE = new ItemBase("stamp_knife_blade");

    @GameRegistry.ObjectHolder("terraworld:stamp_large_plate")
    public static final ItemBase STAMP_LARGE_PLATE = new ItemBase("stamp_large_plate");

    @GameRegistry.ObjectHolder("terraworld:stamp_large_sword_blade")
    public static final ItemBase STAMP_LARGE_SWORD_BLADE = new ItemBase("stamp_large_sword_blade");

    @GameRegistry.ObjectHolder("terraworld:stamp_leggings_core")
    public static final ItemBase STAMP_LEGGINGS_CORE = new ItemBase("stamp_leggings_core");

    @GameRegistry.ObjectHolder("terraworld:stamp_pan_head")
    public static final ItemBase STAMP_PAN_HEAD = new ItemBase("stamp_pan_head");

    @GameRegistry.ObjectHolder("terraworld:stamp_pick_head")
    public static final ItemBase STAMP_PICK_HEAD = new ItemBase("stamp_pick_head");

    @GameRegistry.ObjectHolder("terraworld:stamp_polishing_kit")
    public static final ItemBase STAMP_POLISHING_KIT = new ItemBase("stamp_polishing_kit");

    @GameRegistry.ObjectHolder("terraworld:stamp_scythe_head")
    public static final ItemBase STAMP_SCYTHE_HEAD = new ItemBase("stamp_scythe_head");

    @GameRegistry.ObjectHolder("terraworld:stamp_shard")
    public static final ItemBase STAMP_SHARD = new ItemBase("stamp_shard");

    @GameRegistry.ObjectHolder("terraworld:stamp_sharpening_kit")
    public static final ItemBase STAMP_SHARPENING_KIT = new ItemBase("stamp_sharpening_kit");

    @GameRegistry.ObjectHolder("terraworld:stamp_shovel_head")
    public static final ItemBase STAMP_SHOVEL_HEAD = new ItemBase("stamp_shovel_head");

    @GameRegistry.ObjectHolder("terraworld:stamp_sign_head")
    public static final ItemBase STAMP_SIGN_HEAD = new ItemBase("stamp_sign_head");

    @GameRegistry.ObjectHolder("terraworld:stamp_sword_blade")
    public static final ItemBase STAMP_SWORD_BLADE = new ItemBase("stamp_sword_blade");

    @GameRegistry.ObjectHolder("terraworld:stamp_tool_rod")
    public static final ItemBase STAMP_TOOL_ROD = new ItemBase("stamp_tool_rod");

    @GameRegistry.ObjectHolder("terraworld:stamp_tough_binding")
    public static final ItemBase STAMP_TOUGH_BINDING = new ItemBase("stamp_tough_binding");

    @GameRegistry.ObjectHolder("terraworld:stamp_tough_tool_rod")
    public static final ItemBase STAMP_TOUGH_TOOL_ROD = new ItemBase("stamp_tough_tool_rod");

    @GameRegistry.ObjectHolder("terraworld:stamp_wide_guard")
    public static final ItemBase STAMP_WIDE_GUARD = new ItemBase("stamp_wide_guard");

    @GameRegistry.ObjectHolder("terraworld:plumed_belt")
    public static final ItemPlumedBelt PLUMED_BELT = new ItemPlumedBelt();

    @GameRegistry.ObjectHolder("terraworld:bloody_thorn_ring")
    public static final ItemBloodyThornRing BLOODY_THORN_RING = new ItemBloodyThornRing();

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        COPPER_DUST.initModel();
        LEAD_DUST.initModel();
        SILVER_DUST.initModel();
        NICKEL_DUST.initModel();
        ALUMINUM_DUST.initModel();
        ADAMANTINE_INGOT.initModel();
        ADAMANTINE_DUST.initModel();
        ADAMANTINE_NUGGET.initModel();
        MITHRIL_INGOT.initModel();
        MITHRIL_DUST.initModel();
        MITHRIL_NUGGET.initModel();
        PLATINUM_INGOT.initModel();
        PLATINUM_DUST.initModel();
        PLATINUM_NUGGET.initModel();
        ZINC_INGOT.initModel();
        ZINC_DUST.initModel();
        ZINC_NUGGET.initModel();
        AQUARIME_INGOT.initModel();
        AQUARIME_DUST.initModel();
        AQUARIME_NUGGET.initModel();
        STEEL_INGOT.initModel();
        STEEL_DUST.initModel();
        STEEL_NUGGET.initModel();
        ORICHALCUM_INGOT.initModel();
        ORICHALCUM_DUST.initModel();
        ORICHALCUM_NUGGET.initModel();
        BLOOD_BRONZE_INGOT.initModel();
        STAMP_ARMOR_PLATE.initModel();
        STAMP_ARMOR_TRIM.initModel();
        STAMP_ARROW_HEAD.initModel();
        STAMP_ARROW_SHAFT.initModel();
        STAMP_AXE_HEAD.initModel();
        STAMP_BINDING.initModel();
        STAMP_BOOTS_CORE.initModel();
        STAMP_BOW_LIMB.initModel();
        STAMP_BOW_STRING.initModel();
        STAMP_BROAD_AXE_HEAD.initModel();
        STAMP_CHEST_CORE.initModel();
        STAMP_CROSS_GUARD.initModel();
        STAMP_EMERALD.initModel();
        STAMP_EXCAVATOR_HEAD.initModel();
        STAMP_FLETCHING.initModel();
        STAMP_HAMMER_HEAD.initModel();
        STAMP_HAND_GUARD.initModel();
        STAMP_HELMET_CORE.initModel();
        STAMP_KAMA_HEAD.initModel();
        STAMP_KNIFE_BLADE.initModel();
        STAMP_LARGE_PLATE.initModel();
        STAMP_LARGE_SWORD_BLADE.initModel();
        STAMP_LEGGINGS_CORE.initModel();
        STAMP_PAN_HEAD.initModel();
        STAMP_PICK_HEAD.initModel();
        STAMP_POLISHING_KIT.initModel();
        STAMP_SCYTHE_HEAD.initModel();
        STAMP_SHARD.initModel();
        STAMP_SHARPENING_KIT.initModel();
        STAMP_SHOVEL_HEAD.initModel();
        STAMP_SIGN_HEAD.initModel();
        STAMP_SWORD_BLADE.initModel();
        STAMP_TOOL_ROD.initModel();
        STAMP_TOUGH_BINDING.initModel();
        STAMP_TOUGH_TOOL_ROD.initModel();
        STAMP_WIDE_GUARD.initModel();
        PLUMED_BELT.initModel();
        BLOODY_THORN_RING.initModel();
    }

    public static void registerItems(RegistryEvent.Register<Item> event) {
        COPPER_DUST.register(event);
        LEAD_DUST.register(event);
        SILVER_DUST.register(event);
        NICKEL_DUST.register(event);
        ALUMINUM_DUST.register(event);
        ADAMANTINE_INGOT.register(event);
        ADAMANTINE_DUST.register(event);
        ADAMANTINE_NUGGET.register(event);
        MITHRIL_INGOT.register(event);
        MITHRIL_DUST.register(event);
        MITHRIL_NUGGET.register(event);
        PLATINUM_INGOT.register(event);
        PLATINUM_DUST.register(event);
        PLATINUM_NUGGET.register(event);
        ZINC_INGOT.register(event);
        ZINC_DUST.register(event);
        ZINC_NUGGET.register(event);
        AQUARIME_INGOT.register(event);
        AQUARIME_DUST.register(event);
        AQUARIME_NUGGET.register(event);
        STEEL_INGOT.register(event);
        STEEL_DUST.register(event);
        STEEL_NUGGET.register(event);
        ORICHALCUM_INGOT.register(event);
        ORICHALCUM_DUST.register(event);
        ORICHALCUM_NUGGET.register(event);
        BLOOD_BRONZE_INGOT.register(event);
        STAMP_ARMOR_PLATE.register(event);
        STAMP_ARMOR_TRIM.register(event);
        STAMP_ARROW_HEAD.register(event);
        STAMP_ARROW_SHAFT.register(event);
        STAMP_AXE_HEAD.register(event);
        STAMP_BINDING.register(event);
        STAMP_BOOTS_CORE.register(event);
        STAMP_BOW_LIMB.register(event);
        STAMP_BOW_STRING.register(event);
        STAMP_BROAD_AXE_HEAD.register(event);
        STAMP_CHEST_CORE.register(event);
        STAMP_CROSS_GUARD.register(event);
        STAMP_EMERALD.register(event);
        STAMP_EXCAVATOR_HEAD.register(event);
        STAMP_FLETCHING.register(event);
        STAMP_HAMMER_HEAD.register(event);
        STAMP_HAND_GUARD.register(event);
        STAMP_HELMET_CORE.register(event);
        STAMP_KAMA_HEAD.register(event);
        STAMP_KNIFE_BLADE.register(event);
        STAMP_LARGE_PLATE.register(event);
        STAMP_LARGE_SWORD_BLADE.register(event);
        STAMP_LEGGINGS_CORE.register(event);
        STAMP_PAN_HEAD.register(event);
        STAMP_PICK_HEAD.register(event);
        STAMP_POLISHING_KIT.register(event);
        STAMP_SCYTHE_HEAD.register(event);
        STAMP_SHARD.register(event);
        STAMP_SHARPENING_KIT.register(event);
        STAMP_SHOVEL_HEAD.register(event);
        STAMP_SIGN_HEAD.register(event);
        STAMP_SWORD_BLADE.register(event);
        STAMP_TOOL_ROD.register(event);
        STAMP_TOUGH_BINDING.register(event);
        STAMP_TOUGH_TOOL_ROD.register(event);
        STAMP_WIDE_GUARD.register(event);
        PLUMED_BELT.register(event);
        BLOODY_THORN_RING.register(event);
    }

}
