package ru.dolya.Adapter;

public class Computer {
    public void read(USB usb) {
        usb.input();
        System.out.println("Data has been read");
    }
}
