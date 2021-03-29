package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("работа программы завершается");
                break;
            }
        }
    }
}
