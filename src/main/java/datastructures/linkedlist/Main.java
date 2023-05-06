package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        // adding to the end of a linked list
        myLinkedList.append(2);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List:
            4
         */

        /* removing last from a linked list */

        System.out.println("\nRemove last from a linked list:");
        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().value);
        // (1) Items - Returns 1 Node
        System.out.println(myLinkedList.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeLast());


        /* prepending to a linked list */
        LinkedList prependLinkedList = new LinkedList(2);
        prependLinkedList.append(3);

        System.out.println("\nBefore prepend():");
        System.out.println("-----------------");
        prependLinkedList.getHead();
        prependLinkedList.getTail();
        prependLinkedList.getLength();

        System.out.println("\nLinked List:");
        prependLinkedList.printList();

        prependLinkedList.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        prependLinkedList.getHead();
        prependLinkedList.getTail();
        prependLinkedList.getLength();

        System.out.println("\nLinked List:");
        prependLinkedList.printList();
    }
}
