package Seminar_3;
// Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// 📌 Вывести название каждой планеты и количество его
// повторений в списке.
// Задание состоит из двух блоков
// Задание №2.2 (если выполнено первое задание)
// 📌 Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

import java.util.ArrayList;
import java.util.Collections;

public class Names_planets {

    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<String>();
        planets.add("Юпитер");
        planets.add("Юпитер");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Марс");
        planets.add("Марс");
        planets.add("Меркурий");
        planets.add("Сатурн");
        planets.add("Венера");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Юпитер");
        planets.add("Земля");

        System.out.println(planets);

        ArrayList<String> sortedPlanets = new ArrayList<>(planets);
        Collections.sort(sortedPlanets);

        System.out.println();
        System.out.println(sortedPlanets);
    }

    private static void ShowCountOfPlanet(ArrayList<String> planets) {
        ArrayList<String> sortedPlanets = new ArrayList<>(planets);
        Collections.sort(sortedPlanets);

        int countOfPlanet = 1;

        for (int i = 1; i < sortedPlanets.size(); i++) {
            if (sortedPlanets.get(i) != sortedPlanets.get(i - 1)) {
                System.out.println(sortedPlanets.get(i - 1) + " > " + countOfPlanet);
                countOfPlanet = 1;
            } else {
                countOfPlanet++;
            }
        }
        System.out.println(sortedPlanets.get(sortedPlanets.size() - 1) + " > " + countOfPlanet);
    }
}