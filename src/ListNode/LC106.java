package ListNode;

public class LC106 {
}
class Solution106 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0, lenB = 0;
        while (curA != null) { // 求链表A的长度
            lenA++;
            curA = curA.next;
        }
        while (curB != null) { // 求链表B的长度
            lenB++;
            curB = curB.next;
        }
        // 求长度差
        int gab = 0;
        if (lenA > lenB) {
            curA = headA;
            curB = headB;
            gab = lenA - lenB;
        }else {
            curA = headB;
            curB = headA;
            gab = lenB - lenA;
        }
        // 让curA和curB在同一起点上（末尾位置对齐）
        while (gab-- > 0) {
            curA = curA.next;
        }
        // 遍历curA 和 curB，遇到相同则直接返回
        while (curA != null) {
            if (curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }
}
