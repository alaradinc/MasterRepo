package Exercises;


import NodeBasedStack.Stack;
import NodeBasedStack.StackUnderflowException;

public class Palindrome {
    String str;

    public Palindrome(String str) {
        this.str = str;
    }

    // "ALARA" =>  {'A','L','A','R','A'}
    boolean evaluate() throws StackUnderflowException{
        Stack stack = new Stack(); // we create a new stack - which we can think of as 'importing the 6 different methods that were defined in the stack class, which tell us how they work together / their limits (basically rules of how they would operate in 'stack')
        String reversed = ""; //create an empty string which we will add the characters to

        for(char ch : str.toCharArray()){ // 'for-each (extended for loop) loop' - we create char variable called 'ch'
            // str.toCharArray - "ALARA" =>  {'A','L','A','R','A'}
            //char ch - variable that traverses this list / array (e.g. 'A' = ch, then the next round, 'L' = ch, and so on...
            stack.push(ch); //we tell the for loop to store each character in the stack
        }

        while(!stack.isEmpty()) {
            reversed += stack.pop(); //to add the characters back to the string, we reconvert them from integers into characters
        } //LIFO

        return str.equals(reversed); //if the reversed version of the str equals the original, then return true
        //we do not define 'reversed' variable as a class attribute, because we only use it within our function (local)

    }
}
