package Graphs.StronglyConnectedComponents.Kosaraju;

import java.util.ArrayList;
import java.util.List;

public class Graph
{
    private List<Edge> edgeList;
    private List<Vertex> vertexList;

    public Graph(){

    }
    public Graph(List<Edge> edgeList,List<Vertex> vertexList){
        this.edgeList=edgeList;
        this.vertexList=vertexList;
    }

    public List<Edge> getEdgeList() {
        return edgeList;
    }

    public void setEdgeList(List<Edge> edgeList) {
        this.edgeList = edgeList;
    }

    public List<Vertex> getVertexList() {
        return vertexList;
    }

    public void setVertexList(List<Vertex> vertexList) {
        this.vertexList = vertexList;
    }

    public Graph getTransposedGraph()
    {
        Graph graph=new Graph();

        List<Vertex> transposed_vertices=new ArrayList<>();
        for(Vertex vertex:this.vertexList){
            transposed_vertices.add(vertex);
        }
        for(Edge edge:this.edgeList)
        {
            transposed_vertices.get(transposed_vertices.indexOf(edge.getTargetVertex())).addNeighbours(edge.getStartVertex());
        }
        graph.setVertexList(transposed_vertices);
        return graph;
    }
}
