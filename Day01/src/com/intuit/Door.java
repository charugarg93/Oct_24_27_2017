package com.intuit;

public class Door {
    private String material;
    private Alarm alarm;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public void open(){
        alarm.activate();
    }
    public void close(){
        alarm.deactivate();
    }
}
