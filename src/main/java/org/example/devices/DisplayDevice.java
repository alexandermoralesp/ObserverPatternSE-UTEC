package org.example.devices;

public class DisplayDevice {
    public String forecastinfo = "";
    public String preassureinfo = "";
    public String statisticsinfo = "";

    public DisplayDevice() {
    }

    public void show() {
        System.out.println("forecastinfo = " + forecastinfo);
        System.out.println("preassureinfo = " + preassureinfo);
        System.out.println("statisticsinfo = " + statisticsinfo);
    }
}
