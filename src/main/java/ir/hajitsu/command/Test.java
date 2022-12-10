package ir.hajitsu.command;

import ir.hajitsu.command.commands.Command;
import ir.hajitsu.command.commands.ShutdownCommand;
import ir.hajitsu.command.receiver.AsiaServerAgent;
import ir.hajitsu.command.receiver.ServerAgent;

public class Test {
    public static void main(String[] args) {
        /* first way
            ServerAgent agent = new AsiaServerAgent();
            ShutdownCommand shutdownCommand = new ShutdownCommand(agent);
            ServerCommandInvoker invoker = new ServerCommandInvoker(shutdownCommand);
            invoker.run();
         */

        /* first way
         */
        ServerAgent agent = new AsiaServerAgent();
        ShutdownCommand shutdownCommand = new ShutdownCommand(agent);
        ServerCommandInvoker invoker = new ServerCommandInvoker(new Command(agent) {
            @Override
            public void execute() {
                serverAgent.connect();
                serverAgent.disconnect();
            }
        });
        invoker.run();
    }
}
