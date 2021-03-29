package day9;

public class Teacher extends Human{
    private String culture;

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public Teacher(String name, String culture) {
        super(name);
        this.culture = culture;
    }

    public void printInfo(){
        super.printInfo();
        System.out.printf("\nЭтот преподаватель с именем %s\n", getName());
    }
}
