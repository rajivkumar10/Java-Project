package practice;

import java.util.List;

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
    }
}

public class LinkedList {
    ListNode head;

    public void add(int value) {
        if (head == null) {
            head = new ListNode(value);
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(value);
    }

    public void delete(int value) {
        if (head == null) {
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

    public void print() {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int findMiddleNode() {
        if (head == null) {
            return -1;
        }
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null && fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow.data;
    }

    public void reverse() {
        if (head == null) {
            return;
        }
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.print();
        System.out.println(linkedList.findMiddleNode());

        linkedList.delete(40);
        linkedList.print();
        linkedList.reverse();
        linkedList.print();
    }


}
