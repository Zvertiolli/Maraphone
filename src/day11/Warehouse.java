package day11;

public class Warehouse {
    private int countOrder = 0;
    private int balance = 0;
    private final String name;

    public Warehouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse " + name + " {" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }
}
