package IntermediateCertification;

import java.util.*;

public class LaptopMain_1 {
    public static void main(String[] args) {
        // множество ноутбуков
        List<Laptop_1> laptops = new ArrayList<>();
        laptops.add(new Laptop_1("Model1", 8, 500, "Windows", "Black"));
        laptops.add(new Laptop_1("Model2", 16, 1000, "Linux", "Silver"));
        laptops.add(new Laptop_1("Model3", 32, 2000, "MacOS", "Gold"));

        // Запрашиваем у пользователя критерии фильтрации
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Введите цифру, соответствующую необходимому критерию:\n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет");
        int criterion = scanner.nextInt();

        // Запрашиваем минимальные значения для указанных критериев
        System.out.println("Введите минимальное значение для выбранного критерия:");
        String minValue = scanner.next();

        // Фильтруем ноутбуки и выводим проходящие по условиям
        for (Laptop_1 laptop : laptops) {
            switch (criterion) {
                case 1:
                    if (laptop.getRam() >= Integer.parseInt(minValue)) {
                        System.out.println(laptop);
                    }
                    break;
                case 2:
                    if (laptop.getHdd() >= Integer.parseInt(minValue)) {
                        System.out.println(laptop);
                    }
                    break;
                case 3:
                    if (laptop.getOs().equalsIgnoreCase(minValue)) {
                        System.out.println(laptop);
                    }
                    break;
                case 4:
                    if (laptop.getColor().equalsIgnoreCase(minValue)) {
                        System.out.println(laptop);
                    }
                    break;
            }
        }
    }
}
