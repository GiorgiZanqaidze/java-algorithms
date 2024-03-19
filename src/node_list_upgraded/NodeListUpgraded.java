package node_list_upgraded;

public class NodeListUpgraded {
    Object data;
    public NodeListUpgraded next;


    public NodeListUpgraded(Object data) {
        this.data = data;
        this.next = null;
    }

    public Object getData() {
        return this.data;
    }

}