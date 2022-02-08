package practice;

class Node1 {
    int data;
    Node1 next;

    public Node1(int data) {
        this.data = data;
    }
}

public class Stack1 {
    Node1 top;

    public void push(int data) {
        Node1 node = new Node1(data);
        node.next = top;
        top = node;
    }

    public int pop() {
        int data = top.data;
        top = top.next;
        return data;
    }

    public void print() {
        Node1 node1 = top;
        while (node1 != null) {
            System.out.println(node1.data);
            node1 = node1.next;
        }
    }

    public static void main(String[] args) {
        Stack1 stack = new Stack1();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();
        System.out.println("--" + stack.pop());
        stack.print();
    }
}
