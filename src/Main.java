public class Main {
    public static void main(String[] args) {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");

        a.addNeighbor(b);
        a.addNeighbor(f);
        a.addNeighbor(g);
        b.addNeighbor(a);
        b.addNeighbor(c);
        b.addNeighbor(d);
        c.addNeighbor(b);
        d.addNeighbor(b);
        d.addNeighbor(e);
        e.addNeighbor(d);
        f.addNeighbor(a);
        g.addNeighbor(a);
        g.addNeighbor(h);
        h.addNeighbor(g);

        BFS breadthFirstSearch = new BFS();
        breadthFirstSearch.run(a);
    }
}
