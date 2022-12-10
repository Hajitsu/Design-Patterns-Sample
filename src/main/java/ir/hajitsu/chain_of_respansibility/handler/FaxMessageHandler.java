package ir.hajitsu.chain_of_respansibility.handler;

import ir.hajitsu.chain_of_respansibility.Message;

public class FaxMessageHandler extends MessageHandler {
    public FaxMessageHandler(MessageHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Message message) {
        if (message.getDestinationMap().containsKey(Message.Destination.FAX)) {
            System.out.printf("message sent to %s via FAX", message.getDestinationMap().get(Message.Destination.FAX));
            System.out.println();
        }
        if(nextHandler!=null){
            nextHandler.handle(message);
        }
    }
}
