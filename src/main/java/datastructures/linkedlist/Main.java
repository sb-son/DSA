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

        //Insert new node
        System.out.println("\nInsert new node to linked list:");
        LinkedList insertNewNodeLinkedList = new LinkedList(0);
        insertNewNodeLinkedList.append(1);
        insertNewNodeLinkedList.append(2);
        insertNewNodeLinkedList.append(3);


        System.out.println("LL before insert():");
        insertNewNodeLinkedList.printList();

        insertNewNodeLinkedList.insert(1, 2);

        System.out.println("\nLL after insert(2) in middle:");
        insertNewNodeLinkedList.printList();

        insertNewNodeLinkedList.insert(0, 0);

        System.out.println("\nLL after insert(0) at beginning:");
        insertNewNodeLinkedList.printList();

        insertNewNodeLinkedList.insert(6, 11);

        System.out.println("\nLL after insert(11) at end:");
        insertNewNodeLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            LL before insert():
            1
            3

            LL after insert(2) in middle:
            1
            2
            3

            LL after insert(0) at beginning:
            0
            1
            2
            3

            LL after insert(4) at end:
            0
            1
            2
            3
            4
        */

        LinkedList removeFromIndexLL = new LinkedList(1);
        removeFromIndexLL.append(2);
        removeFromIndexLL.append(3);
        removeFromIndexLL.append(4);
        removeFromIndexLL.append(5);

        System.out.println("\nLL before remove():");
        removeFromIndexLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(removeFromIndexLL.remove(2).value);
        System.out.println("LL after remove() in middle:");
        removeFromIndexLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(removeFromIndexLL.remove(0).value);
        System.out.println("LL after remove() of first node:");
        removeFromIndexLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(removeFromIndexLL.remove(2).value);
        System.out.println("LL after remove() of last node:");
        removeFromIndexLL.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            LL before remove():
            1
            2
            3
            4
            5

            Removed node:
            3
            LL after remove() in middle:
            1
            2
            4
            5

            Removed node:
            1
            LL after remove() of first node:
            2
            4
            5

            Removed node:
            5
            LL after remove() of last node:
            2
            4
        */
    }
}
