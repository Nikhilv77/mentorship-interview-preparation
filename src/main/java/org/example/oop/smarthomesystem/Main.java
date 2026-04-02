package org.example.oop.smarthomesystem;

public class Main {
    public static void main(String[] args){
        SmartDevice[] devices = new SmartDevice[]{
                new SmartLight("Bedroom"),
                new SmartSpeaker("Living Room")
        };
        for(SmartDevice device: devices){
            device.turnOn();
        }
    }
}
