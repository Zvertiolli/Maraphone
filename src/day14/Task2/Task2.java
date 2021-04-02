package day14.Task2;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        System.out.println(parseFileToStringList("src/day14/Task2/people"));
    }

    public static List<String> parseFileToStringList(String string) {
        File file = new File(string);
        List<String> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String[] strings = scanner.nextLine().split(" ");

                if (Integer.parseInt(strings[1]) < 0) {  //  negative age
                    throw new IllegalArgumentException("Wrong age!");
                }
                list.add(string);
            }
            return list;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
