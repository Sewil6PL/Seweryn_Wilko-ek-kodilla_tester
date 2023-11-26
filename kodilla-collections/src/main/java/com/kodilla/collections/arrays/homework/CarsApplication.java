package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    public static Car drawCar() {
        Random random = new Random();
        int randomSpeed = random.nextInt(100);
        int carType = random.nextInt(3);

        switch (carType) {
            case 0:
                return new Ford();
            case 1:
                return new Opel();
            case 2:
                return new Kia();
            default:
                throw new IllegalStateException("Unexpected value: " + carType);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = random.nextInt(15) + 1;
        Car[] cars = new Car[arraySize];

        for (int i = 0; i < arraySize; i++) {
            cars[i] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }


}
