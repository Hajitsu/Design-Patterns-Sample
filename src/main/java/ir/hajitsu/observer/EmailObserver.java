package ir.hajitsu.observer;

import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

public class EmailObserver implements Observer {
    public String[] emails;

    public EmailObserver(String... emails) {
        this.emails = emails;
    }

    @Override
    public void update(Observable o, Object arg) {
        Arrays.stream(emails).forEach(email -> {
            System.out.printf("SENDING EMAIL TO: %s. Message: %s", email, arg);
            System.out.println();
        });
    }
}
