package com.intuit;

public class DoorFactory {
    public static Door getDoorWithSoundAlarm(){
        Door door = new Door();
        SoundAlarm alarm = new SoundAlarm();
        door.setAlarm(alarm);
        return door;
    }
    public static Door getDoorWithVisualAlarm(){
        Door door = new Door();
        VisualAlarm alarm = new VisualAlarm();
        door.setAlarm(alarm);
        return door;
    }
}
