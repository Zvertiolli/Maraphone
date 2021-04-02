package day16.Task1;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/day16/Task1/1");
        printResult(file);
    }

    public static void printResult(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            double sum = 0.0;
            Double result;
            List<String> numbers ;
            while ((line = reader.readLine()) != null) {
                numbers = Arrays.asList(line.split(" "));
                for (String num : numbers
                ) {
                    sum = +Double.parseDouble(num);
                }
                result = sum / numbers.size();
                DecimalFormat decimalFormat = new DecimalFormat("#.###");
                System.out.println(result + " --> " + decimalFormat.format(result));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
