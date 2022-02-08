package linkedlist;

/**
 * Program to find middle of linkedlist
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.Node head = list.head();
        list.addNode(new LinkedList.Node("1"));
        list.addNode(new LinkedList.Node("2"));
        list.addNode(new LinkedList.Node("3"));
        list.addNode(new LinkedList.Node("4"));

        LinkedList.Node current = head;
        LinkedList.Node middle = head;
        int length = 0;

        //Algo: To find middle of linked list
        //Use two pointers. One will increment on each iteration and other will increment at every second iteration.
        //So when first pointer will point to end of list, second will be pointing to middle element of list
        while (current.next() != null) {
            length++;
            if (length % 2 == 0) {
                middle = middle.next();
            }
            current = current.next();
        }
        if (length % 2 == 1) {
            middle = middle.next();
        }
        System.out.println("list: " + list.toString());
        System.out.println("length of list: " + length);
        System.out.println(("middle of list: " + middle));
    }
}

class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = new Node("head");
        this.tail = head;
    }

    public Node head() {
        return head;
    }

    public void addNode(Node node) {
        tail.next = node;
        tail = node;
    }

    public static class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }

        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }
}
