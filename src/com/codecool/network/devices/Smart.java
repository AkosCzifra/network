package com.codecool.network.devices;

import com.codecool.network.PowerHandler;

import java.util.UUID;

public class Smart extends DeviceWithScreen {

    private UUID name;
    private PowerHandler powerHandler;

    public Smart(int age, int batteryLife, ScreenSize screenSize) {
        super(age, batteryLife, screenSize);
        name = UUID.randomUUID();
    }

    public void setPowerHandler(PowerHandler powerHandler) {
        this.powerHandler = powerHandler;
    }

    public int getNumberOfNormalDevices(int range) {
        return powerHandler.getNumberOfNormalDevicesRemainingPower(range, batteryLife);
    }

    @Override
    public int remainingPower() {
        int result = batteryLife;
        result -= age * 15;
        result -= screenSize.getSize();
        return result;
    }
}
