package Graphs.Prims;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        List<Vertex>  vertices=new ArrayList<>();

        Vertex vertex0=new Vertex("A");
        Vertex vertex1=new Vertex("B");
        Vertex vertex2=new Vertex("C");

        vertices.add(vertex0);
        vertices.add(vertex1);
        vertices.add(vertex2);

        vertex1.addEdge(new Edge(vertex1,vertex0,1));
        vertex2.addEdge(new Edge(vertex2,vertex0,10));
        vertex2.addEdge(new Edge(vertex2,vertex1,1));

        Algorithm primsAlgorithm=new Algorithm(vertices);

        primsAlgorithm.Algorithm(vertex2);

        primsAlgorithm.printPath();

    }
}
