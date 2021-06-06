package com.infy.stack.array;

public class Stack {

    private int capacity;
    private int[] ints;
    private int top;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.ints = new int[capacity];
        this.top = -1;
    }

    public void push(int i) {

        if (isFull())
            throw new RuntimeException("Stack is full! Operation denied.");

        ints[++top] = i;
    }

    public int pop() {

        if (isEmpty())
            throw new RuntimeException("Stack is empty. Operation denied.");

        return ints[top--];
    }

    public int peek() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty. Operation denied.");

        return ints[top];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == capacity -1;
    }
}
