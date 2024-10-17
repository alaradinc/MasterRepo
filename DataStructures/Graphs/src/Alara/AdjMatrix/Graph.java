package Alara.AdjMatrix;

public class Graph {
    int numOfVertices; //total number of connection points in the entire graph (e.g., 5)
    boolean[][] matrix; //creating a matrix of Boolean type that will store ones and zeros (true and felse for connection points)

    //constructors are a type of method

    Graph(int numOfVertices) { //constructors must have the same name as the class - we are defining the number of Vertices (aka space necessary) in the graph
        this.numOfVertices = numOfVertices;
        this.matrix = new boolean[numOfVertices][numOfVertices]; //we must create the matrix before using it (aka initialize it)
        //just because we are using 'new' doesn't mean we are creating an object, 'new' is used in this case to allocate memory
    }

    void addEdge(int src, int dest) {
        matrix[src][dest] = true; //the 'src' and 'dest' numbers we are inputting have to be placed in the matrix, which is why we use the matrix attribute
        matrix[dest][src] = true;
    }

    void deleteEdge(int src, int dest) {
        matrix[src][dest] = false;
        matrix[dest][src] = false;
    }

    /*
            1| X X X X X
            2| X X X X X
            3| X X X X X
            3| X X X X X




     */

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("   1 2 3 4\n");
        string.append("   - - - -\n");
        for (int i = 0; i < matrix.length; i++) {
            string.append(i).append("| ");

        }
        return string.toString(); //we must return the string coming from the 'toString' method of the string(stringbuilder) object to access the values inside
    }
}