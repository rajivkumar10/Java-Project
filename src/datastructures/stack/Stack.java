package datastructures.stack;

public class Stack {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack");
        }
        return top.data;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
        }
        Node node = top;
        while (node != null) {
            System.out.println(node.data + ",");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Is Empty? :" + stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.print();
        System.out.println("Pop data:" + stack.pop());
        stack.print();
    }
}
