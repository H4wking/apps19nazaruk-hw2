package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    private Stack stack;
    private Object[] arr;

    @Before
    public void setUp() {
        stack = new Stack();
        arr = new Object[]{1, 2, 3, 4, 5};
    }

    @Test
    public void testPeek() {
        stack.push(arr[0]);
        assertEquals(arr[0], stack.peek());
    }

    @Test
    public void testPop() {
        stack.push(arr[0]);
        stack.push(arr[1]);
        assertEquals(arr[1], stack.pop());
    }

    @Test
    public void testPush() {
        stack.push(arr[0]);
        assertEquals(arr[0], stack.peek());
        stack.push(arr[1]);
        assertEquals(arr[1], stack.peek());
    }
}
