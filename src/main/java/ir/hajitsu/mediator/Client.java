package ir.hajitsu.mediator;

public class Client extends SenderReceiver {
    public Client(MessageDelivery messageDelivery, String name) {
        super(messageDelivery, name);
    }

    @Override
    public void sendMessage(String username, String message) {
        messageDelivery.broadcast(this, username, message);
    }
}
