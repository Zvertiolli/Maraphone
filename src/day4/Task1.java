package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] array = new int[n];
        int one = 0, eight = 0, odd = 0, even = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Length = " + array.length);
        for (int i = 0; i < n; i++) {
            if (array[i] == 1) {
                one++;
            }
            if (array[i] > 8) {
                eight++;
            }
            if (array[i] % 2 == 0) {
                even++;
            }
            if (array[i] % 2 != 0) {
                odd++;
            }
            sum += array[i];
        }
        System.out.println("Numbers > then 1 - " + one);
        System.out.println("Numbers > then 8 - " + eight);
        System.out.println("Even numbers  = " + even);
        System.out.println("Odd numbers = " + odd);
        System.out.println("Summa = " + sum);

    }


}
