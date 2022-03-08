import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public void run (Vertex root) {
        Queue<Vertex> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);
        System.out.println("Visited vertex " + root);
        System.out.println("Queue: " + queue);
        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.remove();
            System.out.println("Dequeued vertex: " + currentVertex);
            for (Vertex neighbor : currentVertex.getNeighbors()) {
                if (!neighbor.isVisited()) {
                    neighbor.setVisited(true);
                    System.out.println("Visited vertex " + neighbor);
                    queue.add(neighbor);
                    System.out.println("Queue: " + queue);
                }
            }
        }
    }
}


