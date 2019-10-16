package com.codecool.network;

import com.codecool.network.devices.Connected;
import com.codecool.network.devices.Normal;
import com.codecool.network.devices.Smart;

import java.util.ArrayList;
import java.util.List;

public class Network implements ConnectedHandler, PowerHandler {
    private List<Normal> normalDevices = new ArrayList<>();
    private List<Smart> smartDevices = new ArrayList<>();
    private List<Connected> connectedDevices = new ArrayList<>();


    public void addNormalDevice(Normal normalDevice) {
        normalDevices.add(normalDevice);
    }

    public void addSmartDevice(Smart smartDevice) {
        smartDevice.setPowerHandler(this);
        smartDevices.add(smartDevice);
    }

    public void addConnectedDevice(Connected connectedDevice) {
        connectedDevice.setConnectedHandler(this);
        connectedDevices.add(connectedDevice);
    }

    @Override
    public int getConnectedDevices() {
        return connectedDevices.size();
    }

    @Override
    public int getNumberOfNormalDevicesRemainingPower(int range, int batteryLife) {
        int counter = 0;
        for (Normal normalDevice : normalDevices) {
            if (Math.abs(batteryLife - normalDevice.remainingPower()) <= range) {
                counter++;
            }
        }
        return counter;
    }
}





