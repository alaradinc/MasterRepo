import BinarySearchTree.BinarySearchTree;
import LinkedList.LinkedList;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList; //define linkedList (with value null) 0 definition //  LinkedList<Integer> linkedList = new LinkedList<Integer>();
        BinarySearchTree binarySearchTree; //separating these is no different than this format: LinkedList<Integer> linkedList = new LinkedList<Integer>();

        for(int i = 1; i<6; i++){
            linkedList = new LinkedList<Integer>(); //call the constructor, which creates a random object (initialization - assigning a value)
            binarySearchTree = new BinarySearchTree(); //we separate the standard format and place the initialization part in the for loop to create a new linkedlist every for loop

            int numOfElements = (int)Math.pow(10,i); //10^1 10^2 ... etc. using for loops to create multiple arraylists of different sizes
            ArrayList<Integer> data = generate(numOfElements); //created an arraylist called 'data' and we know how many elements to add to it because it is stored in 'numOfElements' variable

            addToLinkedList(data,linkedList); //the same variable name that we created above for linkedlist
            addToBST(data,binarySearchTree); //add the data in the ArrayList into the binary search tree

            deleteFromLinkedList(linkedList,data);
            deleteFromBST(binarySearchTree,data);
            System.out.println();
        }

//        binarySearchTree = new BinarySearchTree();
//        int numOfElements = (int)Math.pow(10,5); //10^1 10^2 ... etc. using for loops to create multiple arraylists of different sizes
//        ArrayList<Integer> data = generate(numOfElements); //c
//        addToBST(data,binarySearchTree); //add the data in the ArrayList into the binary search tree
//        deleteFromBST(binarySearchTree,data);
    }

    private static void deleteFromBST(BinarySearchTree binarySearchTree, ArrayList<Integer> data) { //telling the function that we will be getting a 'binarySearchTree' or Binary Search Tree type (inputs)
        ArrayList<Integer> copyArrayList = new ArrayList<>(data); //creating a new arraylist which will be the duplicate of the original one, so that when we delete the integers we keep copies of them
                     //must use same ArrayList type                         //using 'copy constructor' - <> is blank because of syntax, it is actually the same as <Integer>
        Random rand = new Random();

        long start = System.nanoTime();
        for (int i = 0; i< data.size(); i++){
            int indexOfElement = rand.nextInt(0,copyArrayList.size()); //we're calling Random class' function nextInt to create random integers and assign them to indexOfArray variable - we're using the copy array list to determine size, since the original will have data deleted from it
            Integer valueInsideIndex = copyArrayList.get(indexOfElement); //we store the value of the index so we can later use it to delete it from the binarytree
            copyArrayList.remove(valueInsideIndex); //because we're sending 'int' it will delete the data value inside the int
            binarySearchTree.delete(valueInsideIndex); // delete the stored value (previously deleted from array list) also from the binarySearchTree
        }
        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println("Time passed during deletion of " + data.size() + " items from the BST is: " + elapsedTime/1000000);
    }

    static void deleteFromLinkedList(LinkedList<Integer> linkedList, ArrayList<Integer> dataSet){
        ArrayList<Integer> data = new ArrayList<>(dataSet);

        Random rand = new Random();
        long totalTime = 0;

        for (int i = 0; i< dataSet.size(); i++){
            int index = rand.nextInt(0,data.size()); //creating the same index (duplicates) is not a problem because deleting an element causes the other data to shift and the indexes to change
            Integer numToBeDeleted = data.get(index); //to hold the number we obtain using the get method we must assign it to a variable
            data.remove(numToBeDeleted); //remove the number from the arraylist

            Date datePre = new Date();
            linkedList.delete(numToBeDeleted); //remove from the linkedlist
            Date datePost = new Date();

            totalTime += (datePost.getTime() - datePre.getTime()); // we must use the datePre/Post objects to access the getTime method
        }

        long timePassed = (long)((totalTime / ((double)dataSet.size()) * 100) * 1000);
        System.out.println("Time passed during deletion of " + dataSet.size() + " items from the LL is: " + timePassed);
    }

    static void addToBST(ArrayList<Integer> data,BinarySearchTree binarySearchTree){
        Date sDate = new Date();
        for(int j : data){ //extended for loop 'for each loop'
            binarySearchTree.insert(j); //adding these generated elements in the array into the binary tree
        }
        Date eDate = new Date();

        long passedTime = eDate.getTime()-sDate.getTime();

        System.out.println("Time passed during insertion of " + data.size() + " to the BST is: " + passedTime);
    }

    static void addToLinkedList(ArrayList<Integer> data,LinkedList<Integer> linkedList){
        Date sDate = new Date();
        for(int j : data){
            linkedList.append(j); //adding these generated elements in the array into the linkedlist
        }
        Date eDate = new Date();

        long passedTime = eDate.getTime()-sDate.getTime();

        System.out.println("Time passed during insertion of " + data.size() + " to the LL is: " + passedTime);
    }

    static ArrayList<Integer> generate(int numOfElements){
        Random random = new Random(); //to use non-static methods of the Random class we must generate an object of class type Random (e.g., 'random')
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i<numOfElements; i++){
            result.add(random.nextInt(-numOfElements,numOfElements));
        }

        return result;
    }
}
