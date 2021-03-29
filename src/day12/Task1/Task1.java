package day12.Task1;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("BMW");
        arrayList.add("Audi");
        arrayList.add("Bugatti");
        arrayList.add("Ford");
        arrayList.add("KIA");

        System.out.println(arrayList);
        arrayList.add(3,"Honda");
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
    }


}
