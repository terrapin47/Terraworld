package terrapin47.terraworld.util;

import terrapin47.terraworld.config.ConfigManager;

public class MiscUtils {

    public static String uncapitalizeFirst(String string) {
        char c[] = string.toCharArray();
        c[0] = Character.toLowerCase(c[0]);
        return new String(c);
    }

    public static String capitalizeFirst(String string) {
        char c[] = string.toCharArray();
        c[0] = Character.toUpperCase(c[0]);
        return new String(c);
    }

    public static boolean getConfigForOredict(String oredict) {
        try {
            return ConfigManager.metals.getClass().getField("enable" + capitalizeFirst(oredict)).getBoolean(ConfigManager.metals);
        } catch (Exception e) {
            System.out.println("Error: Cannot find the item in configs.  Assuming there is no config option.");
            return true;
        }
    }

}
