package ir.hajitsu.mediator;

import java.util.ArrayList;
import java.util.List;

public class Group extends SenderReceiver {
    private List<Client> clientList = new ArrayList<>();

    public List<Client> getClientList() {
        return clientList;
    }

    public Group(MessageDelivery messageDelivery, String name) {
        super(messageDelivery, name);
    }

    @Override
    public void sendMessage(String username, String message) {
        clientList.forEach(client -> messageDelivery.broadcast(this, client.getName(), message));
    }
}
