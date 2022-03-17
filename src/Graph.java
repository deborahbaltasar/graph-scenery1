import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<Vertex> vertexs;
    List<Edge> edges;

    public Graph() {
        vertexs = new ArrayList<Vertex>();
        edges = new ArrayList<Edge>();
    }

    public Vertex addVextex(String name) {
        Vertex v = new Vertex(name);
        vertexs.add(v);
        return v;
    }

    public Edge addEdge(Vertex origin, Vertex destiny) {
        Edge e = new Edge(origin, destiny);
        origin.addAdj(e);
        edges.add(e);
        return e;
    }

    public String printAdjList() {
        String list = "";
        
        for(Vertex v : vertexs) {
            list += v.name + " -> ";
            for (Edge e : v.adj) {
                Vertex v2 = e.destiny;
                list += v2.name + " -> ";
            }
            list += "-| \n";
        }

        return list;
    }

    public void resetVisited() {
        for(Vertex v : vertexs) {
            v.visited = false;
        }
    }

    public boolean dfsAlgorithm(Vertex node) {
        boolean response = false;
        List<Vertex> connectedWith = node.getConnections();
        node.visited = true;
        for(int i = 0; i<connectedWith.size(); i++) {
            Vertex x = connectedWith.get(i);
            if(x.visited && x != null) response = true;
            if(x != null && !x.visited) dfsAlgorithm(x);
        }

        return response;
    }
}



