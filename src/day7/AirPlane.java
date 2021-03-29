package day7;

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

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, " +
                        "вес: %d, количество топлива в баке: %d.\n",
                this.producer,
                this.year,
                this.length,
                this.weight,
                this.getFuel());
    }

    public void fuelUp(int n) {
        this.fuel = n;
    }

    public static void compareAirplanes(AirPlane a, AirPlane b) {
        if (a.length > b.length) {
            System.out.println(a.producer + " длиннее, чем " + b.producer);
        } else if (b.length > a.length) {
            System.out.println(b.producer + " длиннее, чем " + a.producer);
        } else {
            System.out.println(b.producer + " и " + a.producer + " равны по длине");
        }
    }
}

