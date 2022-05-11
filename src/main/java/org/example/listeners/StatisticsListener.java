package org.example.listeners;

import org.example.devices.DisplayDevice;

public class StatisticsListener extends ListenerParent{
    private String statisticinfo;

    public StatisticsListener() {
    }

    public void update(float humidity, float temperature, float preassure) {
        statisticinfo = "Statistics changing";
        for (DisplayDevice device :
                this.devices) {
            device.preassureinfo = statisticinfo;
        }
    }
}
