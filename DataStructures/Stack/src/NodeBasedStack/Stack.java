package NodeBasedStack;

public class Stack {

    protected Node top; //we write top here because Nodes do not logically have a 'top', this is a linkedlist attribute
    // usually because the top is critical in a stack (otherwise the entire list could be deleted), you will usually not make these public

    public void push(int data) { //must make this 'public' to be able to use this in the other packages
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

    public int pop() throws StackUnderflowException {
        if(isEmpty()){
            throw new StackUnderflowException("List is empty!");
        }
        int ans = top.data;
        top = top.next;
        return ans;
    }

    public int peek() throws StackUnderflowException{
        if (isEmpty()){
            throw new StackUnderflowException("List is empty!");
        }

        return top.data; //we must return an integer, so we call top.data
    }

    public boolean isEmpty() {
        return top == null;

    }

    public void clear() {
        top = null;
    }
}
