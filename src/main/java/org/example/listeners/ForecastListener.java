package org.example.listeners;

import org.example.devices.DisplayDevice;

public class ForecastListener extends ListenerParent {
    private String forecast;

    public ForecastListener() {
    }

    public void update(float humidity, float temperature, float preassure) {
        forecast = "Forecast changing";
        for (DisplayDevice device :
                this.devices) {
            device.forecastinfo = forecast;
        }
    }
}
