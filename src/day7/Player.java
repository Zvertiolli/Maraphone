package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    Random random = new Random();

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (this.stamina<=0){
            return;
        }
        this.stamina--;

        if (stamina==0){
            countPlayers--;
        }
    }

    public Player() {
        this.stamina = 90 + random.nextInt(11);
        if (countPlayers < 6) {
            countPlayers++;
        }
        System.out.println("st - " + this.stamina + " count = " + countPlayers);
    }

    public static void info() {
        int places = 6 - countPlayers;
        switch (places) {
            case (0) -> System.out.println("На поле нет свободных мест");
            case (1) -> System.out.printf("Команды неполные. На поле еще есть %d свободное место\n", places);
            case (2), (3), (4) -> System.out.printf("Команды неполные. На поле еще есть %d свободных места\n", places);
            case (5) -> System.out.printf("Команды неполные. На поле еще есть %d свободных мест\n", places);
        }

    }
}
