package linkedlist;

//Delete Nth node from the end of the given linked list
public class LinkedList2 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void deleteNthNode(int n) {
        Node first = head;
        Node second = head;
        for (int i = 0; i < n; i++) {
            if (second.next == null) {
                if (i == n - 1) {
                    head = head.next;
                    return;
                }
            }
            second = second.next;
        }
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
        first.next = first.next.next;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.push(5);
        list.push(7);
        list.push(1);
        list.push(3);
        list.push(2);
        list.print();
        list.deleteNthNode(3);
        System.out.println();
        list.print();
    }

}
