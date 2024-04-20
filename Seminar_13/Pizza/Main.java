package Seminar_13.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza newPizza = PizzaFactory.createPizza("MargheritaPizza");

        System.out.println(newPizza);
    }

}
