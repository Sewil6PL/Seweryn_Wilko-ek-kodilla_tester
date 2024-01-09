package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {
    public Cabrio(boolean isNight) {
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return false;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
