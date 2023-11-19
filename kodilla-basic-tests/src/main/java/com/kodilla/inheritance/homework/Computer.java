package com.kodilla.inheritance.homework;

public class Computer {

    public static void main(String[] args) {


        Windows windows = new Windows();
        windows.turnOn();
        System.out.println("Windows Release Year: " + windows.getReleaseYear());
        windows.turnOff();


        MacOS macos = new MacOS();
        macos.turnOn();
        System.out.println("macOS Release Year: " + macos.getReleaseYear());
        macos.turnOff();

    }
}

