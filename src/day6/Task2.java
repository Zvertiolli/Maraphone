package day6;

public class Task2 {
    public static void main(String[] args) {
        AirPlane airPlane = new AirPlane(2003,45,567,"Boeing");
        airPlane.info();
        airPlane.fuelUp(780);
        airPlane.info();

    }
}
