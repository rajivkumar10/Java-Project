package practice;

class QNode {
    int data;
    QNode next;

    public QNode(int data) {
        this.data = data;
    }
}

class Q {
    QNode head, tail;

    public void add(int val) {
        QNode node = new QNode(val);
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null) {
            head = node;
        }
    }

    public int remove() {
        if (head == null) {
            return -1;
        }
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public void print() {
        if (head == null) {
            return;
        }
        QNode node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

public class QueueTest {
    public static void main(String[] args) {
        Q q = new Q();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.print();
        q.remove();
        q.print();
    }
}
