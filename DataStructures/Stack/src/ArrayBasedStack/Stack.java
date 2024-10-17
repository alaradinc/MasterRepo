package ArrayBasedStack;

public class Stack { // without public keyword it becomes the default class which is protected (allows access within package), private only allows access within class
    private final int[] arr; //we define as final because we do not change the size of the array once defined
    private int top;
    private final int capacity; //we also make this final because the size of the capacity doesn't change

    // Creating a stack
    Stack(int size) { //input variable (number of slots in the array)
        arr = new int[size]; //create an array - we do not have to define the array type (int[] arr) because it is already defined as an attribute below the class (private final int[] arr)
        capacity = size; //initialize capacity - we have to assign the input 'size' variable to a variable name we can use inside the class
        top = -1; //has to do with the push function
    }

    // Add elements into stack
    public void push(int x) throws StackOverflowException { //when we call this method we will input the integer we want to store in the array (e.g. push(5))
        if (isFull()) {
            throw new StackOverflowException("ArrayBasedStack.Stack is full!"); //wrote a class from this and calling this class here
        }

//        System.out.println("Inserting " + x);
        arr[++top] = x; //arr[0], arr[1], etc... we reach the values of the given index in the array
    } //because this function doesn't return us anything, we can call it void

    // Remove element from stack
    public int pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("ArrayBasedStack.Stack is empty!");
        }
        return arr[top--]; //if not empty stack redefined the top element, so the top element isn't deleted, it's just not usable (so we treat it as deleted even though it's still in the array)
    }//top is an index

    public int peek() throws StackUnderflowException { //displays value of top value in the stack
        if(isEmpty()){
            throw new StackUnderflowException("ArrayBasedStack.Stack is empty!");
        }
        return arr[top];
    }

    // Utility function to return the size of the stack
    public int size() {
        return top + 1; //because indexes start at 0, we add 1 to top (the index) to give us the total amount of elements
    }

    // Check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    } //becuase we ask this function to return us something we call it integer

    // Check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1; //because capacity is size (the total number of elements, we subtract one from it to compare it with the top (index) value
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        } //because this function doesn't return us anything, we can call it void
    }

//    public static void main(String[] args) {
//        ArrayBasedStack.Stack stack = new ArrayBasedStack.Stack(5);
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//
//        stack.pop();
//        System.out.println("\nAfter popping out");
//
//        stack.printStack();
//
//    }
}
