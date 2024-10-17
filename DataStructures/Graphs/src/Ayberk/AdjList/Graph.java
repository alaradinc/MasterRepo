package Ayberk.AdjList;

import java.util.ArrayList;

/* GRAPH
LIST - only stores the information of places you can go to (does not store the information of places you can't go to)
Pros: less memory
Cons: slower access

MATRIX - stores the information of places you cannot go to (more data, more space)
Pros: faster access than list (asymptotic notation - o^1 time)
Cons: memory too much
 */





public class Graph {
    int numOfVertices; // declared a variable for the numOfVertices - attribute
    ArrayList<Integer>[] adjList; //declared an array of list - attribute

    public Graph(int numOfVertices) { //constructor name cannot be different than class name
        this.numOfVertices = numOfVertices;
        this.adjList = new ArrayList[numOfVertices]; //because adjList is an object, we must 'create' it using 'new' etc.

        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjList[src].add(dest); //this matrix stores lists - which is why adjList[src] will output a list - as a result I will 'add' to this list when creating connections
        adjList[dest].add(src);
    }

    public void removeEdge(Integer src, Integer dest) {
        adjList[src].remove(dest); //using the obj remove version allows the computer to be smart and find the integer you are looking for (otherwise it will delete the number in the dest index)
        adjList[dest].remove(src);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("   1 2 3 4\n");
        string.append("   - - - -\n");
        for (int i = 0; i < adjList.length; i++) {
            string.append(i).append("| ");

            for (int j = 0; j < adjList[i].size(); j++) {

                // missing code
            }
            return string.toString(); //we must return the string coming from the 'toString' method of the string(stringbuilder) object to access the values inside
        }

        return string.toString();
    }
}

//  for (int j = 0; j < matrix[i].length; j++) { //we must write matrix.i.length to access the length of the individual 'i' array
//       string.append(matrix[i][j] ? 1 : 0).append(" "); //if we did not place '? 1 : 0', the program would print 'true/false' values

//   string.append('\n'); //we do not use sout (print) because we are still in the string and have to append to it

