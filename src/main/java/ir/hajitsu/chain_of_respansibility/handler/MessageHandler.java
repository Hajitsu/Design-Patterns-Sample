package ir.hajitsu.chain_of_respansibility.handler;

import ir.hajitsu.chain_of_respansibility.Message;

public abstract class MessageHandler {
    protected final MessageHandler nextHandler;

    public MessageHandler(MessageHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(Message message);
}
