package node_lists;

public class Node {
    int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node data) {
        this.next = data;
    }

    public Node getNextNode() {
        return this.next;
    }

    public int getData() {
        return this.data;
    }
}
