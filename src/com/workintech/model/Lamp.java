package com.workintech.model;

import com.workintech.enums.LampType;

public class Lamp {
    private LampType lamptype;
    private boolean battery;
    private int globRating;

    public Lamp(LampType lamptype, boolean battery, int globRating) {
        this.lamptype = lamptype;
        this.battery = battery;
        this.globRating = globRating;
    }

    public LampType getLamptype() {
        return lamptype;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on");
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "lamptype=" + lamptype.name() +
                ", battery=" + battery +
                ", globRating=" + globRating +
                '}';
    }
}
