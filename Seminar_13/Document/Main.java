
// Создайте интерфейс Document, который определяет методы для открытия и закрытия документа.
// Реализуйте класс OldDocument, представляющий старую библиотеку для работы с документами, и имеющий методы openDocument() и closeDocument().
// Создайте адаптер DocumentAdapter, который адаптирует класс OldDocument к интерфейсу Document, реализуя методы open() и close().
// Напишите клиентский код, который будет использовать адаптер для открытия и закрытия документов в новой системе
package Seminar_13.Document;

public class Main {
    public static void main(String[] args) {
        DocumentAdapter documentAdapter = new DocumentAdapter();
        documentAdapter.openDocument();
        documentAdapter.closeDocument();
    }
}
