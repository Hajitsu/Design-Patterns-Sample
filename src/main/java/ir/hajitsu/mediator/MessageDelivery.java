package ir.hajitsu.mediator;

import java.util.HashMap;
import java.util.Map;

public class MessageDelivery {
    private Map<String, SenderReceiver> senderReceiverMap = new HashMap<>();

    public void registerClient(SenderReceiver senderReceiver) {
        senderReceiverMap.put(senderReceiver.getName(), senderReceiver);
    }

    public void broadcast(SenderReceiver sender, String clientName, String message) {
        if (senderReceiverMap.containsKey(clientName)) {
            SenderReceiver receiver = senderReceiverMap.get(clientName);
            receiver.receiveMessage(sender, message);
        }
    }
}
