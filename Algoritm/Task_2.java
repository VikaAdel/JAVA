package Algoritm;

import java.util.ArrayList;

public class Task_2 {
    public static int comb_1(int n) {
        // k =4
        // 0(n^4)
        int count = 0;
        for (int a = 1; a <= n; a++)
            for (int b = 1; b <= n; b++)
                for (int c = 1; c <= n; c++)
                    for (int d = 1; d <= n; d++)
                        count++;
        return count;
    }

    public static int comb_2(int k, int n) {
        if (k > 0)
            return comb_2_rec(1, k, n);
        return 0;
    }

    private static int comb_2_rec(int h, int k, int n) {
        if (h == k + 1)
            return 1;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            count += comb_2_rec(h + 1, k, n);
        }
        return count;
    }

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
        // ArrayList<Integer> result = findSimpleNumbers(100);
        // for (Integer i : result)
        // System.out.println(i);

        System.out.println(comb_1(6));
        System.out.println(comb_2(4, 6));

    }
}