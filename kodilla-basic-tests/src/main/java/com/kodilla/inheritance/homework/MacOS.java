package com.kodilla.inheritance.homework;

public class MacOS extends OperatingSystem {
    public MacOS() {

        super(2020);
    }

    @Override
    public void turnOn() {
        System.out.println("macOS is booting up...");
    }

    @Override
    public void turnOff() {
        System.out.println("macOS is powering off...");
    }


}
