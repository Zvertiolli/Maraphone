package day8;

public class Task1 {
    public static void main(String[] args) {

        double startTime = System.currentTimeMillis();
        String string1 = "";

        for (int i = 0; i < 20000; i++) {
            string1 = string1 + " " + i;
        }
        double endTime = System.currentTimeMillis();

        System.out.println(string1);
        System.out.println(endTime - startTime);


        startTime = System.currentTimeMillis();

        StringBuilder string2 = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
            string2.append(" ").append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println(string2);
        System.out.println(endTime - startTime);

    }

}
