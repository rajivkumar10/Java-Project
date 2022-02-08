package practice;


class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            }
           return left.contains(value);
        } else {
            if (right == null) {
                return false;
            }
            return right.contains(value);
        }
    }


    public void printInOder() {
        //left-root--right
        if (left != null) {
            left.printInOder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOder();
        }
    }
}

public class BSTree {
    public static void main(String[] args) {
        Node root = new Node(50);
        root.insert(20);
        root.insert(30);
        root.insert(70);
        root.insert(80);
        root.printInOder();
        System.out.println(root.contains(75));
    }
}
