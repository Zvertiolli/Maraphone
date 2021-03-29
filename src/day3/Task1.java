package day3;

import java.util.Scanner;

public class Task1 {
    private static String string;
    private static boolean stopGame = false;
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        startGame();
    }

    private static void startGame() {
        do {
            readCity();
            startGame(string);
        } while (!stopGame);
    }

    public static void startGame(String string) {
        if (string.equals("stop")) {
            System.out.println("программа завершила работу");
            stopGame = true;
        } else {
            selectCity(string);
        }
    }

    public static void readCity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city");
        string = scanner.nextLine();
    }

    public static void selectCity(String string) {
        switch (string) {
            case "Москва", "Владивосток", "Ростов" -> printCountry("Россия");
            case "Рим", "Милан", "Турин" -> printCountry("Италия");
            case "Ливерпуль", "Манчестер", "Лондон" -> printCountry("Англия");
            case "Берлин", "Мюнхен", "Кёльн" -> printCountry("Германия");
            default -> printCountry("Неизвестная страна");
        }
    }

    public static void printCountry(String s) {
        System.out.printf("%s - %s\n", string, s);
    }
}
