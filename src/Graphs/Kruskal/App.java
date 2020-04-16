package Graphs.Kruskal;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        List<Vertex> vertexList = new ArrayList<>();
        vertexList.add(new Vertex("A"));
        vertexList.add(new Vertex("B"));
        vertexList.add(new Vertex("C"));

        List<Edge> edgeList = new ArrayList<>();
        edgeList.add(new Edge(vertexList.get(0), vertexList.get(1), 1));
        edgeList.add(new Edge(vertexList.get(0), vertexList.get(2), 10));
        edgeList.add(new Edge(vertexList.get(1), vertexList.get(2), 3));

        Kruskal kruskalAlgorithm = new Kruskal();
        kruskalAlgorithm.Kruskal(vertexList, edgeList);


    }
}
