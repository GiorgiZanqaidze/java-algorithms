

import node_list_upgraded.NodeListUpgraded;

public class Main {
    public static void main(String[] args) {

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

        NodeListUpgraded newHead = addNewHead(head, 213213);

        printList(newHead);
    }

    private static void printList(NodeListUpgraded nodeHead) {

        while (nodeHead != null) {
            System.out.print(nodeHead.getData() + " ");
            nodeHead = nodeHead.next;
        }
    }


    private static NodeListUpgraded addNewHead(NodeListUpgraded head, Object data) {
        NodeListUpgraded newHead = new NodeListUpgraded(data);
        newHead.next = head;
        return newHead;
    }
}