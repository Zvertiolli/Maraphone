package day9;

public class Circle extends Figure{

private double radius;

    @Override
    public double area() {
        return Math.PI*radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
}
