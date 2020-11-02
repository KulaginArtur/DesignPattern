package com.tehtävä4;

public class Main {

    public static void main(String[] args) {

        ClockTimer timer = new ClockTimer();
        DigitalClock digitalClock = new DigitalClock(timer);

        digitalClock.update(timer);
    }
}
