package util;

import org.junit.Assert;

import java.util.HashMap;

public class Urls {

    HashMap<String, String> urlsByCar = new HashMap<>();

    public void setUrls(String maker, String model, String site, String generation, String url){
        urlsByCar.putIfAbsent(maker + "_" + model + "_" + generation + "_" + site, url);
    }

    public String getUrlByCarAndSite(String maker, String model, String site, String generation){
        return urlsByCar.get(maker + "_" + model + "_" + generation + "_" + site);
    }
}
