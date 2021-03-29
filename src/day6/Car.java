package day6;

public class Car {
    private int year;
    private String color, model;

    public Car() {
    }

    public Car(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info(){
        System.out.println("This is Car");
    }

    public int yearDifference(int currentYear){
        return currentYear-this.year;
    }
}
