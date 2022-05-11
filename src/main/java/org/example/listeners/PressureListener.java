package org.example.listeners;

import org.example.devices.DisplayDevice;

public class PressureListener extends ListenerParent {
    private String preassureinfo;

    public PressureListener() {
    }

    public void update(float humidity, float temperature, float preassure) {
        preassureinfo = "Pressure changing";
        for (DisplayDevice device :
                this.devices) {
            device.preassureinfo = preassureinfo;
        }
    }
}
