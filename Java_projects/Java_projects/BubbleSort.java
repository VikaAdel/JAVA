package Java_projects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] arr) {
        try {
            log = new File("log.txt");
            fileWriter = new FileWriter(log);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");

            for (int i = 0; i <= arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                fileWriter.write(formatter.format(new Date()) + " " + Arrays.toString(arr) + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// public class Printer {
//     public static void main(String[] args) {
//         int[] arr = {};

//         if (args.length == 0) {
//             arr = new int[] { 9, 3, 4, 8, 2, 5, 7, 1, 6, 10 };
//         } else {
//             arr = Arrays.stream(args[0].split(", "))
//                     .mapToInt(Integer::parseInt)
//                     .toArray();
//         }

//         BubbleSort.sort(arr);

//         try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
//             String line;
//             while ((line = br.readLine()) != null) {
//                 System.out.println(line);
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     @Override
//     public String toString() {
//         return "Printer []";
//     }
// }
