package day15.Task1;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        File outputFile = new File("src/day15/Task1/res");
        File inputFile = new File("src/day15/Task1/shoes.csv");

        countingZeroPositions(outputFile, inputFile);
    }

    private static void countingZeroPositions(File outputFile, File inputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                   // System.out.println(line);
                    String[] strings = line.split(";");
                    int quantity = Integer.parseInt(strings[2]);
                    if (quantity == 0) {
                        writer.write(line.replace(";", ",") + "\n");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
