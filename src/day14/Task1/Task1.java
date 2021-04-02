package day14.Task1;

/**
 * @autor Alex Zvereff
 * <p>
 * 1. Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30).
 * Заполнить его вручную десятью произвольными числами. Реализовать статический
 * метод printSumDigits(File file) , который считает сумму всех чисел в этом
 * *файле и выводит ее на экран. Вызвать данный метод в методе main().
 * Если файла не существует в папке проекта, в программе необходимо выбрасывать
 * исключение и выводить в консоль сообщение “Файл не найден”. Помимо этого, если
 * чисел в файле меньше или больше 10, необходимо выбрасывать исключение и
 * выводить в консоль сообщение “Некорректный входной файл”.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/day14/Task1/test");

        System.out.println(printSumDigits(file));
    }


    public static int printSumDigits(File file) {
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();

            String[] integers = line.split(" ");

            if (integers.length != 10) {
                throw new Exception("Некорректный входной файл");
            } else {
                for (String s : integers
                ) {
                    sum += Integer.parseInt(s);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sum;
    }
}
