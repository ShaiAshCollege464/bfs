import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private boolean visited;
    private List<Vertex> neighbors;

    public Vertex (String name) {
        this.name = name;
        this.neighbors = new ArrayList<>();
    }

    public List<Vertex> getNeighbors() {
        return neighbors;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void addNeighbor (Vertex vertex) {
        this.neighbors.add(vertex);
    }

    public String toString () {
        return this.name;
    }
}




