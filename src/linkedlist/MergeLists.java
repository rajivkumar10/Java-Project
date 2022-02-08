package linkedlist;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
//Merge k Sorted Lists
public class MergeLists {
    public static void main(String[] args) {
        int k = 3;
        int n = 4;
        Node[] arr = new Node[3];
        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);

        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);

        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);
        Node result = mergeLists(arr, k - 1);
        print(result);

    }

    public static void print(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.print("null");
    }

    public static Node mergeLists(Node[] arr, int last) {
        while(last != 0) {
            int i = 0;
            int j = last;
            while (i < j) {
                arr[i] = sortedMerge(arr[i], arr[j]);
                i++;
                j--;
                if (i >= j) {
                    last = j;
                }
            }
        }
        return arr[0];
    }

    public static Node sortedMerge(Node a, Node b) {
        Node result;
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (a.data < b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }
}
