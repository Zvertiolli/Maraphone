package day4;

public class Task3 {
    public static void main(String[] args) {
        int m = 12, n = 8, sum = 0, max = 0, index = 0;
        int[][] ints = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ints[i][j] = (int) (Math.random() * 50);
            }
        }

        for (int i = 0; i < m; i++) {
            //System.out.printf("%2d   ",i);
            for (int j = 0; j < n; j++) {
                //System.out.printf("%2d ", ints[i][j]);
                sum += ints[i][j];
            }
            //System.out.println(" - " + sum);
            //System.out.println();
            if (sum > max) {
                max = sum;
                index = i;
            }
            sum = 0;
        }
        System.out.println("Max = " + max);
        System.out.println("Index =" + index);
    }
}
