// Задача: Напишите обобщенный класс VetClinic, который представляет собой ветеринарную клинику для различных видов животных. Класс должен иметь методы для записи на прием, обработки пациентов и выдачи отчетов. Продемонстрируйте использование этого класса для работы с пациентами - собаками, кошками и другими животными.
package VetClinic;

import java.util.List;

public class VetClinic<U extends Animal> {
    private List<U> animal;

    public VetClinic(List<U> animalList) {
        animal = animalList;
    }

    public void healAnimal(int index) {
        System.out.println("животное " + index + " было вылечено");
    }

    public void checkAnimal(int index) {
        System.out.println("животное " + animal.get(index).getName() + " было осмотрено");
    }

    public U getAnimal(int index) {
        return animal.get(index);
    }
}