import java.util.Arrays;

import node_lists.Node;

public class Main {
    public static void main(String[] args) {
        // Creating a sample NodeList: 1 -> 2 -> 3 -> 4 -> 5
        int[] array = {1, 2, 3, 5};
        System.out.println(Arrays.toString(array));
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node current = head;

        while(current.next != null) {
            System.out.print(current.getData() + " ");
            current = current.next;
        }

    }
}