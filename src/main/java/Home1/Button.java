package Home1;

public class Button {
    private int clickCount;

    public Button() {
        clickCount = 0;
    }

    public void click() {
        clickCount++;
        System.out.println("Click count: " + clickCount);
    }
}