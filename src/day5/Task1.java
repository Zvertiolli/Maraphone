package day5;

public class Task1 {
    public static void main(String[] args) {
        Car carOne = new Car(2014, "Black", "Honda");
        Car carTwo = new Car();
        Motorbike motorbike = new Motorbike(2021,"Yellow","Yamaha");


        carTwo.setYear(2015);
        carTwo.setModel("Nissan");
        carTwo.setColor("Red");

        System.out.printf("| %10s | %5s | %10s |\n", "Model", "Year", "Color");
        System.out.println("--------------------------------------------");
        System.out.printf("| %10s | %5s | %10s |\n", carTwo.getModel(), carTwo.getYear(), carTwo.getColor());
        System.out.printf("| %10s | %5s | %10s |\n", carOne.getModel(), carOne.getYear(), carOne.getColor());
        System.out.printf("| %10s | %5s | %10s |\n", motorbike.getModel(), motorbike.getYear(), motorbike.getColor());


    }


}
