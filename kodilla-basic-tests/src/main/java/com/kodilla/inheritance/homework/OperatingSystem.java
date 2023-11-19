package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private  int releaseYear;

    public OperatingSystem(int releaseYearnt) {

    }



    public void turnOn() {
        System.out.println("Turning on the operating system");
    }

    public void turnOff() {
        System.out.println("Turning off the operating system");
    }

    public int getReleaseYear() {
        return releaseYear;
    }
    public void displayReleaseYear(){
        System.out.println("Release Year: " + releaseYear);
    }
}
