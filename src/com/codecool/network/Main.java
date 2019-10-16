package com.codecool.network;

import com.codecool.network.devices.Connected;
import com.codecool.network.devices.Normal;
import com.codecool.network.devices.ScreenSize;
import com.codecool.network.devices.Smart;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Network network = new Network();
        Normal normal1 = new Normal(20, 1000, ScreenSize.UHD, 1994);
        Normal normal2 = new Normal(10, 1500, ScreenSize.FULL_HD, 2005);
        Smart smart1 = new Smart(30, 100, ScreenSize.HD);
        Smart smart2 = new Smart(50, 200, ScreenSize.UHD);
        Connected connected1 = new Connected(50, 1000);
        Connected connected2 = new Connected(20, 2000);
        network.addNormalDevice(normal1);
        network.addNormalDevice(normal2);
        network.addSmartDevice(smart1);
        network.addSmartDevice(smart2);
        network.addConnectedDevice(connected1);
        network.addConnectedDevice(connected2);
        network.getConnectedDevices();
        System.out.println(smart1.getNumberOfNormalDevices(500));
        System.out.println(connected1.getNumberOfConnectedDevices());
    }
}
