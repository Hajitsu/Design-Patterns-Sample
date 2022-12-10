package ir.hajitsu.chain_of_respansibility.handler;

import ir.hajitsu.chain_of_respansibility.Message;

public class SmsMessageHandler extends MessageHandler {
    public SmsMessageHandler(MessageHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Message message) {
        if (message.getDestinationMap().containsKey(Message.Destination.SMS)) {
            System.out.printf("message sent to %s via SMS", message.getDestinationMap().get(Message.Destination.SMS));
            System.out.println();
        }
        if(nextHandler!=null){
            nextHandler.handle(message);
        }
    }
}
