package ArrayBasedStack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStack {
    Stack stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack(3);
    }

    @After
    public void tearDown() throws Exception {
        stack = null;
    }

    @Test
    public void testPush() {
        try {
            stack.push(1);
            stack.push(2);
            stack.push(5);
        } catch (StackOverflowException e) {
            fail();
        }

        try {
            stack.push(2);
            fail();
        } catch (StackOverflowException e) {
            assertEquals("ArrayBasedStack.Stack is full!", e.getMessage());
        }
    }

    @Test
    public void testPop() {
        try {
            stack.pop();
            fail(); //we expect the test to enter the catch statement since the stack is empty. so if it doesn't fail/throw exception we manually force it to fail in 'try'
        } catch (StackUnderflowException e) {
            assertEquals("ArrayBasedStack.Stack is empty!", e.getMessage());
        }

        try {
            stack.push(5);
            stack.push(10);
            stack.push(133);

            assertEquals(133,stack.pop()); //pop return eden bir function, bu yuzden ilk once top value i control ediyoruz - sonra siliyoruz
            assertEquals(10,stack.pop());
            assertEquals(5,stack.pop());
        } catch (StackOverflowException | StackUnderflowException e) {
            fail(); //we do not expect the try section to fail and throw and exception' so if it does then we force it to fail in the catch section
        }

        try { //above we filled and emptied the stack, so here we are checking one last time if the function works - it should throw an exception since it is empty, otherwise we manually fail it
            stack.pop();
            fail();
        } catch (StackUnderflowException e) {
            assertEquals("ArrayBasedStack.Stack is empty!", e.getMessage());
        }
    }
//
    @Test
    public void testPeek() {
        try {
            stack.peek();
            fail();
        } catch (StackUnderflowException e) {
            assertEquals("ArrayBasedStack.Stack is empty!",e.getMessage());
        }

        try {
            stack.push(5);
            assertEquals(5,stack.peek()); //we tell the system we expect 5, given the function stack peek()
            stack.push(11); //we do not input a variable into peek because it always returns the top element, this is why inside peek is empty peek()
            assertEquals(11,stack.peek());
            stack.push(21);
            assertEquals(21,stack.peek());
            stack.pop();
            assertEquals(11,stack.peek());
        } catch (StackOverflowException | StackUnderflowException e) {
            fail();
        }
    }
//
    @Test
    public void testSize() {
        assertEquals(0,stack.size());
        try {
            stack.push(17);
            assertEquals(1,stack.size());
            stack.push(55);
            assertEquals(2,stack.size());
            stack.push(77);
            assertEquals(3,stack.size());
        } catch (StackOverflowException e) {
            fail();
        }

        try {
            stack.pop();
            assertEquals(2,stack.size());
            stack.pop();
            assertEquals(1,stack.size());
            stack.pop();
            assertEquals(0,stack.size());

        } catch (StackUnderflowException e) {
            fail();
        }
    }
//
    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        try {
            stack.push(1);
            assertFalse(stack.isEmpty());
            stack.pop();
            assertTrue(stack.isEmpty());
        } catch (StackOverflowException | StackUnderflowException e) {
            fail();
        }

    }

    @Test
    public void testIsFull() {
        assertFalse(stack.isFull());
        try {
            stack.push(5);
            stack.push(15);
            stack.push(85);
            assertTrue(stack.isFull());
            stack.pop();
            assertFalse(stack.isFull());
        } catch (StackOverflowException | StackUnderflowException e) {
            fail();
        }
    }
}
