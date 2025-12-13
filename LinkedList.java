class Node {
    int value;
    Node next; // reference to the next node
}


public class LinkedList {
    
    public static void main(String[] args){


        Node head = new Node();
        head.value = 10;
        head.next = null;

        Node node2 = new Node();
        node2.value = 20;
        node2.next = null;

        Node tail = new Node();
        tail.value = 30;
        tail.next = null;

        head.next = node2; // linking head to node2

        node2.next = tail; // linking node2 to tail



        Node current = head;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
}

// Insertion and deletion is faster compared to arrays
// Dynamic size
// No memory wastage
// But accessing elements is slower as we have to traverse from head to the desired node
// Uses more memory due to storing references
