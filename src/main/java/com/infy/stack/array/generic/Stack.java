package com.infy.stack.array.generic;

public class Stack<T> {

    private int capacity;
    private T[] array;
    private int top;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.top = -1;
    }

    public void push(T i) {

        if (isFull())
            throw new RuntimeException("Stack is full! Operation denied.");

        array[++top] = i;
    }

    public T pop() {

        if (isEmpty())
            throw new RuntimeException("Stack is empty. Operation denied.");

        return array[top--];
    }

    public T peek() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty. Operation denied.");

        return array[top];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == capacity -1;
    }
}
