package LinkedList;

public class Node<T> {  // defines the type of data in the Node class - here we are writing a generic Node class (ability to hold things other than int)
    public T data; // T is of data type - we are trying to write a Node that will work with any type of input
    public Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}
