package Calculator;

// Класс калькулятора для выполнения операций
public class Calculator {

    private ComplexOperation operation;

    public void setOperation(ComplexOperation operation) {
        this.operation = operation;
    }

    public void executeOperation(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = operation.operate(num1, num2);
        System.out.println("Результат операции: " + result.getReal() + " + " + result.getImaginary() + "i");
    }
}
