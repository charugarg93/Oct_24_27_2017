package com.intuit;

public class SoundAlarm implements Alarm {
    @Override
    public void activate() {
        System.out.println("SoundAlarm activated");
    }

    @Override
    public void deactivate() {
        System.out.println("SoundALarm deactivated");
    }
}
