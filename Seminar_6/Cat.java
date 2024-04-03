// 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
// использовать не все придуманные поля и методы. Создайте несколько
// экземпляров этого класса, выведите их в консоль.
// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
// его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

package Seminar_6;

public class Cat {
    private String name;
    private int age;
    private String gender;
    private String color;

    public Cat(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getAge(int age) {
        this.age = age;
    }

    public void getColor(String color) {
        this.color = color;
    }

    public void getGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {

        return "Имя: " + name + ",Возраст: " + age + ",Пол: " + gender;
    }

}
