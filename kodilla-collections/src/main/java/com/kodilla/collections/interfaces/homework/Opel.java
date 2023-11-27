package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    @Override
    public void decreaseSpeed() {
        speed -= 8;
        if (speed < 0) {
            speed = 0;
        }
    }
}
