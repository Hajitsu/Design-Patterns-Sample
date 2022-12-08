package ir.hajitsu.bridge.solution;

public abstract class Shape {
    protected Color color;

    public Color getColor() {
        return color;
    }

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();

    public abstract void draw();
}
