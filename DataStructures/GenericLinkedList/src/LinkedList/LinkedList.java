package LinkedList;

public class LinkedList<T> {
    public Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    void append(T data) {
        if (head == null) {
            this.head = new Node<>(data); //this replaces the null value of the head with the node that contains data which user inputted
            return; //very critical that you understand this: we do not assign a number into the original 'null' node. we simply reassign another created node 'data' to be the head
        }

        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<>(data);
    }

    void prepend(T data) {
        if (head == null) { //this.head tells the system that we are accessing the head variable from the class scope
            this.head = new Node<>(data); //this.head could be written as 'head' only if there are no other local head variables
            return; //this completes the if statement and 'prepend' function without the need for an 'else' statement
        }
        Node<T> x = new Node<>(data); //creating a new node with the data you input
        // the variable x and its contents will be deleted at the end of this function (since it is local) unless they are assigned to another variable out of this function
        x.next = head; //connected the head and its components to the x node
        head = x; //reassign the x node as head and as a result override the original head components
    }

    public void delete(T input) throws EmptyListException, InvalidDataException { //sending this code back to the @Test
        if (isEmpty()) { //these are exceptions we wrote
            throw new EmptyListException("List is empty!"); //calling the exception constuctor to create it
        }
        if (!contains(input)) //an exception we wrote
            throw new InvalidDataException("List does not contain this item!");
        //you cannot delete a head with null value because logically it doesn't exist in the RAM (not initialized)
        //so in this example we assume that the head has a value other than null (so it can be deleted)

        // head = head.next; // this deletes the head (shifts the head to the next object of node) since the head doesn't have a reference anymore it gets sent to the java garbage collector
        // the java garbage collector deletes variables without a reference from the memory (aka RAM)

        if (input == head.data) { // we are accessing the value inside of head and compare it with our input to see if they are the same
            head = head.next;
            return; //closing the function so we don't have to write else
        }

        Node<T> current = head; //creating a new reference of the type Intro.Node and assigning it to head (so we can refer to head as 'current')
        // we create the current variable so we can move across the linked list without changing the head value (otherwise we jeopardize deleting the entire list)
        while (input != current.next.data) {
            current = current.next; //with this function we are moving 'current' to the right
        }

        current.next = current.next.next;
    }

    public boolean contains(T input) {

        Node<T> current = head;

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
    public int indexOf(T input) throws InvalidDataException { //input of type T

        if (!contains(input)) { //when we arite an exception in the function we must write 'throws InvalidDataException' at the top of the class
            throw new InvalidDataException("List does not contain " + input);
        }
        Node<T> current = head; //because we need to move across the list we create the current variable

        int i = 0;

        while (current != null) {
            if (input == current.data) {
                return i;
            }
            i++;
            current = current.next;
        }
        return -1; // we must return an integer and cannot return 'false' because method is of int type
    }

    public T get(int index) throws InvalidIndexException {

        if (size() <= index) { //we say throw 'new' because we are creating an object
            throw new InvalidIndexException("Invalid Index!");
        }

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    public void clear() {
        head = null; // deletes the list by deleting the head - since we make the value of head null it no
        // longer points to anything and as a result other nodes connected to it get deleted because they have to initial reference
    }

    public T getFirst() throws EmptyListException {
        if(isEmpty()){
            throw new EmptyListException("List is empty!");
        }
        return head.data; //must say head.data so you return its value

    }

    public T getLast() throws EmptyListException {

        if(isEmpty()){
            throw new EmptyListException("List is empty!");
        }
        Node<T> current = head;

        while (current.next != null) {
            current = current.next;
        }

        return current.data;
    }

    public int size() {
        if (!isEmpty()) {
            Node<T> current = head;

            int i = 1;

            while (current.next != null) {
                current = current.next;
                i++;
            }
            return i;
        }
        return 0;
    }
}
