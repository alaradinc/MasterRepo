package Ayberk.AdjMatrix;

public class Graph {
    private final boolean[][] adjMatrix; //attributes - we use '[][]' to define a matrix
    private final int numOfVertices; //attributes -defining

    public Graph(int numOfVertices){ //this is a constructor
        this.numOfVertices = numOfVertices;
        adjMatrix = new boolean[numOfVertices][numOfVertices]; //creation of matrix (initialization - aka 'starting it')
    }

    public void addEdge(int src, int dest){
        adjMatrix[src][dest] = true;
        adjMatrix[dest][src] = true;
    }

    public void removeEdge(int src, int dest){
        adjMatrix[src][dest] = false;
        adjMatrix[dest][src] = false;
    }

    /*
                0 1 2 3
            ------------
            0|  1 0 1 0
            1|
            2|
            3|


         */

    @Override
    public String toString() { //ability to print a 'graph' (which is of object type)
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("   0 1 2 3\n   - - - -");

        for(int i = 0; i<adjMatrix.length; i++){
            stringBuilder.append(i).append("| ");
            for(boolean j : adjMatrix[i]){
                stringBuilder.append(j ? 1 : 0).append(" ");
            }

        }
    }
}






