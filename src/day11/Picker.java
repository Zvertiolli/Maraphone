package day11;

public class Picker implements Worker {
    private int salary;
    private final Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        this.salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
        if (warehouse.getCountOrder() == 1_500) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        salary = salary * 3;
        //System.out.println("bonus picker");
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}
