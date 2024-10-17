package Exercises;

import NodeBasedStack.Stack;
import NodeBasedStack.StackUnderflowException;

//to import Stack class from another package, the Stack class has to be public
//to access the class attributes/methods from another package, the attributes/methods must be public
//to easily import the class you are using, you may simply write it in the current class and press enter

public class MinStack {

    Stack mainStack = new Stack(); //must create the mainStack that will hold all inputs
    Stack minStack = new Stack(); //this will be the stack that only holds min inputs

    //we are defining 'when and how' to push in a min class
    public void add(int data) throws StackUnderflowException { //we do not get the input here - we get it in Main - since here we only define the rules that this class will carry out to find the min
        mainStack.push(data); // tell the program to push/include all inputs into the mainStack

        if(minStack.isEmpty()){ //tell the program to put the data input into the minStack if it is empty (aka the first input)
            minStack.push(data);
        }
        else if(data < minStack.peek()) { //here we first check the value of the minStack top, if the input is smaller, then we push it into the minStack
            minStack.push(data);
        }
    }

    //we are defining 'when and how' to pop in a min class

    public void delete() throws StackUnderflowException { //we label this method as void instead of int because here we are simply giving the instructions to the system (aka blueprint)
        if(mainStack.pop() == minStack.peek()){ //we do not have to separately write the mainStack.pop function, we can o it simultaneously in the if statement
            minStack.pop(); // the .pop() function not only deletes the top value, but also returns it before deleting. therefore, we first check if the values are the same
            //if the mainStack and minStack values are the same, then we delete both. otherwise, we only delete the mainStack
        }
    }

    public int getMin() throws StackUnderflowException {
        return minStack.peek(); //here we get the exception which was defined in the Stack class (in the other package)
    }
}
