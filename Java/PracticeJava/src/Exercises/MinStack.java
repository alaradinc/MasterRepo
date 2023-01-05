package Exercises;

import NodeBasedStack.StackUnderflowException;


public class MinStack {

    Node top; //why do we not define this in the Node class?

    void push(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            top = newNode;
        }
        else{
            Node oldTop = top;
            top = newNode;
            newNode.next = oldTop;
        }
    }

    int pop() throws StackUnderflowException {
        if(isEmpty()){
            throw new StackUnderflowException("List is Empty");
        }

        int hold = top.data;
        top = top.next;
        return hold;
    }

    int peak() throws StackUnderflowException {
        if(isEmpty()){
            throw new StackUnderflowException("List is Empty");
        }
        return top.data;
    }

    boolean isEmpty(){
        return top == null;
    }

    void clear(){
        top = null;
    }

    void findMin(int data) throws StackUnderflowException {
        if(isEmpty()){
            throw new StackUnderflowException("This list is empty");
        }
        if(data < top.data){
            pop();
            push(data);

        }

    }

}
