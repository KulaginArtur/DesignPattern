package com.tehtävä4;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {

    private Observable timer;

    public DigitalClock(Observable ct) {
        timer = ct;
        ct.addObserver(this);
    }

    public void update(Observable o, Object object) {
        if (o == timer) {
            System.out.println(object);
        }
    }

}
