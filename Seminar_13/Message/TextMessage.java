
// Создайте интерфейс Message, который определяет методы для отправки и получения текстового сообщения.
// Реализуйте класс TextMessage, представляющий базовое текстовое сообщение.
// Создайте декоратор MessageDecorator, который будет добавлять дополнительную информацию к текстовому сообщению (например, дату отправки).
// Напишите клиентский код, который будет использовать декоратор для отправки и получения текстовых сообщений с дополнительной информацией.
package Seminar_13.Message;

public class TextMessage implements Message {
    private String text;

    public String getText() {
        return text;
    }

    // public void setText(String text) {
    // this.text = text;
    // }

    public TextMessage(String text) {
        this.text = text;

    }

    @Override
    public void sendMessage(String text) {
        this.text = text;
    }

    @Override
    public void getMessage() {
        System.out.println(text);
    }

}
