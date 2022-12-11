package ir.hajitsu.mediator;

import java.util.Date;

public abstract class SenderReceiver {
    private String name;
    protected MessageDelivery messageDelivery;

    public SenderReceiver(MessageDelivery messageDelivery, String name) {
        this.name = name;
        this.messageDelivery = messageDelivery;

        messageDelivery.registerClient(this);
    }

    public String getName() {
        return name;
    }

    public void receiveMessage(SenderReceiver sender, String message) {
        System.out.println("-------------");
        System.out.println(getName());
        System.out.println(String.format("<%s><%s>: %s",
                sender.getName(),
                new Date().toString(),
                message
        ));
    }

    public abstract void sendMessage(String username, String message);
}
