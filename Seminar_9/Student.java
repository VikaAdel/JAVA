
// Создать класс Студент
// - Создать класс УчебнаяГруппаИтератор
// - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
// Модифицировать класс УчебнаяГруппа, заставив его реализовать интерфейс Iterable
// - Реализовать метод iterator() возвращающий экземпляр созданного нами итератора

package Seminar_9;

/**
 * Student
 */
public class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {
        return id - o.getId();
    }

    @Override
    public String toString() {
        return getName();
    }

}