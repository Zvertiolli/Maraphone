package day16.Task2;

import java.io.*;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        File fileOne = new File("src/day16/Task2/test1.txt");
        File fileTwo = new File("src/day16/Task2/test2.txt");

        oneThousandRandomNumbers(fileOne);
        arithmeticMean(fileOne, fileTwo);
        printResult(fileTwo);
    }

    public static void oneThousandRandomNumbers(File file) {

        Random random = new Random();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < 1000; i++) {

                writer.write(Integer.toString(random.nextInt(1000)));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void arithmeticMean(File inputFile, File outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                String line;
                double sum = 0;
                int count = 0;
                while ((line = reader.readLine()) != null) {

                    if (count < 20) {
                        sum += Integer.parseInt(line);
                    } else {
                        writer.write(Double.toString(sum / 20));
                        writer.newLine();
                        count = 0;
                        sum = 0;
                    }
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printResult(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            double sum = 0;
            while ((line = reader.readLine()) != null) {
                sum += Double.parseDouble(line);
            }
            System.out.println((int) sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
