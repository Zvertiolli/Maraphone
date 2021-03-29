package day10;

public class Tree {

    private Node root;                                  // первый узел древа

    public Tree() {
        root = null;
    }

    public Node find(int key) {                         //  Поиск уза с заданным ключом
        // предполагаем что дерево не пустое
        Node current = root;                            // начинаем с корня
        while (current.getiDate() != key) {             // пока не найдено совпадение
            if (key < current.getiDate()) {             //двигаться налево
                current = current.getLeftChild();
            } else {                                    // двигаться направо
                current = current.getRightChild();
            }
            if (current == null) {                      // если потомка нет
                return null;                            // узел не найден
            }
        }
        return current;                                 //узел найден
    }

    public void insert(int id, String fd) {
        Node newNode = new Node();                      //Создание нового узла
        newNode.setiDate(id);
        newNode.setfDate(fd);

        if (root == null) {                             // Если корень пустой пишем узел в корень
            root = newNode;
        } else {                                        //Если корень не пустой
            Node current = root;                        // Начинаем с корня
            Node parent;
            while (true) {
                parent = current;                       //Запоминаем родителя
                if (newNode.getiDate() < current.getiDate()) {  // Двигаемся влево
                    current = current.getLeftChild();               // смотрим на левого сына
                    if (current == null) {                          // Если сын пустой
                        parent.setLeftChild(newNode);               // Вставляем родителю сына слева
                        return;
                    }
                } else {                                            // Двигаемя вправо
                    current = current.getRightChild();              // смотрим правого сына
                    if (current == null) {                          // Если сын пустой
                        parent.setRightChild(newNode);              // Вставляем рородителю правого сына
                        return;
                    }
                }
            }

        }

    }

    public void delete(int id) {

    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}'+"\n";
    }
}
