package datastructures.trees;

class CountObj {
    int count = 0;
}
//Find Count of Single Valued Subtrees
//Universal Value Tree Problem
/*
    5
   / \
  4   5
 / \   \
4  4    5
 */

public class UniversalTree {
    CountObj countObj = new CountObj();

    public static void main(String[] args) {

        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(4);
        root.left.right = new Node(4);
        root.right.right = new Node(5);
        UniversalTree tree = new UniversalTree();
        System.out.println("count:"+ tree.countUnivalTree(root));

    }

    public int countUnivalTree(Node root) {
        System.out.println("Is unival tree:"+ isUnivalTree(root, countObj));
        return countObj.count;
    }

    public static boolean isUnivalTree(Node root, CountObj countObj) {
        if (root == null) {
            return true;
        }
        if (!isUnivalTree(root.left, countObj) || !isUnivalTree(root.right, countObj)) {
            return false;
        }
        if (root.left != null && root.left.data != root.data) {
            return false;
        }
        if (root.right != null && root.right.data != root.data) {
            return false;
        }
        countObj.count++;
        return true;
    }

}
