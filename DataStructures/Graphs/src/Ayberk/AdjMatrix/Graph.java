package Ayberk.AdjMatrix;

public class Graph {
    private final boolean[][] adjMatrix;
    private final int numOfVertices;

    Graph(int numOfVertices){
        this.numOfVertices = numOfVertices;
        this.adjMatrix = new boolean[numOfVertices][numOfVertices];
    }

    public void addEdge(int src, int dest){
        adjMatrix[src][dest] = true; //this line of code allows us to tell the program how to link the vertices (basically telling it true is assigning it 1)
        adjMatrix[dest][src] = true; //because this is an bidirectional graph, you have access to both vertices from both ways (which is why you also give the opposite direction true), if it was mono-directional you would have only one true
    }

    public void removeEdge(int src, int dest){
        adjMatrix[src][dest] = false;
        adjMatrix[dest][src] = false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("   0 1 2 3\n");
        stringBuilder.append("   ‾ ‾ ‾ ‾\n");

        for(int i = 0; i<numOfVertices; i++){
            stringBuilder.append(i).append("| ");
            for(boolean j : adjMatrix[i]){

                /* THIS IS THE SAME AS : stringBuilder.append(j ? 1 : 0).append(" "); (LONGER VERSION)
                if(j == true){
                    stringBuilder.append(1);
                }
                else{
                    stringBuilder.append(0);
                }
                */

                stringBuilder.append(j ? 1 : 0).append(" ");
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
