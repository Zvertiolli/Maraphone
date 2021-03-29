package day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Egor","Math");
        Student student1 = new Student("Bob","Russian");

        Teacher teacher = new Teacher("Elena","English");

        System.out.printf("Group - %s\n",student.getGroup());

        System.out.printf("Culture - %s\n",teacher.getCulture());


        student.printInfo();

        teacher.printInfo();
    }
}
