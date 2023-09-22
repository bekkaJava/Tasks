package task6;

import java.util.LinkedList;
public class Stack<T> {
    private LinkedList<T> stack = new LinkedList<>();

    public void push(T element) {
        stack.push(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return stack.pop();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }


}
