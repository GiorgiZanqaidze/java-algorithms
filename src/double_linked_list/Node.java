package double_linked_list;

public class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node (int data, Node prevNode) {
        this.data = data;
        this.next = null;
        this.prev = prevNode;
    }
    public Node (int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
