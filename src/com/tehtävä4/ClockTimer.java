package com.tehtävä4;

import java.time.LocalTime;

public class ClockTimer extends Subject {

    LocalTime localTime = LocalTime.now();

    public int getHour() {
        return localTime.getHour();
    }

    public int getMinute() {
        return localTime.getMinute();
    }

    public int getSecond() {
        return localTime.getSecond();
    }

    void tick() {
        notifyObserver();
    }
}
