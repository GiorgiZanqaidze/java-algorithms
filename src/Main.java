

import node_lists.Node;
import node_list_upgraded.NodeListUpgraded;

public class Main {
    public static void main(String[] args) {
        // int[] array = {1, 2, 3, 5};
        // Node head =  null;
        // Node tail = null;

        // for (int i = 0; i < array.length; i++) {
        //     Node newNode = new Node(array[i]); // Create a new node for the current element

        //     if (head == null) { // If the NodeList is empty
        //         head = newNode; // Set the new node as the head
        //         tail = newNode; // Also set it as the tail
        //     } else { // If NodeList is not empty
        //         tail.next = newNode; // Link the new node to the end of the list
        //         tail = newNode; // Update the tail to be the new node
        //     }
        // }

        // Node current = head;

        // while(current != null) {
        //     System.out.print(current.getData() + " ");
        //     current = current.next;
        // }


        int[] array = {1, 2, 3, 5};
        NodeListUpgraded head = null;
        NodeListUpgraded tail = null;


        for (int i = 0; i < array.length; i++) {
            NodeListUpgraded newNode = new NodeListUpgraded(array[i]);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        while (head != null) {
            System.out.print(head.getData() + " ");
            head = head.next;
        }


    }
}