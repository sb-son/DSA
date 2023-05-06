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

        System.out.println("\nPrepend List:");
        prependLinkedList.printList();

        /* removing first from a linked list */
        System.out.println("\nRemove List:");
        LinkedList removeFirstLinkedList = new LinkedList(2);
        removeFirstLinkedList.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(removeFirstLinkedList.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(removeFirstLinkedList.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(removeFirstLinkedList.removeFirst());

        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null
        */

        //Get an index from linked list
        System.out.println("\nGet index from Linked list:");
        LinkedList getIndexFromLinkedList = new LinkedList(0);
        getIndexFromLinkedList.append(1);
        getIndexFromLinkedList.append(2);
        getIndexFromLinkedList.append(3);


        System.out.println(getIndexFromLinkedList.get(3).value);

        /*
            EXPECTED OUTPUT:
            ----------------
            3
        */

        //Set a value at an index of the linked list
        System.out.println("\nSet value at index from linked list:");
        LinkedList setValueFromLinkedList = new LinkedList(0);
        setValueFromLinkedList.append(1);
        setValueFromLinkedList.append(2);
        setValueFromLinkedList.append(3);

        System.out.println("Linked List before set():");
        setValueFromLinkedList.printList();

        setValueFromLinkedList.set(2, 99);

        System.out.println("\nLinked List after set():");
        setValueFromLinkedList.printList();

         /*
            EXPECTED OUTPUT:
            ----------------
            Linked List before set():
            0
            1
            2
            3

            Linked List after set():
            0
            1
            99
            3
        */
    }
}
