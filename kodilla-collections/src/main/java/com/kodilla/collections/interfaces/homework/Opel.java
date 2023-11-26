package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed;

    public Opel() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 15;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 8;
        if (speed < 0) {
            speed = 0;
        }
    }
}
