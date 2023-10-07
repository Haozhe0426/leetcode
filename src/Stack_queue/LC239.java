package Stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class LC239 {

}

class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        MyQue myQue = new MyQue();
        int[] res = new int[nums.length + 1 - k];
        for (int i = 0; i < k; i++) {
            myQue.add(nums[i]);
        }
        res[0] = myQue.peek();
        for (int i = k; i < nums.length; i++) {
            myQue.poll(nums[i - k]);
            myQue.add(nums[i]);
            res[i + 1 - k] = myQue.peek();
        }
        return res;
    }
}

class MyQue {
    Deque<Integer> deque;

    public MyQue() {
        deque = new LinkedList<>();
    }

    public void poll(int val) {
        if (!deque.isEmpty() && val == deque.peek()) {
            deque.poll();
        }
    }

    public void add(int val) {
        while (!deque.isEmpty() && val > deque.peekLast()) {
            deque.pollLast();
        }
        deque.add(val);
    }

    public int peek() {
        return deque.peek();
    }

}
