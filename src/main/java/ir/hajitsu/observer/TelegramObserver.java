package ir.hajitsu.observer;

import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

public class TelegramObserver implements Observer {
    public String[] usernames;

    public TelegramObserver(String... usernames) {
        this.usernames = usernames;
    }

    @Override
    public void update(Observable o, Object arg) {
        Arrays.stream(usernames).forEach(username -> {
            System.out.printf("SENDING PM TO: %s. Message: %s", username, arg);
            System.out.println();
        });
    }
}
