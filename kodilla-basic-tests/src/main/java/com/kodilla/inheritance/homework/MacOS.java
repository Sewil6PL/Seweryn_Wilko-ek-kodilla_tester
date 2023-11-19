package com.kodilla.inheritance.homework;

public class MacOS extends OperatingSystem {


    public void turnOn() {
        System.out.println("macOS is starting up...");
    }

    public void turnOff() {
        System.out.println("macOS is shutting down...");
    }

    public MacOS(int releaseYear) {
        super(releaseYear);
    }

}
