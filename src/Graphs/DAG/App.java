package Graphs.DAG;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        Vertex vertex0=new Vertex("A");
        Vertex vertex1=new Vertex("B");
        Vertex vertex2=new Vertex("C");

        List<Vertex> vertexList=new ArrayList<>();

        vertexList.add(vertex0);
        vertexList.add(vertex1);
        vertexList.add(vertex2);

        vertex0.addAdjacencies(new Edge(1,vertex0,vertex1));
        vertex0.addAdjacencies(new Edge(10,vertex0,vertex2));
        vertex0.addAdjacencies(new Edge(1,vertex1,vertex2));

        AcyclicShortestGraph acyclicShortestGraph=new AcyclicShortestGraph();

        acyclicShortestGraph.ShortestPath(vertexList,vertex0,vertex2);

        acyclicShortestGraph.showShortestPath(vertex2);
    }
}
