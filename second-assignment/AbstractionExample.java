abstract class Shape {
    protected double area;

    public abstract void calculateArea();

    public void displayArea() {
        System.out.println("Area of the shape: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area = length * width;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        circle.calculateArea();
        circle.displayArea();

        Shape rectangle = new Rectangle(10.0, 20.0);
        rectangle.calculateArea();
        rectangle.displayArea();
    }
}
