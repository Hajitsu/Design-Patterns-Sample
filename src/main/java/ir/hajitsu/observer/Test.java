package ir.hajitsu.observer;

public class Test {
    public static void main(String[] args) {
        MessageSubject messageSubject = new MessageSubject();
        messageSubject.addObserver(new EmailObserver("info@hajitsu.dev"));
        messageSubject.addObserver(new SmsObserver("1234567890", "0987654321"));
        messageSubject.addObserver(new TelegramObserver("hajitsu"));

        messageSubject.receiveMessage("Salam. Khubi? ");
    }
}
