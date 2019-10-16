package com.codecool.network.devices;

public enum ScreenSize {
    EDTV(5),
    HD(10),
    FULL_HD(15),
    UHD(20);

    private int size;

    ScreenSize(int screenSize) {
        size = screenSize;
    }

    public int getSize() {
        return size;
    }
}
