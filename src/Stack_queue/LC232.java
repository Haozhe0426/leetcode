package Stack_queue;

/*
队列支持的所有操作（push、pop、peek、empty）
void push(int x) 将元素 x 推到队列的末尾
int pop() 从队列的开头移除并返回元素
int peek() 返回队列开头的元素
boolean empty() 如果队列为空，返回 true ；否则，返回 false

标准的栈操作 —— 也就是只有 push to top, peek/pop from top, size, 和 is empty
 */

import java.util.Stack;

public class LC232 {
}

class MyQueue {

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;
    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        stackIntoOut();
        return stackOut.pop();
    }

    public int peek() {
        stackIntoOut();
        return stackOut.peek();
    }

    public boolean empty() {
        return stackOut.isEmpty()&&stackIn.isEmpty();
    }

    public  void stackIntoOut(){
        if (!stackOut.isEmpty()){
            return;
        }
        while (!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }

    }
}
