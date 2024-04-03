// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.
package Java_projects;
import java.util.Arrays;

public class Seminar1_3 {
    public static void main(String[] args) {
        int[] number = { 3, 2, 2, 3, 3, 3, 2, 3, 4, 3, 3 };
        int val = 3;
        int left = 0;
        int right = number.length - 1;

        while (left < right) {
            while (number[right] == val && left < right) {
                right--;
            }

            if (number[left] == val) {
                number[left] = number[right];
                number[right] = val;
                right--;
            }
            left++;
        }
        System.out.println(Arrays.toString(number));
    }
}
