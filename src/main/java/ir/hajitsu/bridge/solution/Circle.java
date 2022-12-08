package ir.hajitsu.bridge.solution;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        getColor().applyColor();
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
