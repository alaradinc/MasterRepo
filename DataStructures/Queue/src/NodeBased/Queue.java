package NodeBased;

import ArrayBased.QueueUnderFlowException;

public class Queue { //define attributes first
    Node front; //we are working with Nodes and the front shows a 'Node'
    Node rear;
    int currentSize;

    public Queue() { //we write constructors and methods inside the class!
        // this.rear = this.front = null; --> for shortcut
        this.front = null;
        this.rear = null;
        this.currentSize = 0;
    }

    public void enqueue(int data) { //we don't define data as an attribute because it is not connected to Queue's characteristics
        Node node = new Node(data); //because we have to create a node under every insertion circumstance we write it as the first line and do not place it in the if statement

        if (isEmpty()) {
            this.front = this.rear = node; //writing 'this.' makes sure that we are referring to the attribute variable and not another variable inside the method that might have the same name
        }

        this.rear.next = node;
        this.rear = node; //the variable/value on the right is given to the value on the left

        this.currentSize++;
    }

    public int dequeue() throws QueueUnderFlowException { //dequeue doesn't get a parameter because you cannot randomly remove a node from the queue, you have to remove from the front
        if (isEmpty()){
            throw new QueueUnderFlowException("Queue is empty!");
        }

        int oldNode = this.front.data; //we make this method an int method because otherwise reassigning the old node would maintain its pointer and may not delete it

        if(this.front == this.rear){
            this.rear = this.rear.next;// we are making 'rear' null by making it equal to the imaginary node to the right of the last node, because the node to the right or the last doesn't have data in it, it will return null
        }

        this.front = this.front.next; //front is changing so that the front.next (next in line to the right) becomes the new front

        this.currentSize--;
        return oldNode; //you may not place a statement after the return line!
    }

    public int peek() throws QueueUnderFlowException {
        if(isEmpty()){
            throw new QueueUnderFlowException("Queue is empty!");
        }
        return this.front.data;
    }

    public int size(){
        return this.currentSize;
    }

    public boolean isEmpty() {
        return this.front == null && this.rear == null;
    }
}