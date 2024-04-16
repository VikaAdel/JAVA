package Seminar_12.task_1;

public class Circre extends Shape {

    private double radius;
    private double PI = Math.PI;

    public Circre(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * Math.sqrt(radius);
    }
}