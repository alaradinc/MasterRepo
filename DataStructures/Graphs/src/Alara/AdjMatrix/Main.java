package Alara.AdjMatrix;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);


        System.out.println(graph);
    }
}
