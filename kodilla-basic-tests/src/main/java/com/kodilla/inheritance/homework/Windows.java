package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {


    public void turnOn() {
        System.out.println("Windows is starting up...");

    }

    public void turnOff() {
        System.out.println("Windows is shutting down...");
    }

    public Windows(int releaseYear) {
        super(releaseYear);
    }
}
