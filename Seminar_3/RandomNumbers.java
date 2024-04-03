// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() класса Collections и вывести его на экран.

package Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomNumbers {
    public static void main(String[] args) {
        int num = 10; // размер списка

        List<Integer> arr = new ArrayList<>(); // создаем переменную
        for (int i = 0; i < num; i++) {
            int random = (int) (Math.random() * 100);
            arr.add(random);
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }

    private static void deleteDuplicates(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            for (int j = array.size() - 1; j > i; j--) {
                if (array.get(i).equals(array.get(j))) {
                    array.remove(j);
                }
            }
        }
    }
}