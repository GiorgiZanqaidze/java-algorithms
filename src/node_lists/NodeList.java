package node_lists;

public class NodeList {

    public static int getNodeListLength(Node head) {
        int length = 0;
        Node current = head;

        while (current != null) {
            length++;
            current = current.next;
        }

        return length;
    }
    
}
