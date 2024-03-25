package leetcode_algorithms;

public class AddTwoNumbers {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize Dummi head
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        
        // For the first iterate carry must be 0
        int carry = 0;

        while (l1 != null || l2 != null) {
            // Get the digit from l1 and l2
            // If not exist get 0
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Add digits with carry
            int sum = x + y + carry;
            // Remember the new carry value
            carry = sum / 10;

            // Save new node to the next
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        // Example usage
        AddTwoNumbers solution = new AddTwoNumbers();
        AddTwoNumbers.ListNode l1 = solution.new ListNode(2);
        l1.next = solution.new ListNode(4);
        l1.next.next = solution.new ListNode(3);

        AddTwoNumbers.ListNode l2 = solution.new ListNode(5);
        l2.next = solution.new ListNode(6);
        l2.next.next = solution.new ListNode(4);

        AddTwoNumbers.ListNode result = solution.addTwoNumbers(l1, l2);

        // Printing the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
