package Calculator;

class ComplexCalculator {
    public ComplexNumber performAction(ComplexNumber number1, ComplexNumber number2, char operation) {
        switch (operation) {
            case '+':
                return number1.add(number2);
            case '-':
                return number1.subtract(number2);
            case '*':
                return number1.multiply(number2);
            case '/':
                return number1.divide(number2);
            default:
                throw new IllegalArgumentException("Неверная операция. Введите '+', '-', '*' или '/'.");
        }
    }
}