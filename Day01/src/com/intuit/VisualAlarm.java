package com.intuit;

public class VisualAlarm implements Alarm{
    @Override
    public void activate() {
        System.out.println("VisualAlarm activated");
    }

    @Override
    public void deactivate() {
        System.out.println("VisualAlarm deactivated");
    }
}
