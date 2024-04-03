package Java_projects;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Seminar_1 {
    public static void main(String[] args) {

        // String msg = "Hello, World!";
        // System.out.println(msg);
        // System.out.println(LocalDateTime.now());

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

        System.out.println("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in, "ibm866");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s", name);
        scanner.close();

    }

}
