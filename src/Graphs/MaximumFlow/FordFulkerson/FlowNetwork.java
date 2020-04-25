package Graphs.MaximumFlow.FordFulkerson;

import java.util.ArrayList;
import java.util.List;

public class FlowNetwork
{
    private int vertices;
    private int edges;
    private List<List<Edge>> adjacencies;

    public FlowNetwork(int vertices)
    {
        this.vertices=vertices;
        this.edges=0;
        this.adjacencies=new ArrayList<>();

        //iterate through every vertex and add a edge
        for(int i=0;i<vertices;i++)
        {
            List<Edge> edges=new ArrayList<>();
            adjacencies.add(edges);
        }
    }
    public int getVertices(){
        return vertices;
    }

    public int getEdges() {
        return edges;
    }
    public List<Edge> getadjacencies(Vertex vertex){
        return adjacencies.get(vertex.getId());
    }
    public void addEdge(Edge edge)
    {
        Vertex u=edge.getStartVertex();
        Vertex v=edge.getTargetVertex();

        adjacencies.get(u.getId()).add(edge);
        adjacencies.get(v.getId()).add(edge);
        edges++;
    }
}
