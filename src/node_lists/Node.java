package node_lists;

public class Node {
    Object data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public Node() {
        this.data = null;
        this.next = null;
    }

    public void setNextNode(Node data) {
        this.next = data;
    }

    public Node getNextNode() {
        return this.next;
    }

    public Object getData() {
        return this.data;
    }
}
