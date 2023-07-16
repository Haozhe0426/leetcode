package ListNode;

public class LC142 {
}

class Solution142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode index1 = head;
        while(fast.next != null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){//追上成环////
                while (index1 != slow){//x = (n-1)(y+z) + z
                    index1 = index1.next;
                    slow = slow.next;
                }
                return index1;
            }
        }
        return null;
    }
}
