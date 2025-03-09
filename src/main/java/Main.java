import Home1.Button;
import Home2.Balance;
import Home3.Bell;
import Home4.OddEvenSeparator;
import Home5.Table;
import Home6.geometry2d.Circle;
import Home6.geometry2d.Rectangle;
import Home6.geometry3d.Cylinder;
import Home6.exceptions.InvalidParameterException;
import Home6.exceptions.NegativeHeightException;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nTask 1: ");
        Button myButton = new Button();

        myButton.click();
        myButton.click();
        myButton.click();

        System.out.println("\nTask 2: ");
        Balance balance = new Balance();

        balance.addLeft(10);
        balance.addRight(15);
        balance.result();

        balance.addLeft(5);
        balance.result();

        balance.addRight(-5);
        balance.result();

        System.out.println("\nTask 3: ");
        Bell bell = new Bell();

        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();

        System.out.println("\nTask 4: ");
        OddEvenSeparator separator = new OddEvenSeparator();

        separator.addNumber(2);
        separator.addNumber(2);
        separator.addNumber(8);
        separator.addNumber(1);
        separator.addNumber(3);
        separator.addNumber(3);
        separator.addNumber(7);

        separator.even();
        separator.odd();

        System.out.println("\nTask 5: ");

        Table table = new Table(3, 3); // Создаем таблицу 3x3
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(0, 2, 3);
        table.setValue(1, 0, 4);
        table.setValue(1, 1, 5);
        table.setValue(1, 2, 6);
        table.setValue(2, 0, 7);
        table.setValue(2, 1, 8);
        table.setValue(2, 2, 9);

        System.out.println("Table:");
        System.out.println(table);

        System.out.println("The value in the cell (1, 1): " + table.getValue(1, 1));

        System.out.println("Number of lines: " + table.rows());
        System.out.println("Number of columns: " + table.cols());

        System.out.println("Arithmetic mean: " + table.average());

        System.out.println("\nTask 6: ");

        try {
            // Создаем круг и прямоугольник
            Circle circle = new Circle(5);
            Rectangle rectangle = new Rectangle(4, 6);

            // Выводим информацию о фигурах
            System.out.println(circle);
            System.out.println("Area of a circle: " + circle.area());
            System.out.println("Perimeter of a circle: " + circle.perimeter());

            System.out.println(rectangle);
            System.out.println("Area of a rectangle: " + rectangle.area());
            System.out.println("The perimeter of a rectangle: " + rectangle.perimeter());

            // Создаем цилиндры
            Cylinder cylinder1 = new Cylinder(circle, 10);
            Cylinder cylinder2 = new Cylinder(rectangle, 8);

            // Выводим информацию о цилиндрах
            System.out.println(cylinder1);
            System.out.println("Volume of a cylinder with a circular base: " + cylinder1.volume());

            System.out.println(cylinder2);
            System.out.println("Volume of a cylinder with a rectangular base: " + cylinder2.volume());

        } catch (InvalidParameterException | NegativeHeightException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


