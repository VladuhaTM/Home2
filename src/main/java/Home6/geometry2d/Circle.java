package Home6.geometry2d;

import Home6.exceptions.InvalidParameterException;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new InvalidParameterException("Радиус должен быть положительным числом.");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Круг [радиус = " + radius + "]";
    }
}