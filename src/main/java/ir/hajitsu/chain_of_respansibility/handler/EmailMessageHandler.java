package ir.hajitsu.chain_of_respansibility.handler;

import ir.hajitsu.chain_of_respansibility.Message;

public class EmailMessageHandler extends MessageHandler {
    public EmailMessageHandler(MessageHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Message message) {
        if (message.getDestinationMap().containsKey(Message.Destination.EMAIL)) {
            System.out.printf("message sent to %s via Email", message.getDestinationMap().get(Message.Destination.EMAIL));
            System.out.println();
        }
        if(nextHandler!=null){
            nextHandler.handle(message);
        }
    }
}
