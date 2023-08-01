package Stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/*
请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通栈的全部四种操作（push、peek、pop 和 empty）。
void push(int x) 将元素 x 压入栈顶。
int pop() 移除并返回栈顶元素。
int top() 返回栈顶元素。
boolean empty() 如果栈是空的，返回 true ；否则，返回 false 。

队列的基本操作 —— 也就是 push to back、peek/pop from front、size 和 is empty 这些操作。

Queue<Integer> q1 = new ArrayDeque<>();

Deque<Integer> que1 = new ArrayDeque<>();
Deque 接口继承了 Queue 接口
所以 Queue 中的 add、poll、peek等效于 Deque 中的 addLast、pollFirst、peekFirst
 */
public class LC225 {

}

class MyStack {

    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public MyStack() {
        queue1 = new ArrayDeque<>();
        queue2 = new ArrayDeque<>();
    }

    public void push(int x) {
        while (!queue1.isEmpty()){
            queue2.add(queue1.poll());
        }
        queue1.add(x);
        while (!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }
    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}

class MyStack225 {

    Deque<Integer> queue;

    public MyStack225() {
        queue = new ArrayDeque<>();
    }

    public void push(int x) {
        queue.addLast(x);
    }

    public int pop() {
        int size = queue.size();
        while (size-- > 1){
            queue.addLast(queue.peekFirst());
            queue.pollFirst();
        }
        return queue.pollFirst();
    }

    public int top() {
        return queue.peekLast();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
