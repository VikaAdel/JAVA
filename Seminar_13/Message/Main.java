package Seminar_13.Message;

public class Main {
    public static void main(String[] args) {
        TextMessage textMessage = new TextMessage("Hello, world!");
        MessageDecorator messageDecorator = new MessageDecorator(textMessage);
        messageDecorator.getMessage();
    }
}