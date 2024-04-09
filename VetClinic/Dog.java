package VetClinic;

public class Dog extends Animal {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("гав!");
    }

    public String getName() {
        return name;
    }
}