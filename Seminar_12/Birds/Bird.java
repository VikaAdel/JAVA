package Seminar_12.Birds;

class Bird {
    public void fly() {
        // Реализация полета птицы
    }
}

class Ostrich extends Bird {

}

interface Worker {
    void work();

}

interface Eater {
    void eat();

}

class Engineer implements Worker, Eater {
    public void work() {
        // Реализация работы инженера
    }

    public void eat() {
        // Реализация приема пищи
    }
}