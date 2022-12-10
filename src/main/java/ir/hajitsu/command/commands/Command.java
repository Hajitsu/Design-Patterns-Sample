package ir.hajitsu.command.commands;

import ir.hajitsu.command.receiver.ServerAgent;

public abstract class  Command {
    public final ServerAgent serverAgent;

    public Command(ServerAgent serverAgent) {
        this.serverAgent = serverAgent;
    }

    public abstract void execute();
}
