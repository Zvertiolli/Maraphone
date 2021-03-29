package day2;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.print("Таких домов не бывает!");
        }
        if (n >= 1 & n <= 4) {
            System.out.print("Малоэтажный дом");
        }
        if (n >= 5 & n <= 8) {
            System.out.print("Среднеэтажный дом");
        }
        if (n >= 9) {
            System.out.print("Многоэтажный дом");
        }

    }
}
