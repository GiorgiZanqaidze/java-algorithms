import leetcode_algorithms.GenerateLinkedList;
import leetcode_algorithms.ListNode;
import leetcode_algorithms.RemoveNthNode;


public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode removed = RemoveNthNode.removeNthFromEnd(head, 3);

        GenerateLinkedList.printLinkedList(removed);
    };
}