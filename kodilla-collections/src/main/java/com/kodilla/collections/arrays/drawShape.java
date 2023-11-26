package com.kodilla.collections.arrays;



import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.awt.*;
import java.util.Random;

public class drawShape {
    private static Shape drawShape() {
        Random random = new Random();
        int drawnShapeKind = random.nextInt(3);
        double a = getRandomSize(random);
        if (drawnShapeKind == 0)
            return (Shape) new Circle(a);
        else if (drawnShapeKind == 1)
            return (Shape) new Square(a);
        else {
            double b = getRandomSize(random);
            double c = getRandomSize(random);
            return (Shape) new Triangle(a, b, c);
        }
    }

    private static double getRandomSize(Random random) {
        return random.nextDouble() * 100 + 1;
    }
}
