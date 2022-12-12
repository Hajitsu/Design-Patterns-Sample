package ir.hajitsu.state;

public class Test {
    public static void main(String[] args) {
        TV tv = new TV(On.INSTANCE);

        tv.togglePower();
    }
}
