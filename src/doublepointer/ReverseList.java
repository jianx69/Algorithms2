package doublepointer;

import java.util.List;

public class ReverseList {
    public static ListNode reverseList(ListNode head) {
        ListNode left = null;
        ListNode right = head;
        while(right.next != null){
            ListNode temp = right.next;
            right.next = left;
            left = right;
            right = temp;
        }
        right.next = left;
        return right;

    }
}

