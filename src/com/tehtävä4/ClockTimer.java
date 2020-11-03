package com.tehtävä4;

import java.time.LocalTime;
import java.util.Observable;

public class ClockTimer extends Observable implements Runnable {

    int hour;
    int minute;
    int second;

    public String toString() {
        return hour + ":" + minute + ":" + second ;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            tick();
        }
    }
    void tick() {
        LocalTime localTime = LocalTime.now();

        hour    = localTime.getHour();
        minute  = localTime.getMinute();
        second  = localTime.getSecond();

        setChanged();
        notifyObservers(toString());
    }
}
