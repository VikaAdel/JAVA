package Book;

public class Main {
    public static void main(String[] args) {
        // книги
        Book<String> book1 = new Book<>("Собор парижской богоматери");
        Book<String> book2 = new Book<>("Вишневый сад");

        // библиотека
        Library<String> library = new Library<>();

        // Добавили книги в библиотеку
        library.addBook(book1);
        library.addBook(book2);

        // Выводим информацию о выданных книгах
        library.printIssuedBooks();

        // выдаем книгу
        Book<String> issuedBook = library.lendBook(0);
        System.out.println("Issued book: " + issuedBook.getTitle());

        // информация о выданных книгах
        library.printIssuedBooks();
    }
}