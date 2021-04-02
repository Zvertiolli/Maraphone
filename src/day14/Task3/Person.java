package day14.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Person> parseFileToObjList(String filePath) {
        List<Person> personList = new ArrayList<>();
        int personAge;

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String[] string = scanner.nextLine().split(" ");

                if ((personAge = Integer.parseInt(string[1])) < 0) {
                    throw new IllegalArgumentException("Неккорректный возраст");
                } else {
                    personList.add(new Person(string[0], personAge));
                }
            }
            return personList;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
