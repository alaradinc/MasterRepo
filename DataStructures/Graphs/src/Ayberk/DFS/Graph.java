package Ayberk.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Graph {
    private ArrayList<Integer>[] adjList; //we are defining a variable of ArrayList type that will be holding integers in it
    // we are creating an 'Array' that will be storing elements of 'ArrayList' type - the ArrayList will be storing integers
    // a standard (generic) array would be int[]
    private boolean[] visited; //instead of creating an ArrayList, we create a boolean array as it is faster
    //this is an array that will be holding boolean elements (true/false)

    // each element of the array is an array list that holds all the adjacent (connections) (integers) of the given vertex

    /*

    ARRAYLIST V. ARRAY

    ArrayList is dynamically allocated (can expand) - no fixed size
    Arrays are static in-size and have to be pre-allocated (cannot expand) - fixed size

     */

    Graph(int vertices){
        adjList = new ArrayList[vertices]; //here we initialize the ArrayList (above, we are only defining it)
        //CAUTION! WE ARE CREATING AN ARRAY THAT WILL BE HOLDING ELEMENTS OF ARRAYLIST TYPE

        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>(); // here we place the ArrayList element into the position pointed by 'i'
        } //filling in the empty slots, otherwise we can't allocate

        visited = new boolean[vertices]; //initialize array, defined above

        /* This is the long form version of the Array.fill method

        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }

        */
        Arrays.fill(visited,false); //telling the program to fill in the array with 'false' as the initial value
    }

    void addEdge(int src, int dest){
        // we are accessing the Arraylist stored in the "src" index of the ajdList and adding the "dest" to it.
        adjList[src].add(dest);
    }

    void DFS(int vertex){ //this is a method which will be taking in 'vertex' as a parameter
        visited[vertex] = true; // marking the element stored in the index which is "Vertex" as visited.
        System.out.print(vertex + " ");

        //call the listIterator method of the ArrayList to be able to get the iterator of that ArrayList
        //an iterator is an object, we use it to traverse data collections
        //Iterator<Integer> iter is an object we created to iterate the data
        //iter is the 'current' node, it gets re-defined as we go through the list. whichever node it is on becomes the value of the 'iter' iterator

        // the value of the next node is assigned to 'adj' variable
        for (int adj : adjList[vertex]) { //if iter (aka current node) has a next value - true
            if (!visited[adj]) { //if the value in 'adj' variable has not been visited yet (aka not true in the b'visited' array, then visit
                DFS(adj); //recursive - works as long as the vertex is not visited
            }
        }

        /* THE LONGER (cooler ^^) VERSION OF THE 'FOR EACH LOOP' WE WROTE ABOVE

        Iterator<Integer> iter = adjList[vertex].listIterator();
        while(iter.hasNext()){ //if iter (aka current node) has a next value - true
            int adj = iter.next(); // the value of the next node is assigned to 'adj' variable
            if(!visited[adj]){ //if the value in 'adj' variable has not been visited yet (aka not true in the 'visited' array, then visit
                DFS(adj);
            }
        }

         */
    }

     //WE OPENED A MAIN METHOD WITHIN THE CURRENT CLASS - you cannot write anything outside the class code of the file

     public static void main(String[] args) {
         Graph graph = new Graph(5);
         graph.addEdge(0,1);
         graph.addEdge(0,2);
         graph.addEdge(0,3);
         graph.addEdge(1,2);
         graph.addEdge(2,4);

         graph.DFS(0);
     }
}


















