package ir.hajitsu.command.receiver;

public class AsiaServerAgent implements ServerAgent {
    @Override
    public void connect() {
        System.out.println("Asia server connect");
    }

    @Override
    public void disconnect() {
        System.out.println("Asia server disconnect");
    }

    @Override
    public void shutdown() {
        System.out.println("Asia server shutdown");
    }

    @Override
    public void reboot() {
        System.out.println("Asia server reboot ");
    }
}
