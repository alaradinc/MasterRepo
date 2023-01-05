package LinkedList;

public class InvalidIndexException extends Exception {
    public InvalidIndexException(String message) {
        super(message); //message is a variable name we form, we can give it anything (e.g. s, x, input)
    }
}
