package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {

    public static String getSearchUrl() {
        return getConfig().searchUrl();
    }

    public static String getSearchItem() {
        return getConfig().searchItem();
    }

    public static String getSearchResult() {
        return getConfig().searchResult();
    }

    public static WebConfig getConfig() {
        return ConfigFactory.newInstance().create(WebConfig.class, System.getProperties());
    }
}
