package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kia kia = (Kia) o;
        return speed == kia.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
