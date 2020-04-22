package Graphs.MaximumFlow.FordFulkerson;

import java.util.ArrayList;
import java.util.List;

public class FlowNetwork
{
    private int vertices;
    private int edges;
    private List<List<Edge>> adjacencies;

    public FlowNetwork(int vertices){
        this.vertices=vertices;
        this.edges=0;
        this.adjacencies=new ArrayList<>();

       for(int i=0;i<vertices;i++)
       {
           List<Edge> edge=new ArrayList<>();
           adjacencies.add(edge);
       }
    }

    public int getVertices()
    {
        return vertices;
    }

    public int getEdges()
    {
        return edges;
    }
    public void addEdge(Edge edge){
        Vertex u=edge.getStartVertex();
        Vertex v=edge.getTargetVertex();

        adjacencies.get(u.getId()).add(edge);
        adjacencies.get(v.getId()).add(edge);
        edges++;
    }
    public List<Edge> getadjacencies(Vertex vertex){
        return adjacencies.get(vertex.getId());
    }
}
