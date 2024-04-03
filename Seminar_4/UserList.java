package Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class UserList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку вида text~num print~num: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }
            String[] parts = input.split("~");

            String text = parts[0];
            int num = Integer.parseInt(parts[1]);

            if (text.equals("print")) {
                if (num >= 0 && num < linkedList.size()) {
                    System.out.println(linkedList.get(num));
                    linkedList.remove(num);
                } else {
                    System.out.println("Неправильный индекс");
                }
                System.out.println(linkedList);
            } else {
                if (num >= 0 && num <= linkedList.size()) {
                    linkedList.add(num, text);
                } else {
                    System.out.println("Неправильный индекс");
                }
                System.out.println(linkedList);
            }
        }
    }
}
