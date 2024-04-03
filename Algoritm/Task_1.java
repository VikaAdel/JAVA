package Algoritm;

import java.util.ArrayList;

public class Task_1 {
    public static ArrayList<Integer> findSimpleNumbers(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean simple = true;
        for (int i = 2; i <= n; i++) {
            simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                result.add(i);
            }
        }
        return result;
    }

    public static int sum(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++)
            result += i;
        return result;
    }

    public static void main(String[] args) {
        // System.out.println(sum(10));
        ArrayList<Integer> result = findSimpleNumbers(100);
        for (Integer i : result)
            System.out.println(i);

    }
}