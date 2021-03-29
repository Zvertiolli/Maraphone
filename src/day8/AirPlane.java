package day8;

public class AirPlane {
    private int year, length, weight, fuel;
    private String producer;

    public int getFuel() {
        return fuel;
    }


    public AirPlane(int year, int length, int weight, String producer) {
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.producer = producer;
        this.fuel = 0;
    }

    public AirPlane(String producer, int year, int length, int weight) {
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.producer = producer;
        this.fuel = 0;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, количество топлива в баке: %d.\n",
                this.producer,
                this.year,
                this.length,
                this.weight,
                this.getFuel());
    }

    public void fuelUp(int n) {
        this.fuel = n;
    }

    @Override
    public String toString() {
        return "Изготовитель: " + producer + "," +
                " год выпуска: " + year + "," +
                " длина: " + length + "," +
                " вес: " + weight + "," +
                " количество топлива в баке: " + fuel + ".";
    }
}
