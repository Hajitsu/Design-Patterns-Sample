package ir.hajitsu.command.receiver;

public interface ServerAgent {
    void connect();
    void disconnect();
    void shutdown();
    void reboot();

}
