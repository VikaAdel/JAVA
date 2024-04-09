package Book;

import java.util.ArrayList;
import java.util.List;

public class Library<T> {
    private List<Book<T>> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book<T> book) {
        books.add(book);
    }

    public Book<T> lendBook(int index) {
        return books.remove(index);
    }

    public void printIssuedBooks() {
        System.out.println("Issued Books:");
        for (Book<T> book : books) {
            System.out.println(book.getTitle());
        }
    }
}