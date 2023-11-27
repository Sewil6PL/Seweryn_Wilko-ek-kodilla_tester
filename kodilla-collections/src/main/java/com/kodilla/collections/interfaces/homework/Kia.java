package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {
    private int speed;

    public Kia() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 30;
    }

    @Override
    public String toString() {
        return "Kia{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public void decreaseSpeed() {
        speed -= 11;
        if (speed < 0) {
            speed = 0;
        }
    }
}
