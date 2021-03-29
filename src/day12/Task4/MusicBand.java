package day12.Task4;



import java.util.ArrayList;
import java.util.Collections;

public class MusicBand {
    private String name;
    private int year;
    private ArrayList<String> members = new ArrayList<>();


    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<String> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        b.setMembers(a.getMembers());
        a.setMembers(new ArrayList<>(Collections.emptyList()));
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

    public void printMembers() {
        System.out.println("Grope  - " + this.getName());
        for (String string : this.getMembers()
        ) {
            System.out.println("Member - " + string);
        }
        System.out.println();
    }
}
