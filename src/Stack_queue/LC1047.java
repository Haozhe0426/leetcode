package Stack_queue;

import java.util.Stack;

public class LC1047 {
}

class Solution1047 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        String str = new String();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (stack.isEmpty() || ch != stack.peek()) {
                stack.push(ch);
            } else {
                stack.pop();
            }
        }
        while (!stack.isEmpty()) {
            str = stack.pop() + str;
        }
        return str;
    }
}