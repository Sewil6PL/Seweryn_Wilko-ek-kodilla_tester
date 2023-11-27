package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> carsList = new ArrayList<>();
        Ford ford = new Ford();
        carsList.add(new Ford());
        carsList.add(new Opel());
        carsList.add(new Kia());

        System.out.println("Zawartość kolekcji przed usunięciem:");
        System.out.println(carsList.size());
        for (Car car : carsList) {
            CarUtils.describeCar(car);
        }

        carsList.remove(1);
        carsList.remove(ford);

        Kia kia = new Kia();
        carsList.remove(kia);

        System.out.println("Zawartość kolekcji po usunięciu:");
        System.out.println(carsList.size());
        for (Car car : carsList) ;

    }
}
