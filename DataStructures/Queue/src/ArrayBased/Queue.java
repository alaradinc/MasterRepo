public class Queue {
    int[] queue; //these variables are by default protected, we could write protected in front of int but it would be the same thing
    int front;
    int rear;
    int currentSize;
    final int capacity;

    Queue(int capacity) {
        this.capacity = capacity;
        this.currentSize = 0;
        this.rear = -1;
        this.front = -1; //front variable takes on values of the array index, so to make it unreachable if the array is empty, we define it as -1
        this.queue = new int[capacity]; //create an array - which is also called a queue in this situation because we are defining certain rules for the array which will make it act like a queue
    }

    public void enqueue(int data) throws QueueOverFlowException { //insertion function
        /*
            Enqueue Operation
                check if the queue is full
                for the first element, set the value of FRONT to 0
                increase the REAR index by 1
                add the new element in the position pointed to by REAR
        */

        if (isFull()) { //getting in line (adding)
            throw new QueueOverFlowException("Queue is full!"); //we must write this exception
        }
        if (currentSize == 0) {
            front = 0; // front stays the same index number because the front's position logically never changes.
        }
        rear++; //we change the rear index because as more people get in and out of line, the back of the line's place move
        queue[rear] = data; // add the data into the end of the line whose place is represented by the rear variable holding the index
        currentSize++;

    }

    public int dequeue() throws QueueUnderFlowException { // deletion function
        /*
            Dequeue Operation
                check if the queue is empty
                return the value pointed by FRONT
                increase the FRONT index by 1
                for the last element, reset the values of FRONT and REAR to -1


         */


        if (isEmpty()) {
            throw new QueueUnderFlowException("Queue is empty!");
        }
        int oldData = queue[front]; //hold the current front value, otherwise it will be lost when we delete it, however because it no longer has an array index value associated with it,
        //we are moving up the front value, because they are leaving the line

        if (front == rear) {
            front = -1; // front = rear = -1;
            rear = -1; //we reset these to their original values, because we will override the other index values
        }
        else{
            front++;
        }

        currentSize--;
        return oldData;
    }

    public int peek() throws QueueUnderFlowException {
        if (isEmpty()) {
            throw new QueueUnderFlowException("Queue is empty!");
        }
        return queue[front];
    }

    public int size() {

        return currentSize; //if the ++ is on the right of the variable, the precedence is given to the variable value, then it is increased. you must put the ++ in front to increase it before returning the value
    }

    public boolean isEmpty() {
        return currentSize == 0; //currentSize is modified by enqueue and dequeue functions
    }


    public boolean isFull() {
        return currentSize == capacity; //== still compares the value inside but gives a boolean result
    }
}
