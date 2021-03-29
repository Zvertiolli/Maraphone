package day11.Kotlin;

import day11.Warehouse;
import day11.Worker;

public class Courier implements Worker {
    private int salary;
    private final Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork( ) {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1_000);
        if (warehouse.getBalance() == 1_000_000) {
            bonus();
        }
    }

    @Override
    public void bonus() {
       salary = this.getSalary() * 2;
        //System.out.println("bonus courier");
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}
