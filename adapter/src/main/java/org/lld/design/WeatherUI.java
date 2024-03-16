package org.lld.design;

import org.lld.design.adapter.WeatherAdapter;

//caller class
public class WeatherUI {
    public  void showTemperature(int zipcode){
        WeatherAdapter weatherAdapter =  new WeatherAdapter();
        System.out.println(weatherAdapter.findTemperature(zipcode));
    }
}
