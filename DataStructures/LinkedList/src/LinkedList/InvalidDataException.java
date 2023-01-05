package LinkedList;

public class InvalidDataException extends Exception{ //calling the generic Exception attributes/methods  to use it in your personalized exception class

    public InvalidDataException(String message) {
        super(message);
    }
}
