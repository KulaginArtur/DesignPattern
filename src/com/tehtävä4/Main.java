package com.tehtävä4;

import java.util.Observable;

public class Main {

    public static void main(String[] args) {

        Observable ct = new ClockTimer();

        new DigitalClock(ct);
        new Thread((Runnable) ct).start();
    }
}
