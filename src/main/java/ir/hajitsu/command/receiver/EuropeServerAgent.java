package ir.hajitsu.command.receiver;

public class EuropeServerAgent implements ServerAgent {
    @Override
    public void connect() {
        System.out.println("Europe server connect");
    }

    @Override
    public void disconnect() {
        System.out.println("Europe server disconnect");
    }

    @Override
    public void shutdown() {
        System.out.println("Europe server shutdown");
    }

    @Override
    public void reboot() {
        System.out.println("Europe server reboot");
    }
}
