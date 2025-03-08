package Home2;

public class Balance {
    private int rightWeight;
    private int leftWeight;

    public Balance() {
        rightWeight = 0;
        leftWeight = 0;
    }

    public void addRight(int weight) {
        rightWeight += weight;
    }

    public void addLeft(int weight) {
        leftWeight += weight;
    }

    public void result() {
        if (leftWeight > rightWeight) {
            System.out.println("Left > Right");
        } else if (rightWeight > leftWeight) {
               System.out.println("Right > Left");
        } else {
            System.out.println("Right = Left");
        }
    }
}

