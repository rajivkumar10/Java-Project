package binarytree;

/**
 * Prints leaves of the binary tree
 *        A
 *      /   \
 *     B     F
 *    / \   / \
 *   C  E  G   H
 *  /           \
 * D             I
 *
 */

public class TreeLeafs {

    public static void main(String[] args) {
        TreeNode d = new TreeNode("d");
        TreeNode e = new TreeNode("e");
        TreeNode g = new TreeNode("g");
        TreeNode i = new TreeNode("i");
        TreeNode c = new TreeNode("c", d, null);
        TreeNode h = new TreeNode("h", null, i);
        TreeNode b = new TreeNode("b", c, e);
        TreeNode f = new TreeNode("f", g, h);
        TreeNode a = new TreeNode("a", b, f);
        printLeaves(a);
    }

    private static class TreeNode {
        String data;
        TreeNode left;
        TreeNode right;

        public TreeNode(String data) {
            this.data = data;
        }

        public TreeNode(String data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public boolean isLeaf(TreeNode node) {
            return node.left == null ? node.right == null : false;
        }
    }
    public static void printLeaves(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.isLeaf(node)) {
            System.out.printf("%s ", node.data);
        }
        printLeaves(node.left);
        printLeaves(node.right);
    }

}
