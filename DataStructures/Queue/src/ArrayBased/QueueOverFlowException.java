public class QueueOverFlowException extends Exception {
    public QueueOverFlowException(String s) {
        super(s); //superclass in icine gonderiyoruz gelen String'i - bu string mesajini biz define ediyoruz "Queue is full!"
        //I sent a string to the constructor
    }
}
