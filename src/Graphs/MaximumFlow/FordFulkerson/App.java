package Graphs.MaximumFlow.FordFulkerson;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        FlowNetwork flowNetwork = new FlowNetwork(4);

        Vertex vertex0 = new Vertex(0, "s");
        Vertex vertex1 = new Vertex(1, "A");
        Vertex vertex2 = new Vertex(2, "B");
        Vertex vertex3 = new Vertex(3, "t");

        List<Vertex> vertexList = new ArrayList<>();
        vertexList.add(vertex0);
        vertexList.add(vertex1);
        vertexList.add(vertex2);
        vertexList.add(vertex3);

        flowNetwork.addEdge(new Edge(vertex0, vertex1, 4));
        flowNetwork.addEdge(new Edge(vertex0, vertex2, 5));

        flowNetwork.addEdge(new Edge(vertex1, vertex3, 7));

        flowNetwork.addEdge(new Edge(vertex2, vertex1, 4));
        flowNetwork.addEdge(new Edge(vertex2, vertex3, 1));


        FordFulkerson fordFulkerson = new FordFulkerson(flowNetwork, vertex0, vertex3);

        System.out.println("Maximum flow is: " + fordFulkerson.getMax_flow());



    }
    }

