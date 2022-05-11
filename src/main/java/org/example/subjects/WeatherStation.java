package org.example.subjects;

import org.example.listeners.ListenerParent;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    protected float humidity;
    protected float pressure;
    protected float temperature;
    List<ListenerParent> listeners = new ArrayList<>();
    public void set(float humidity, float pressure, float temperature) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        notifyObserver();
    }
    @Override
    public void registerObserver(ListenerParent listener) {
        listeners.add(listener);
    }

    @Override
    public void removeObserver(ListenerParent listener) {
        listeners.remove(listener);
    }

    @Override
    public void notifyObserver() {
        for (ListenerParent it:
             listeners) {
            it.update(humidity, pressure, temperature);
        }
    }
}
