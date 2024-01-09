package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {
    public SUV(boolean isNight) {
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return false;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
