package Home6.geometry2d;

import Home6.exceptions.InvalidParameterException;

public class Rectangle implements Figure {
    private double width; // Ширина прямоугольника
    private double height; // Высота прямоугольника

    // Конструктор
    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new InvalidParameterException("Ширина и высота должны быть положительными числами.");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height; // Площадь прямоугольника: ширина * высота
    }

    @Override
    public double perimeter() {
        return 2 * (width + height); // Периметр прямоугольника: 2 * (ширина + высота)
    }

    @Override
    public String toString() {
        return "Прямоугольник [ширина = " + width + ", высота = " + height + "]";
    }
}