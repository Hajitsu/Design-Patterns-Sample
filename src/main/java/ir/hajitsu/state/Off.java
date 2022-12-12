package ir.hajitsu.state;

public class Off implements RemoteControl {
    public static Off INSTANCE = new Off();

    public Off() {
    }

    @Override
    public void switchState(TV tv) {
        System.out.println("TV is now off");
        tv.setState(On.INSTANCE);
        System.out.println("TV turned ON");
    }
}
