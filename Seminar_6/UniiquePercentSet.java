package Seminar_6;
// 1. Напишите метод, который заполнит массив из 1000 элементов случайными
// цифрами от 0 до 500
// 2. Создайте метод, в который передайте заполненный выше массив и с
// помощью Set вычислите процент уникальных значений в данном массиве и
// верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее
// количество чисел в массиве.

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniiquePercentSet {
    public static void main(String[] args) {
        int[] array = generateRandomArray(1000, 500);
        double percent = calculateUniquePercent(array);
        System.out.println(percent);
    }

    public static int[] generateRandomArray(int size, int max) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max);
        }
        return array;
    }

    public static double calculateUniquePercent(int[] array) {
        Set<Integer> uniqueValues = new HashSet<>();
        for (int num : array) {
            uniqueValues.add(num);
        }
        double percetage = (double) uniqueValues.size() * 100 / array.length;
        return percetage;
    }

}