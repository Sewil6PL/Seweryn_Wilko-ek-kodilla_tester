package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford();
        Opel opel = new Opel();
        Kia kia = new Kia();

        System.out.println("Race with Ford:");
        doRace(ford);

        System.out.println("Race with Opel:");
        doRace(opel);

        System.out.println("Race with Kia:");
        doRace(kia);
    }

    public static void doRace(Car car) {
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }

        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }

        System.out.println("Final speed: " + car.getSpeed());
    }
}

