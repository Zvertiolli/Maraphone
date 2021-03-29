package day7;

public class Task1 {
    public static void main(String[] args) {
        AirPlane airPlane1 = new AirPlane(2001, 34, 765, "Boeing - 730");
        AirPlane airPlane2 = new AirPlane(2014, 23, 888, "Super Jet");

        AirPlane.compareAirplanes(airPlane1,airPlane2);
    }
}
