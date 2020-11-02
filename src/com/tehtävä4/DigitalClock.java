package com.tehtävä4;

public class DigitalClock implements Observer{

    private ClockTimer timer;

    public DigitalClock(ClockTimer ct) {
        this.timer = ct;
        timer.attach(this);
    }
    public void update(Subject s) {
        if (s == timer) {
            draw();
        }
    }
    private void draw() {
        int hour    = timer.getHour();
        int minute  = timer.getMinute();
        int second  = timer.getSecond();

        System.out.println("Kello on: " + hour + ":" + minute + ":" + second);
    }
}
