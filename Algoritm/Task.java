package Algoritm;

public class Task {
    public static int sum(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++)
            result += i;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
