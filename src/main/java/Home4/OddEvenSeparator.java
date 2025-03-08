package Home4;

import java.util.ArrayList;

public class OddEvenSeparator {
    private ArrayList<Integer> numbers;
    private ArrayList<Integer> evenNumbers;
    private ArrayList<Integer> oddNumbers;

    public OddEvenSeparator() {
        numbers = new ArrayList<>();
        evenNumbers = new ArrayList<>();
        oddNumbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }
    }

    public void even() {
        System.out.println("Even numbers: " + evenNumbers);

    }

    public void odd() {
        System.out.println("Odd numbers: " + oddNumbers);
    }
}