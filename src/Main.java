import double_linked_list.Node;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5};

        Node generatedNodes = insertNodes(array);
        display(generatedNodes);
    };


    public static Node insertNodes(int[] data) {
        Node head = new Node(data[0]);
        Node tail = new Node(data[0]);
        head.next = tail;
        for (int i = 1; i < data.length; i++) {
            tail.next = new Node(data[i]);
            tail.prev = new Node(data[i - 1]);
            tail = tail.next;
        }
        return head;
    }


    public static void display(Node node) {
        Node head = node;
        Node tail = node;

        while (head.prev != null) {
            head = head.prev;
            System.out.print("prev: " + head.data + " ");
        }
        System.out.print("current: " + tail.data + " ");

        while(tail.next != null) {
            tail = tail.next;
            System.out.print("next: " + tail.data + " ");
        };

    }
}