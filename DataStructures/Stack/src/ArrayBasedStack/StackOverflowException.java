package ArrayBasedStack;

public class StackOverflowException extends Exception {

    StackOverflowException(){
        super();
    }

    StackOverflowException(String msg) {
        super(msg);
    }
}
