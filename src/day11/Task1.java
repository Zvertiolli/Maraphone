package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse("Adidas");
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        System.out.println();

        Warehouse warehouse2 = new Warehouse("Nike");
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);



        info(warehouse1, picker1, courier1);
        System.out.println();
        info(warehouse2, picker2, courier2);
        System.out.println();

        System.out.println("Working.........\n");

        for (int i = 0; i < 1501; i++) {
            workAll(picker1, courier1);
        }

        picker2.doWork();

        info(warehouse1, picker1, courier1);
        System.out.println();
        info(warehouse2, picker2, courier2);
        System.out.println();


    }

    private static void workAll(Picker picker1, Courier courier1) {
        picker1.doWork();
        courier1.doWork();
    }

    private static void info(Warehouse warehouse, Picker picker, Courier courier) {
        System.out.print(warehouse + " ");
        System.out.print(picker + " ");
        System.out.println(courier);
    }


}
