package day9;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.printf("Этот человек с именем %s", getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
