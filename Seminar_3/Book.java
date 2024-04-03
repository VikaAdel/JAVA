package Seminar_3;
// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

import java.util.ArrayList;
import java.util.List;

public class Book {
    public static void main(String[] args) {
        List<ArrayList<String>> bookStore = new ArrayList<>();

        // Пример заполнения книжного магазина
        addGenre(bookStore, "Фантастика", "Книга 1", "Книга 2", "Книга 3");
        addGenre(bookStore, "Детектив", "Книга 4", "Книга 5", "Книга 6");
        addGenre(bookStore, "Роман", "Книга 7", "Книга 8", "Книга 9");

        // Вывод книжного магазина
        printBookStore(bookStore);
    }

    // Метод для добавления жанра и книг в книжный магазин
    public static void addGenre(List<ArrayList<String>> bookStore, String genre, String... books) {
        ArrayList<String> genreAndBooks = new ArrayList<>();
        genreAndBooks.add(genre);
        for (String book : books) {
            genreAndBooks.add(book);
        }
        bookStore.add(genreAndBooks);
    }

    // Метод для вывода книжного магазина
    public static void printBookStore(List<ArrayList<String>> bookStore) {
        for (ArrayList<String> genreAndBooks : bookStore) {
            for (String item : genreAndBooks) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
