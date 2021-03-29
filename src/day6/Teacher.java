package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subjectInSchool;
    Random random = new Random();

    public Teacher(String name, String subjectInSchool) {
        this.name = name;
        this.subjectInSchool = subjectInSchool;
    }

    public void evaluate(String studentName) {
        String estimationText;
        int estimation = 2 + random.nextInt(4);
        estimationText = switch (estimation) {
            case 2 -> "неудовлетворительно";
            case 3 -> "удовлетворительно";
            case 4 -> "хорошо";
            case 5 -> "отлично";
            default -> throw new IllegalStateException("Unexpected value: " + estimation);
        };
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s",
                this.name,
                studentName,
                this.subjectInSchool,
                estimationText);
    }

}
