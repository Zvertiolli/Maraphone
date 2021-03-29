package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] ints = new int[100];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 10000);
        }
        int min = 0, max = 0, sum = 0, count = 0;
        for (int n : ints
        ) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
            if (n % 10 == 0) {
                //System.out.println(n);
                sum += n;
                count++;
            }
        }
        //System.out.println(Arrays.toString(ints));
        System.out.println("min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Count = " + count);
        System.out.println("Sum = " + sum);

    }
}
