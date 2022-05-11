package org.example.listeners;

import org.example.devices.DisplayDevice;
import org.example.listeners.ListenerInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListenerParent implements ListenerInterface {
    protected float humidity;
    protected float pressure;
    protected float temperature;
    protected List<DisplayDevice> devices = new ArrayList<>();
    Integer id = 0;
    @Override
    public void update(float humidity, float preassure, float temperature) {
        this.humidity = humidity;
        this.pressure = preassure;
        this.temperature = temperature;
    }

    public void addDevice(DisplayDevice device) {
        devices.add(device);
    }
}

