package ir.hajitsu.command;

import ir.hajitsu.command.commands.Command;

public class ServerCommandInvoker {
    private final Command command;

    public ServerCommandInvoker(Command command) {
        this.command = command;
    }

    public void run() {
        command.execute();
    }
}
