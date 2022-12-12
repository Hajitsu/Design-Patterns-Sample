package ir.hajitsu.observer;

import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

public class SmsObserver implements Observer {
    public String[] mobiles;

    public SmsObserver(String... mobiles) {
        this.mobiles = mobiles;
    }

    @Override
    public void update(Observable o, Object arg) {
        Arrays.stream(mobiles).forEach(mobile -> {
            System.out.printf("SENDING SMS TO: %s. Message: %s", mobile, arg);
            System.out.println();
        });
    }
}
