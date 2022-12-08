package ir.hajitsu.bridge.solution;

public class Main {
    public static void main(String[] args) {
        Color blue = new Blue();
        Circle blueCircle = new Circle(blue);
        blueCircle.applyColor();
        blueCircle.draw();
    }
}
