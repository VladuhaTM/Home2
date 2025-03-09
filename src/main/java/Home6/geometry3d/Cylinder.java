package Home6.geometry3d;

import Home6.geometry2d.Figure;
import Home6.exceptions.NegativeHeightException;

public class Cylinder {
    private Figure base; // Основание цилиндра
    private double height; // Высота цилиндра

    // Конструктор
    public Cylinder(Figure base, double height) {
        if (height <= 0) {
            throw new NegativeHeightException("The height of the cylinder must be positive..");
        }
        this.base = base;
        this.height = height;
    }

    // Метод для вычисления объема цилиндра
    public double volume() {
        return base.area() * height; // Объем цилиндра: площадь основания * высота
    }

    @Override
    public String toString() {
        return "Cylinder [base = " + base.toString() + ", height = " + height + "]";
    }
}