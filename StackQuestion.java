import java.io.*;

interface Stack {
    public void push(int x);
    public int pop();
    public int peek();
    public boolean isEmpty();
    public boolean isFull();
}

class ArrayStack implements Stack {
    private int[] data;
    private int top;
    private int size;

    public ArrayStack(int maxSize) {
        this.data = new int[maxSize];
        this.top = -1;
        this.size = maxSize;
    }

    public void push(int x) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        data[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return data[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
}

public class StackQuestion {
    public static void main(String[] args) {
        Stack stack = new ArrayStack(10);
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

