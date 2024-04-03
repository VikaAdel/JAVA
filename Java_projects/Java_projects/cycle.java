package Java_projects;

public class cycle {
    public static void main(String[] args) {
        // int value = 321;
        // int count = 0;
        // while (value != 0) {
        // value /= 10;
        // count++;
        // }
        // System.out.println(count);

        // int value = 321;
        // int count = 0;
        // do {
        // value /= 10;
        // count++;
        // } while (value != 0);
        // System.out.println(count);

        int s = 0;
        for (int i = 1; i <= 5; i++) {
            s += i;
        }
        System.out.println(s);
    }

}
