package Ayberk.BFS;

import java.util.*;

public class BFS {
    /*
            MAP => KEY -> VALUE

            54 -> ALARA
            97 -> AYBERK
    */

    // Map<String, List<String>> adjList; //we are creating an adjacency list (adjacency list holds other lists within it)
    //Tipi map olan, key olarak String, value olarak List of String tutan bir map urettim ben burada
    //We are creating a map that will have 'keys' of String type, which will hold Lists of String type

    /* here - 'Ayberk' is a key of String type, it is pointing to a list that holds String values
            "Ayberk" -> {"Alara", "Ahmet", "Cansu"}
            "X" -> {"Alara", }
            "Y" -> {"Alara", "Ahmet"}
            "Z" -> {"Ahmet", "Cansu", "Cansu", "Cansu", "Cansu"}
    */

    public static void bfs(Map<String,List<String>> adjList, String start){ //method of void type that has parameters of Map and String types
        // HashMap is a concrete class that implements the Map interface
        //We're creating a hashmap of type map that will hold keys of String type and the keys will point to values of Boolean type
        Map<String,Boolean> visited = new HashMap<>(); //initializing the 'visited' list
        Queue<String> queue = new LinkedList<>(); //You are creating a queue object using a LinkedList constructor
        // Queue's cannot be constructed directly because it's an interface (interface is an abstract class) which is why you cannot create an object from it

        visited.put(start,true); //we put our start index in to the 'visited' queue
        queue.add(start); //we put start into queue

        while(!queue.isEmpty()){
            String curr = queue.poll(); //assign the 'removed' head of the queue(list) to a new variable of String type (or storage and use)
            //poll retrieves and removes the head of this queue or returns null if this queue is empty
            System.out.print(curr + " -> ");

            List<String> neighbors = adjList.get(curr); //create a variable of List type that will hold String value called 'neighbors'
            // and 'call' the get() method of the adjList (which is an object of Map class) to be able to retrieve the adjacents of the 'curr' - single variable
            if(neighbors != null){ //if the list is not null (meaning that our 'primary ID' has adjacents, then iterate the list (go through the adjacents)
                for(String neighbor : neighbors){
                    if(!visited.containsKey(neighbor)){ //if we have not yet visited the neighbor then put it into the 'visited list' (since we've now visited it)
                        visited.put(neighbor,true);
                        queue.add(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Map<String,List<String>> adjList = new HashMap<>();
        adjList.put("A",Arrays.asList("B","C"));
        adjList.put("B",Arrays.asList("A","D"));
        adjList.put("C",Arrays.asList("A","D","E"));
        adjList.put("D",Arrays.asList("B","C","E"));
        adjList.put("E",Arrays.asList("C","D"));

        bfs(adjList,"A");
    }


}
