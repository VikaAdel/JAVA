package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число (действительная часть): ");
        double real1 = input.nextDouble();
        System.out.println("Введите первое число (мнимая часть): ");
        double imaginary1 = input.nextDouble();

        System.out.println("Введите второе число (действительная часть): ");
        double real2 = input.nextDouble();
        System.out.println("Введите второе число (мнимая часть): ");
        double imaginary2 = input.nextDouble();

        ComplexNumber num1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber num2 = new ComplexNumber(real2, imaginary2);

        Calculator calculator = new Calculator();

        System.out.println("Выберите операцию:");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                calculator.setOperation((a, b) -> a.add(b));
                break;
            case 2:
                calculator.setOperation((a, b) -> a.subtract(b));
                break;
            case 3:
                calculator.setOperation((a, b) -> a.multiply(b));
                break;
            case 4:
                calculator.setOperation((a, b) -> a.divide(b));
                break;
            default:
                System.out.println("Неверный выбор операции.");
                return;
        }
        calculator.executeOperation(num1, num2);
    }
}
