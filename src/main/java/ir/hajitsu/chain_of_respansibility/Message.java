package ir.hajitsu.chain_of_respansibility;

import java.util.EnumMap;
import java.util.Map;

public class Message {
    private String message;
    private Map<Destination, String> destinationMap;

    public enum Destination {
        SMS, EMAIL, FAX
    }

    public Message(String message, Map<Destination, String> destinationMap) {
        this.message = message;
        this.destinationMap = destinationMap;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<Destination, String> getDestinationMap() {
        return destinationMap;
    }

    public void setDestinationMap(Map<Destination, String> destinationMap) {
        this.destinationMap = destinationMap;
    }

    public static MessageBuilder getBuilder() {
        return new MessageBuilder();
    }

    public static class MessageBuilder {
        private String message;
        private Map<Destination, String> destinationMap = new EnumMap<>(Destination.class);

        public MessageBuilder addDestination(Destination destination, String value) {
            destinationMap.put(destination, value);
            return this;
        }

        public MessageBuilder setValue(String message) {
            this.message = message;
            return this;
        }

        public Message createMessage() {
            return new Message(message, destinationMap);
        }
    }
}
