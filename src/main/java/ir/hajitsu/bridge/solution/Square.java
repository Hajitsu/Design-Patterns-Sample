package ir.hajitsu.bridge.solution;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        getColor().applyColor();
    }

    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
