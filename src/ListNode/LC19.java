package ListNode;

import java.util.List;

public class LC19 {

}
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummynode = new ListNode(-1, head);
        ListNode fast = dummynode;
        ListNode slow = dummynode;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummynode.next;
    }
}
