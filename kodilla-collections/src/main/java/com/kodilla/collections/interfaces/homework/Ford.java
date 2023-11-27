package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed;

    public Ford() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 20;
    }

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
        if (speed < 0) {
            speed = 0;
        }
    }
}
