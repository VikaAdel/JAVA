
// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
// содержащий в себе методы initProducts (List <Product>) сохраняющий в
// себе список исходных продуктов и getProduct(String name)
// Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды),
// сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговогоАвтомата
// (пример: ПродающийБутылкиВодыАвтомат
// Реализовать конструкторы, get/set методы, построить логику ТорговогоАвтомата на 
// основе кода сделанного в задании 1.2
package Seminar_7;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Chocolate");
        product1.setCost(500);

        VendingMachine vendingMachine1 = new VendingMachine();
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        vendingMachine1.initProduct(productList);
        System.out.println(vendingMachine1.getProduct("Chocolate"));
    }
}
