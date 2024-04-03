// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.
package Java_projects;
public class Seminar1_2 {
    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 1, 1, 1 };
        

        int counter = 0;
        int max = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == 1) {
                counter++;
            }

            else {
                counter = 0;
            }
            max = counter> max ? counter: max;
        }
        System.out.println(max);
    }
}