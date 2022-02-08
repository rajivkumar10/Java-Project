package datastructures.queue;

public class Queue {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head; // remove data from here
    private Node tail; //add data here

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("No elements in queue");
        }
        return head.data;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null) {
            head = node;
        }
    }

    public int remove() {
        if (isEmpty()) {
            throw new RuntimeException("No elements in queue");
        }
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        Node node = head;
        while(node != null) {
            System.out.print(node.data + ",");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("Is Empty? :" + queue.isEmpty());
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.print();
        System.out.println("Peek: " + queue.peek());
        System.out.println("Remove data:" + queue.remove());
        System.out.println("Queue after remove:");
        queue.print();
    }
}
