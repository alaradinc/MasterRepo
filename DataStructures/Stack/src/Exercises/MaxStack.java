package Exercises;

import NodeBasedStack.Stack;
import NodeBasedStack.StackUnderflowException;

public class MaxStack {
    Stack mainStack = new Stack();
    Stack maxStack = new Stack();

    void add(int data) throws StackUnderflowException {
        mainStack.push(data);
        if (maxStack.isEmpty()) { //must write these if statements separately due to exceptions
            maxStack.push(data);
        } else if (maxStack.peek() < data)
            maxStack.push(data);
    }

    void delete() throws StackUnderflowException {
        if (mainStack.pop() == maxStack.peek())
            maxStack.pop();
    }

    int getMax() throws StackUnderflowException {
        return maxStack.peek();
    }
}
