package org.example.oop.smarthomesystem;

public class SmartDevice {
    String deviceName;
    public SmartDevice(String deviceName){
        this.deviceName = deviceName;
    }
    public void turnOn(){
        System.out.println("Device has been turned on" );
    }
}
