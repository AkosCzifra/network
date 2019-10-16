package com.codecool.network.devices;

public class Normal extends DeviceWithScreen {

    private int dateOfManufacture;

    public Normal(int age, int batteryLife, ScreenSize screenSize, int dateOfManufacture) {
        super(age, batteryLife, screenSize);
        this.dateOfManufacture = dateOfManufacture;
    }

    @Override
    public int remainingPower() {
        int result = batteryLife;
        result -= age * 3;
        if (dateOfManufacture > 2000)
            result = result * 2;
        else
            result = result / 2;
        System.out.println(result);
        return result;
    }
}
