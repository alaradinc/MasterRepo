package ArrayBased;

public class QueueUnderFlowException extends Exception {
    public QueueUnderFlowException(String s) { //this is automatically generated because we have a string inside the exception we wrote in the queue class
        super(s);
    }
}
