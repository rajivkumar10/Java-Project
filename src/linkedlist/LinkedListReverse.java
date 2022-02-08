package linkedlist;

public class LinkedListReverse {
    public static void main(String[] args) {
        SinglyLinkedList.Node head = new SinglyLinkedList.Node(5);
        SinglyLinkedList list = new SinglyLinkedList(head);
        list.add(new SinglyLinkedList.Node(6));
        list.add(new SinglyLinkedList.Node(7));
        list.add(new SinglyLinkedList.Node(1));
        list.add(new SinglyLinkedList.Node(2));
        list.print(head);

//        list.reverse();
        SinglyLinkedList.Node newHead = list.reverseList();
        list.print(newHead);

    }
}

class SinglyLinkedList {
    static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public Node next() {
            return next;
        }
    }

    Node head;

    public SinglyLinkedList(Node head) {
        this.head = head;
    }

    public void add(Node node) {
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                current.next = node;
                break;
            }
            current = current.next;
        }
    }

    public void print(Node head) {
        Node node = head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.next();
        }
        System.out.println("");
    }

    public void reverse() {
        Node pointer = head;
        Node previous = null, current = null;

        while (pointer != null) {
            current = pointer;
            pointer = pointer.next;

            current.next = previous;
            previous = current;
            head = current;
        }
    }

    public Node reverseList() {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}
