public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("lISTA DE ADJACÊNCIA");

        Graph graph = new Graph();

        Vertex v1 = graph.addVextex("1");
        Vertex v2 = graph.addVextex("2");
        Vertex v3 = graph.addVextex("3");
        Vertex v4 = graph.addVextex("4");
        Vertex v5 = graph.addVextex("5");
        Vertex v6 = graph.addVextex("6");
        Vertex v7 = graph.addVextex("7");

        graph.addEdge(v1, v2);
        graph.addEdge(v1, v3);
        graph.addEdge(v2, v4);
        graph.addEdge(v2, v5);
        graph.addEdge(v3, v6);
        graph.addEdge(v3, v7);

        System.out.println(graph.printAdjList());

        System.out.println("Grafo é circular? " + graph.dfsAlgorithm(v1));

        System.out.println("---------------------------------------------------------------");
        
        graph.addEdge(v2, v3);


        System.out.println(graph.printAdjList());

        System.out.print("Grafo é circular? " + graph.dfsAlgorithm(v1));
    }
}
