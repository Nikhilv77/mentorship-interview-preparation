package org.example.oop.smarthomesystem;

public class SmartSpeaker extends SmartDevice {
    public SmartSpeaker(String name){
        super(name);
    }
    @Override
    public void turnOn(){
        System.out.println(deviceName + " speaker has been turned on");
    }
}