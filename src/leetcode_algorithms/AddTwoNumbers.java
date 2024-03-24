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
        int number_1 = 0;
        int number_2 = 0;

        while (l1 != null) {
            number_1 += l1.val; 
            l1 = l1.next;
        }

        while (l2 != null) {
            number_2 += l2.val; 
            l2 = l2.next;
        }

        String numberStr_1 = String.valueOf(number_1);
        String numberStr_1_reversed = "";

        for (int i = numberStr_1.length(); i > 0; i--) {
            numberStr_1_reversed += numberStr_1.toCharArray()[i];
        }

        String numberStr_2 = String.valueOf(number_2);
        String numberStr_2_reversed = "";

        for (int i = numberStr_1.length(); i > 0; i--) {
            numberStr_2_reversed += numberStr_2.toCharArray()[i];
        }

        int sumOfNums = Integer.parseInt(numberStr_1_reversed) + Integer.parseInt(numberStr_2_reversed);


        ListNode result = new ListNode(String.valueOf(sumOfNums).toCharArray()[0]);

        for (int i = 0; i < String.valueOf(sumOfNums).length(); i++) {
            result.next = new ListNode(String.valueOf(sumOfNums).toCharArray()[i]);
            result = result.next;
        }

        return result;
    }


    public static void main(String[] args) {
       
    }

    
}