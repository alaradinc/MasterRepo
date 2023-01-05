package Exercises;

import java.util.*;

import NodeBasedStack.StackUnderflowException;

public class Palindrome { //why is this highlighted green vs. max and min stack classes?

    Node top; //why do we not define this in the Node class?

    boolean isEmpty(){
        return top == null;
    }

    void push(int data) throws StackUnderflowException {

        Node newNode = new Node(data);

        if (isEmpty()) {
            throw new StackUnderflowException();
        } else {
            Node oldTop = top;
            top = newNode;
            newNode.next = oldTop; //could we have just said this line instead of creating an oldNode variable
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a string text: ");
        String input = scan.nextLine();

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reverseInput = "";

        while (!stack.isEmpty()) {
            reverseInput += stack.pop();
        }

        if (input.equals(reverseInput))
            System.out.println("Yo! that is a palindrome.");
        else
            System.out.println("No! that isn't a palindrome.");

    }
}


}
