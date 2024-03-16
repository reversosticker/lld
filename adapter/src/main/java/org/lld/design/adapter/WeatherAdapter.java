package org.lld.design.adapter;

import org.lld.design.WeatherFinder;
import org.lld.design.impl.WeatherFinderImpl;

public class WeatherAdapter {
    public int findTemperature(int zipcode){
        String city = null;
        if(zipcode == 19406){
            city = "king Of Prussia";
        }
        WeatherFinder finder = new WeatherFinderImpl();
        return  finder.find(city);
    }
}
