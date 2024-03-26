package leetcode_algorithms;

public class GenerateLinkedList {

    public static ListNode generateLinkedList(int[] arr) {
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " <- ");
            current = current.next;
        }
    }
}
