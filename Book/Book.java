package Book;

// Класс книги, параметризованный обобщенным типом T
public class Book<T> {
    private T title;// Название книги

    public Book(T title) {
        this.title = title;
    }

    public T getTitle() {
        return title;
    }

    public void setTitle(T title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title=" + title +
                '}';
    }
}
