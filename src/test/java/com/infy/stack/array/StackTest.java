package com.infy.stack.array;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing Stack Class")
class StackTest {

    Stack stack;

    @BeforeEach
    void init() {
        stack = new Stack(3);
        stack.push(3);
        stack.push(2);
    }


    @Nested
    @DisplayName("push() method")
    class PushTest {

        @Test
        @DisplayName("when pushing integers to the stack")
        void testPushWithInteger() {
            stack.push(4);
            assertEquals(4, stack.peek());
        }

        @Test
        @DisplayName("when pushing an integer beyond stack capacity")
        void testStackOverflow() {
            stack.push(4);
            assertThrows(RuntimeException.class, () -> stack.push(5));
        }
    }

    @Nested
    @DisplayName("pop() method")
    class PopTest {

        @Test
        @DisplayName("when fetching top element of stack")
        void testTopElement() {
            assertEquals(2, stack.pop());
        }

        @Test
        @DisplayName("when the stack is empty")
        void testForEmptyStack() {
            stack.pop();
            stack.pop();
            assertThrows(RuntimeException.class, () -> stack.pop());
        }
    }

    @Nested
    @DisplayName("peek() method")
    class PeekTest {

        @Test
        @DisplayName("fetching top element of stack")
        void testTopElement() {
            assertEquals(2, stack.pop());
        }

        @Test
        @DisplayName("when the stack is empty")
        void testForEmptyStack() {
            stack.pop();
            stack.pop();
            assertThrows(RuntimeException.class, () -> stack.peek());
        }
    }


}