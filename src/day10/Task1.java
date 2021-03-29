package day10;

//******************
//
//         TreeApp
//
//******************

public class Task1 { //  TreeApp
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(22,"Hello");
        tree.insert(7,"World");
        tree.insert(35,"Bob");
        tree.insert(3,"Rob");
        tree.insert(10,"Helen");

        System.out.println(tree);
    }

}
