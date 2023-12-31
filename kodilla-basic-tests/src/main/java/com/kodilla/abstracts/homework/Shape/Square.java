package com.kodilla.abstracts.homework.Shape;

public class Square extends Shape{
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side*side;
    }

    @Override
    double calculatePerimeter() {
        return 4*side;
    }
}
