import java.util.ArrayList;
import java.util.List;

public class Vertex {
    String name;
    List<Edge> adj;
    boolean counted;

    public Vertex(String name) {
        this.name = name;
        this.adj = new ArrayList<Edge>();
        this.counted = false;
    }

    public void addAdj(Edge x) {
        adj.add(x);
    }

    public List<Edge> getAdj() {
        return adj;
    }

    public List<Vertex> getConnections() {
        List<Vertex> connectedWith = new ArrayList<>();
        for (Edge x : this.adj) {
            connectedWith.add(x.destiny);
        }

        return connectedWith;
    }


}
