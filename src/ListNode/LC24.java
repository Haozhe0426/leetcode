package ListNode;

import java.util.List;

public class LC24 {
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head = Solution24.swapPairs(head);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
class Solution24{
    public static ListNode swapPairs(ListNode head){
        ListNode dumyhead = new ListNode(-1, head);
        ListNode current = dumyhead;
        ListNode first;
        ListNode second;
        ListNode temp;
        while(current.next!=null&&current.next.next!=null){
            first = current.next;
            second = current.next.next;
            temp = current.next.next.next;
            current.next = second;
            second.next = first;
            first.next = temp;
            current = first;
        }
        return dumyhead.next;
    }
}
