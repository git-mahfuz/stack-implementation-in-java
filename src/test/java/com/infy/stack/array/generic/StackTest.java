package com.infy.stack.array.generic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Testing Generic Stack Class")
class StackTest {

    Stack<String> stringStack;

    @BeforeEach
    void init() {
        stringStack = new Stack<>(3);
        stringStack.push("Foo");
        stringStack.push("Bar");
    }

    @Nested
    @DisplayName("push() method")
    class PushTest {

        @Test
        @DisplayName("when pushing integers to the stack")
        void testPushWithInteger() {
            stringStack.push("Bob");
            assertEquals("Bob", stringStack.peek());
        }

        @Test
        @DisplayName("when pushing an integer beyond stack capacity")
        void testStackOverflow() {
            stringStack.push("Bob");
            assertThrows(RuntimeException.class, () -> stringStack.push("Alice"));
        }
    }

    @Nested
    @DisplayName("pop() method")
    class PopTest {

        @Test
        @DisplayName("when fetching top element of stack")
        void testTopElement() {
            assertEquals("Bar", stringStack.pop());
        }

        @Test
        @DisplayName("when the stack is empty")
        void testForEmptyStack() {
            stringStack.pop();
            stringStack.pop();
            assertThrows(RuntimeException.class, () -> stringStack.pop());
        }
    }

    @Nested
    @DisplayName("peek() method")
    class PeekTest {

        @Test
        @DisplayName("fetching top element of stack")
        void testTopElement() {
            assertEquals("Bar", stringStack.pop());
        }

        @Test
        @DisplayName("when the stack is empty")
        void testForEmptyStack() {
            stringStack.pop();
            stringStack.pop();
            assertThrows(RuntimeException.class, () -> stringStack.peek());
        }
    }
}