package Book;

import java.util.ArrayList;
import java.util.List;

// Класс Library, который хранит книги в списке
public class Library<T> {
    private List<Book<T>> books;// Список книг

    public Library() {
        this.books = new ArrayList<>();
    }
 // Метод для добавления книги в библиотеку
    public void addBook(Book<T> book) {
        books.add(book);
    }
// Метод для выдачи книги из библиотеки
    public Book<T> lendBook(int index) {
        return books.remove(index);
    }
// Метод для вывода информации о выданных книгах
    public void printIssuedBooks() {
        System.out.println("Issued Books:");
        for (Book<T> book : books) {
            System.out.println(book.getTitle());
        }
    }
}