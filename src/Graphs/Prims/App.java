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

        vertex0.addNeighbour(new Edge(vertex0,vertex1,10));
        vertex0.addNeighbour(new Edge(vertex0,vertex2,1));
        vertex0.addNeighbour(new Edge(vertex1,vertex2,1));

        vertex1.addNeighbour(new Edge(vertex1,vertex0,10));
        vertex2.addNeighbour(new Edge(vertex2,vertex0,1));
        vertex2.addNeighbour(new Edge(vertex2,vertex1,1));

        PrimsAlgorithm primsAlgorithm=new PrimsAlgorithm(vertices);

        primsAlgorithm.PrimsAlgorithm(vertex2);

        primsAlgorithm.showMST();
    }
}
