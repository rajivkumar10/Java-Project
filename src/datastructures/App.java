package datastructures;

import datastructures.linkedlist.LinkedList;

import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(9);
        list.append(3);
        list.append(12);
        list.print();
        list.prepend(1);
        list.print();
        list.delete(3);
        list.print();
        System.out.println("Middle element: " + list.findMiddleNode());
        System.out.println("If loop exists: " + list.ifLoopExists());
        list.reverse();
        list.print();
    }
}
