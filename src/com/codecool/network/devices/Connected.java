package com.codecool.network.devices;

import com.codecool.network.ConnectedHandler;

public class Connected extends Device {

    private ConnectedHandler connectedHandler;

    public Connected(int age, int batteryLife) {
        super(age, batteryLife);
    }

    @Override
    public int remainingPower() {
        int result = batteryLife;
        result -= age * 7;
        result += getNumberOfConnectedDevices() * 20;
        return result;
    }

    public void setConnectedHandler(ConnectedHandler connectedHandler) {
        this.connectedHandler = connectedHandler;
    }

    public int getNumberOfConnectedDevices() {
        return connectedHandler.getConnectedDevices();
    }
}
