package Graphs.BFS;

public class Application
{
    public static void main(String[] args) {
        BFS bfs=new BFS();
        Vertex vertex1=new Vertex(1);
        Vertex vertex2=new Vertex(2);
        Vertex vertex3=new Vertex(3);
        Vertex vertex4=new Vertex(4);
        Vertex vertex5=new Vertex(5);

        vertex1.addNeighbourList(vertex2);
        vertex1.addNeighbourList(vertex3);
        vertex2.addNeighbourList(vertex4);
        vertex1.addNeighbourList(vertex5);

        bfs.BFS(vertex1);
    }
}
