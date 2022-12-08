package ir.hajitsu.bridge.problem;

public class MainProblem {
    public static void main(String[] args) {
        Circle blueCircle =new BlueCircle();
        Square greenSquare = new GreenSquare();

        blueCircle.applyColor();
        greenSquare.applyColor();
    }
}
