package com.codecool.network.devices;

public abstract class DeviceWithScreen extends Device {
    protected ScreenSize screenSize;

    protected DeviceWithScreen(int age, int batteryLife, ScreenSize screenSize) {
        super(age, batteryLife);
        this.screenSize = screenSize;
    }
}
