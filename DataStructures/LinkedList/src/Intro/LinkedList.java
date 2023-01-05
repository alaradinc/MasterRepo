package Intro;

public class LinkedList {
    Node head; //this is not a single head this is an object that contains an integer value with a reference to the next linked node

    LinkedList() {
        this.head = null; //constructor that sets the initial value of the node (without any inputs)
    } //the head exists (it is a reference), but doesn't have a value (so it isn't referring to anything in the RAM)

    void append(int data) {
        if (head == null) {
            this.head = new Node(data); //this replaces the null value of the head with the node that contains data which user inputted
            return; //very critical that you understand this: we do not assign a number into the original 'null' node. we simply reassign another created node 'data' to be the head
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    void prepend(int data) {
        if (head == null) {
            this.head = new Node(data);
            return; //this completes the if statement and 'prepend' function without the need for an 'else' statement
        }
        Node x = new Node(data); //creating a new node with the data you input
        // the variable x and its contents will be deleted at the end of this function (since it is local) unless they are assigned to another variable out of this function
        x.next = head; //connected the head and its components to the x node
        head = x; //reassign the x node as head and as a result override the original head components
    }

    public void delete(int input) {
        //you cannot delete a head with null value because logically it doesn't exist in the RAM (not initialized)
        //so in this example we assume that the head has a value other than null (so it can be deleted)

        // head = head.next; // this deletes the head (shifts the head to the next object of node) since the head doesn't have a reference anymore it gets sent to the java garbage collector
        // the java garbage collector deletes variables without a reference from the memory (aka RAM)

        if (input == head.data) { // we are accessing the value inside of head and compare it with our input to see if they are the same

            head = head.next;
            return; //closing the function so we don't have to write else
        }

        Node current = head; //creating a new reference of the type Intro.Node and assigning it to head (so we can refer to head as 'current')
        // we create the current variable so we can move across the linked list without changing the head value (otherwise we jeopardize deleting the entire list)
        while (input != current.next.data) {
            current = current.next; //with this function we are moving 'current' to the right
        }

        current.next = current.next.next;
    }

    public boolean contains(int input) {

        Node current = head;

        while (current != null) {//you cannot simply compare input to current (input != current) because they are of different types - input is an integer and current is a Intro.Node
            //primitive values cannot be 'null' (objects can be null - think of it as a box' a box can hold nothing' but a value within the box must be something
            if (input == current.data) {
                return true;
            }

            current = current.next; //we do this so we can move across the linked list (traverse)
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    } // because this method is of boolean type we can return true / false

    // 5 3 2 1 6 45 8
    public int indexOf(int input) {
        Node current = head; //because we need to move across the list we create the current variable

        int i = 0;

        while (current != null){
            if (input == current.data){
                return i;
            }
            i++;
            current = current.next;
        }
        return -1; // we must return an integer and cannot return 'false' because method is of int type
    }
    public int get(int index){
        Node current = head;

        for(int i = 0; i <index; i++){
            current = current.next;
        }

        return current.data;
    }

    public void clear(){
        head = null; // deletes the list by deleting the head - since we make the value of head null it no
                    // longer points to anything and as a result other nodes connected to it get deleted because they have to initial reference
    }

    public int getFirst(){
        return head.data; //must say head.data so you return its value

    }

    public int getLast(){
        Node current = head;

        while (current.next != null){
            current = current.next;
        }

        return current.data;
    }

    public int size(){
        Node current = head;

        int i = 0;

        while (current.next != null){
            current = current.next;
            i++;
        }
        return i;
    }
}
