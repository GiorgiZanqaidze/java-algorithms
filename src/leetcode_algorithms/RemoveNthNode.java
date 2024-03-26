package leetcode_algorithms;

public class RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head; // Point dummy's next to head
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer to the nth node from the beginning
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;

        return dummy.next; // Return dummy's next, not head
    }

}
