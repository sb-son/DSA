package datastructures.linkedlist;

import org.w3c.dom.Node;

public class LinkedList {
    // create class variables
    private Node head;
    private Node tail;
    private int length;

    // Node class, we will be using this for the linkedlist exercise
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // Constructor here
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
}
