package day4;

public class Task4 {
    private static int sum, max, index;

    public static void main(String[] args) {
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 10000);
        }
        //ints = new int[]{1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254};
        for (int i = 0; i < ints.length - 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum += ints[i + j];
            }
            System.out.printf("%2d - %7d\n", i, sum);
            if (sum > max) {
                max = sum;
                index = i;
            }
            sum = 0;
        }
        System.out.println();
        System.out.println(index + "   " + max);
    }
}
