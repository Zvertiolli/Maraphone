package day9;

public class Triangle extends Figure{

    private double ab;
    private double bc;
    private double ca;

    @Override
    public double area() {
        double p = perimeter()/2;
        return Math.sqrt(p*(p-ab)*(p-bc)*(p-ca));
    }

    @Override
    public double perimeter() {
        return ab+bc+ca;
    }

    public Triangle(double ab, double bc, double ca, String color) {
        super(color);
        this.ab = ab;
        this.bc = bc;
        this.ca = ca;
    }
}
