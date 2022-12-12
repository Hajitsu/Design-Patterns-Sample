package ir.hajitsu.state;

public class On implements RemoteControl {
    public static On INSTANCE = new On();

    public On() {
    }

    @Override
    public void switchState(TV tv) {
        System.out.println("TV is now on");
        tv.setState(Off.INSTANCE);
        System.out.println("TV turned OFF");
    }
}
