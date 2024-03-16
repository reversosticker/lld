package org.lld;


import org.lld.design.WeatherUI;

public class AdapterPatternMain {

    public static void main(String[] args) {
        WeatherUI weatherUI = new WeatherUI();
        weatherUI.showTemperature(19406);
    }

}