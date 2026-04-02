package org.example.oop.smarthomesystem;

public class SmartLight extends SmartDevice {
    public SmartLight(String name){
        super(name);
    }
    @Override
    public void turnOn(){
        System.out.println(deviceName + " light has been turned on");
    }
}
