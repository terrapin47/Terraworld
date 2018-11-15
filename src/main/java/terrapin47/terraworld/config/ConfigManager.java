package terrapin47.terraworld.config;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.fml.common.Mod;
import terrapin47.terraworld.Terraworld;

@Config(modid = Terraworld.MODID)
@Mod.EventBusSubscriber(modid = Terraworld.MODID)
public class ConfigManager {

    @Config.Comment(("Terraworld metals and their components."))
    public static ConfigMetals metals = new ConfigMetals();

    public static class ConfigMetals {

        @Config.Comment(("Enable Adamantine Block"))
        public boolean enableBlockAdamantine = true;

        @Config.Comment(("Enable Adamantine Ingot"))
        public boolean enableIngotAdamantine = true;

        @Config.Comment(("Enable Adamantine Dust"))
        public boolean enableDustAdamantine = true;

        @Config.Comment(("Enable Adamantine Nugget"))
        public boolean enableNuggetAdamantine = true;

        @Config.Comment(("Enable Adamantine Ore"))
        public boolean enableOreAdamantine = true;


        @Config.Comment(("Enable Aquarime Block"))
        public boolean enableBlockAquarime = true;

        @Config.Comment(("Enable Aquarime Ingot"))
        public boolean enableIngotAquarime = true;

        @Config.Comment(("Enable Aquarime Dust"))
        public boolean enableDustAquarime = true;

        @Config.Comment(("Enable Aquarime Nugget"))
        public boolean enableNuggetAquarime = true;


        @Config.Comment(("Enable Mithril Block"))
        public boolean enableBlockMithril = true;

        @Config.Comment(("Enable Mithril Ingot"))
        public boolean enableIngotMithril = true;

        @Config.Comment(("Enable Mithril Dust"))
        public boolean enableDustMithril = true;

        @Config.Comment(("Enable Mithril Nugget"))
        public boolean enableNuggetMithril = true;

        @Config.Comment(("Enable Mithril Ore"))
        public boolean enableOreMithril = true;


        @Config.Comment(("Enable Orichalcum Block"))
        public boolean enableBlockOrichalcum = true;

        @Config.Comment(("Enable Orichalcum Ingot"))
        public boolean enableIngotOrichalcum = true;

        @Config.Comment(("Enable Orichalcum Dust"))
        public boolean enableDustOrichalcum = true;

        @Config.Comment(("Enable Orichalcum Nugget"))
        public boolean enableNuggetOrichalcum = true;

        @Config.Comment(("Enable Orichalcum Ore"))
        public boolean enableOreOrichalcum = true;


        @Config.Comment(("Enable Platinum Block"))
        public boolean enableBlockPlatinum = true;

        @Config.Comment(("Enable Platinum Ingot"))
        public boolean enableIngotPlatinum = true;

        @Config.Comment(("Enable Platinum Dust"))
        public boolean enableDustPlatinum = true;

        @Config.Comment(("Enable Platinum Nugget"))
        public boolean enableNuggetPlatinum = true;

        @Config.Comment(("Enable Platinum Ore"))
        public boolean enableOrePlatinum = true;


        @Config.Comment(("Enable Zinc Block"))
        public boolean enableBlockZinc = true;

        @Config.Comment(("Enable Zinc Ingot"))
        public boolean enableIngotZinc = true;

        @Config.Comment(("Enable Zinc Dust"))
        public boolean enableDustZinc = true;

        @Config.Comment(("Enable Zinc Nugget"))
        public boolean enableNuggetZinc = true;

        @Config.Comment(("Enable Zinc Ore"))
        public boolean enableOreZinc = true;


        @Config.Comment(("Enable Steel Block"))
        public boolean enableBlockSteel = true;

        @Config.Comment(("Enable Steel Ingot"))
        public boolean enableIngotSteel = true;

        @Config.Comment(("Enable Steel Dust"))
        public boolean enableDustSteel = true;

        @Config.Comment(("Enable Steel Nugget"))
        public boolean enableNuggetSteel = true;


        @Config.Comment(("Enable Aluminum Dust"))
        public boolean enableDustAluminum = true;

        @Config.Comment(("Enable Copper Dust"))
        public boolean enableDustCopper = true;

        @Config.Comment(("Enable Lead Dust"))
        public boolean enableDustLead = true;

        @Config.Comment(("Enable Nickel Dust"))
        public boolean enableDustNickel = true;

        @Config.Comment(("Enable Silver Dust"))
        public boolean enableDustSilver = true;

    }

}
