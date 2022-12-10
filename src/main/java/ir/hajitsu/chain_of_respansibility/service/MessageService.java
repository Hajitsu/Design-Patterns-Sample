package ir.hajitsu.chain_of_respansibility.service;

import ir.hajitsu.chain_of_respansibility.Message;
import ir.hajitsu.chain_of_respansibility.handler.EmailMessageHandler;
import ir.hajitsu.chain_of_respansibility.handler.FaxMessageHandler;
import ir.hajitsu.chain_of_respansibility.handler.MessageHandler;
import ir.hajitsu.chain_of_respansibility.handler.SmsMessageHandler;

public class MessageService {
    public void sendMessage(Message message) {
        MessageHandler nextHandler = null;
        for (Message.Destination destination : message.getDestinationMap().keySet()) {
            switch (destination) {
                case FAX:
                    nextHandler = new FaxMessageHandler(nextHandler);
                    break;
                case SMS:
                    nextHandler = new SmsMessageHandler(nextHandler);
                    break;
                case EMAIL:
                    nextHandler = new EmailMessageHandler(nextHandler);
                    break;
            }
        }
        if (nextHandler != null) {
            nextHandler.handle(message);
        }
    }
}
