package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {


    public Windows() {
        super(1994);
    }
    @Override
    public void turnOn() {
        System.out.println("Windows is starting up...");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows is shutting down...");
    }
}


