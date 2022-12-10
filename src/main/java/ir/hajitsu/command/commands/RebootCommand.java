package ir.hajitsu.command.commands;

import ir.hajitsu.command.receiver.ServerAgent;

public class RebootCommand extends Command {
    public RebootCommand(ServerAgent serverAgent) {
        super(serverAgent);
    }

    @Override
    public void execute() {
        serverAgent.connect();
        serverAgent.reboot();
        serverAgent.disconnect();
    }
}
