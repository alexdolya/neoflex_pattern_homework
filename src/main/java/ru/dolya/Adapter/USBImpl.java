package ru.dolya.Adapter;

public class USBImpl implements USB{
    @Override
    public void input() {
        System.out.println("USB has been input");
    }
}
