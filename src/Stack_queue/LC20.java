package Stack_queue;

import java.util.Stack;

public class LC20 {
}

class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.isEmpty()) {
                return false;
            }else {
                stack.pop();
            }
        }
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }
}
