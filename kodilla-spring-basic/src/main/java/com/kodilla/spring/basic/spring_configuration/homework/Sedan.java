package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {
    public Sedan(boolean isNight) {
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return false;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
