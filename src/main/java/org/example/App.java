package org.example;

import org.example.devices.DisplayDevice;
import org.example.listeners.ForecastListener;
import org.example.listeners.PressureListener;
import org.example.listeners.StatisticsListener;
import org.example.subjects.WeatherStation;

import java.util.logging.Logger;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Observer Listener Practice");
        WeatherStation ws = new WeatherStation();
        ForecastListener fl = new ForecastListener();
        PressureListener pl = new PressureListener();
        StatisticsListener sl = new StatisticsListener();
        DisplayDevice dd =  new DisplayDevice();
        fl.addDevice(dd);
        pl.addDevice(dd);
        sl.addDevice(dd);
        ws.registerObserver(fl);
        ws.registerObserver(pl);
        ws.registerObserver(sl);
        for (int i = 0; i < 10; i++) {
            ws.set(0.1f,0.2f,0.3f);
            dd.show();
        }
    }
}