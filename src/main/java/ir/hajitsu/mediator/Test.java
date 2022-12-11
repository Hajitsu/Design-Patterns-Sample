package ir.hajitsu.mediator;

public class Test {
    public static void main(String[] args) {
        MessageDelivery messageDelivery = new MessageDelivery();
        Client hajitsu = new Client(messageDelivery, "@hajitsu");
        Client client2 = new Client(messageDelivery, "@client2");
        // P2P message
        // hajitsu.sendMessage(client2.getName(), "welcome to hajitsu land");

        Group group = new Group(messageDelivery, "@group");
        group.getClientList().add(hajitsu);
        group.getClientList().add(client2);
        group.sendMessage(null, "hello to group");
    }
}
