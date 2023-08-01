package Stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC150 {
}

class Solution150 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> deque = new ArrayDeque<>();
        int nums1;
        int nums2;
        for (String str : tokens) {
            if ("+".equals(str)) {
                nums1 = deque.pop();
                nums2 = deque.pop();
                deque.push(nums2 + nums1);
            } else if ("-".equals(str)) {
                nums1 = deque.pop();
                nums2 = deque.pop();
                deque.push(nums2 - nums1);
            } else if ("*".equals(str)) {
                nums1 = deque.pop();
                nums2 = deque.pop();
                deque.push(nums2 * nums1);
            } else if ("/".equals(str)) {
                nums1 = deque.pop();
                nums2 = deque.pop();
                deque.push(nums2 / nums1);
            } else {
                deque.push(Integer.valueOf(str));
            }
        }
        return deque.pop();
    }
}