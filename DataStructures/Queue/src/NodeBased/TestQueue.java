package NodeBased;

import ArrayBased.QueueUnderFlowException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestQueue {
    Queue queue;

    @Before
    public void setUp() throws Exception {
        queue = new Queue();
    }

    @After
    public void tearDown() throws Exception {
        queue = null;
    }

    @Test
    public void testEnqueue() {
        queue.enqueue(1);
        assertEquals(1, queue.front.data);
        assertEquals(1, queue.rear.data);
        queue.enqueue(4);
        assertEquals(1, queue.front.data);
        assertEquals(4, queue.rear.data);
        queue.enqueue(18);
        assertEquals(1, queue.front.data);
        assertEquals(18, queue.rear.data);
        queue.enqueue(555);
    }

    @Test
    public void testDequeue() {
        try {
            queue.dequeue();
            fail();
        } catch (QueueUnderFlowException e) {
            assertEquals("Queue is empty!", e.getMessage());
        }
        try {
            queue.enqueue(3);
            queue.enqueue(33);
            queue.enqueue(333);

            assertEquals(3, queue.dequeue());
            assertEquals(33, queue.dequeue());
            assertEquals(333, queue.dequeue());
        }  catch (QueueUnderFlowException e) {
            fail();
        }
    }

    @Test
    public void testPeek() {
        try {
            queue.peek();
            fail();
        } catch (QueueUnderFlowException e) {
            assertEquals("Queue is empty!",e.getMessage());
        }

        try {
            queue.enqueue(5);
            assertEquals(5,queue.peek());
            queue.enqueue(3);
            assertEquals(5,queue.peek());
            queue.dequeue();
            assertEquals(3,queue.peek());
            queue.dequeue();
        } catch (QueueUnderFlowException e) {
            fail();
        }

        try {
            queue.peek();
            fail();
        } catch (QueueUnderFlowException e) {
            assertEquals("Queue is empty!",e.getMessage());
        }
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());
        try {
            queue.enqueue(1);
            queue.enqueue(3);
            queue.enqueue(5);
            assertFalse(queue.isEmpty());
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            assertTrue(queue.isEmpty());
        } catch (QueueUnderFlowException e) {
            fail();
        }
    }

    @Test
    public void testSize() {
        assertEquals(0,queue.size());
        try {
            queue.enqueue(1);
            queue.enqueue(10);
            assertEquals(2,queue.size());
            queue.dequeue();
            queue.dequeue();
            assertEquals(0,queue.size());
        } catch (QueueUnderFlowException e) {
            fail();
        }

    }
}
