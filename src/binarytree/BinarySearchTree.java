package binarytree;

/**
 * Binary Search tree
 *              50
 *             /  \
 *           30   70
 *           /\   /\
 *         20 40 60 80
 *
 */
public class BinarySearchTree {
    public static class Node {
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    //Visit left subtree
    //Visit node
    //Visit right subtree
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    void preOrder() {
        preOrderRec(root);
    }

    //Visit node
    //Visit left subtree
    //Visit right subtree
    void preOrderRec(Node root) {
        if (root != null) {
            System.out.println(root.key);
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    void postOrder() {
        postOrderRec(root);
    }
    //Visit left subtree
    //Visit right subtree
    //Visit node
    void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.println(root.key);
        }
    }

    void search(int key) {
        root = searchRec(root, key);
        if (root != null)
            System.out.println("Node found with key:" + key);
        else
            System.out.println("Node not found with key:" + key);
    }

    public Node searchRec(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }
        if (key < root.key) {
            root = searchRec(root.left, key);
        } else if (key > root.key) {
            root = searchRec(root.right, key);
        }
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(70);
        tree.insert(40);
        tree.insert(80);
        tree.insert(60);
        System.out.println("Inorder traversal");
        tree.inorder();
        System.out.println("Preorder traversal");
        tree.preOrder();
        System.out.println("Postorder traversal");
        tree.postOrder();

        tree.search(70);
        tree.search(100);
    }
}
