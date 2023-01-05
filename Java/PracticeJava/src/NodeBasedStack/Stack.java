package NodeBasedStack;

public class Stack {
    Node top;

    void push(int data) {
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
            throw new StackUnderflowException("List is empty!");
        }
        int ans = top.data;
        top = top.next;
        return ans;
    }

    int peek() throws StackUnderflowException{
        if (isEmpty()){
            throw new StackUnderflowException("List is empty!");
        }

        return top.data; //we must return an integer, so we call top.data
    }

    boolean isEmpty() {
        return top == null;

    }

    void clear() {
        top = null;
    }
}
