package datastructures.trees;

class Node {
    Node left, right;
    int data;

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
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void printInOrder() {
        //Left -> Root -> Right
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }

    public void printPreOrder() {
        //Root -> Left -> Right
        System.out.println(data);
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }

    public void printPostOrder() {
        //Left -> Right -> Root
        if (left != null) {
            left.printPostOrder();
        }
        if (right != null) {
            right.printPostOrder();
        }
        System.out.println(data);
    }

    public int findHeight(Node node) {
        if (node == null) {
            return -1;
        }
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public boolean checkBalancedTree(Node root) {

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        System.out.println("leftHeight:"+ leftHeight);
        System.out.println("rightHeight"+ rightHeight);
        if (Math.abs(leftHeight - rightHeight) <= 1) {
            return true;
        }
        return false;
    }

    public int findMinimum(Node root) {
        if (root == null) {
            return -1;
        }
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int findMaximun(Node root) {
        if (root == null) {
            return -1;
        }
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }


}

public class BinarySearchTree {
    public static void main(String[] args) {
        Node root = new Node(50);
        int[] arr = {30, 20, 70, 40, 80, 60};
        for (int i : arr) {
            root.insert(i);
        }
        System.out.println("check 5 in tree: " + root.contains(5));
        System.out.println("check 70 in tree: " + root.contains(70));
        System.out.println("In order");
        root.printInOrder();
        System.out.println("Pre order");
        root.printPreOrder();
        System.out.println("Post order");
        root.printPostOrder();
        System.out.println(root.findHeight(root));
        System.out.println(root.findMinimum(root));
        System.out.println(root.findMaximun(root));
        System.out.println(root.checkBalancedTree(root));

        Node treeNode = new Node(1);
        treeNode.left =new Node(2);
        treeNode.right = new Node(3);
        treeNode.left.left = new Node(4);
        treeNode.left.right = new Node(5);
        treeNode.left.left.left = new Node(8);
        System.out.println(root.checkBalancedTree(treeNode));
    }

}
