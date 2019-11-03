package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    private Queue queue;
    private Object[] arr;

    @Before
    public void setUp() {
        queue = new Queue();
        arr = new Object[]{1, 2, 3, 4, 5};
    }
    
    @Test
    public void testPeek() {
        queue.enqueue(arr[0]);
        assertEquals(arr[0], queue.peek());
    }

    @Test
    public void testDequeue() {
        queue.enqueue(arr[0]);
        queue.enqueue(arr[1]);
        assertEquals(arr[0], queue.dequeue());
    }

    @Test
    public void testEnqueue() {
        queue.enqueue(arr[0]);
        assertEquals(arr[0], queue.peek());
        queue.enqueue(arr[1]);
        assertEquals(arr[0], queue.peek());
    }
    
}
