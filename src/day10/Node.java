package day10;

public class Node {
    private int iDate;
    private  String fDate;
    private  Node leftChild;
    private Node rightChild;

    public int getiDate() {
        return iDate;
    }

    public void setiDate(int iDate) {
        this.iDate = iDate;
    }

    public String getfDate() {
        return fDate;
    }

    public void setfDate(String fDate) {
        this.fDate = fDate;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
//    public void add(int n, Node node) {
//        if (n < node.value) {
//            if (node.leftSom == null) {
//                node.leftSom = new Node(n);
//            } else {
//                this.add(n, this);
//            }
//        } else {
//            if (node.leftSom == null) {
//                node.rightSon = new Node(n);
//            } else {
//                this.add(n, this);
//            }
//        }
//    }


    @Override
    public String toString() {
        return "Node{" +
                "iDate=" + iDate +
                ", fDate='" + fDate + '\'' +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
