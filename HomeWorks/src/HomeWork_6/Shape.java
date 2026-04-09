package HomeWork_6;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void displayInfo() {
        System.out.printf("Shape: %s%nArea: %.2f%nPerimeter: %.2f%n", name, calculateArea(), calculatePerimeter());
    }
}