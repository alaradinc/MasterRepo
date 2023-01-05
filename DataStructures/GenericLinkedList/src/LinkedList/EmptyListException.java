package LinkedList;
//EmptyListException is a class we created - Exception is original java class
public class EmptyListException extends Exception{ // Exception(String str)
    public EmptyListException(String message) {
        super(message); //we're sending the message to the constructor of superclass to the Exception (original java class)

        //message is "List is empty"
        //sending message to the constructor of the Exception class
        //message is just a variable we defined (similar to how we do it in constructors)
    }
}
