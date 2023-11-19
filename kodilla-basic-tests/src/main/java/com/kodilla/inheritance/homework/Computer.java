package com.kodilla.inheritance.homework;

public class Computer {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2000);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        System.out.println("Operating System Release Year: " + operatingSystem.getReleaseYear());


        Windows windows = new Windows(1985);
        windows.turnOn();
        windows.turnOff();
        System.out.println("Windows Release Year: " + windows.getReleaseYear());


        MacOS macos = new MacOS(2001);
        macos.turnOn();
        macos.turnOff();
        System.out.println("macOS Release Year: " + macos.getReleaseYear());
    }
}

