package ir.hajitsu.command.commands;

import ir.hajitsu.command.receiver.ServerAgent;

public class ShutdownCommand extends Command {
    public ShutdownCommand(ServerAgent serverAgent) {
        super(serverAgent);
    }

    @Override
    public void execute() {
        serverAgent.connect();
        serverAgent.shutdown();
        serverAgent.disconnect();
    }
}
