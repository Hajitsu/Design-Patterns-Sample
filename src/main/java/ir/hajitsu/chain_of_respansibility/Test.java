package ir.hajitsu.chain_of_respansibility;

import ir.hajitsu.chain_of_respansibility.service.MessageService;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        Message message = Message.getBuilder().setValue("Hi, welcome to hajitsu land.")
                .addDestination(Message.Destination.SMS, "0987654321")
                .addDestination(Message.Destination.EMAIL, "my_name@domain.com")
                .createMessage();

        MessageService messageService = new MessageService();
        messageService.sendMessage(message);
    }


    public static void main2(String[] args) throws IOException {
        Logger logger = Logger.getLogger("Log");
        logger.setLevel(Level.FINEST);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINER);
        logger.addHandler(handler);

        FileHandler fileHandler = new FileHandler("log.xml");
        fileHandler.setLevel(Level.ALL);
        logger.addHandler(fileHandler);

        logger.finest("logger finest message");
        logger.finer("logger finer message");
        logger.fine("logger fine message");
    }
}
