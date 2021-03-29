package day12.Task2;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < 31; i++) {
            if (i % 2 == 0) {
                integerArrayList.add(i);
            }
        }
        for (int i = 300; i < 501; i++) {
            if (i % 2 == 0) {
                integerArrayList.add(i);
            }
        }
        for (Integer i : integerArrayList
        ) {
            System.out.println(i);
        }
    }
}
