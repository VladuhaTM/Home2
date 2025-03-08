import Home1.Button;
import Home2.Balance;
import Home3.Bell;
import Home4.OddEvenSeparator;
import Home5.Table;

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
    }
}


