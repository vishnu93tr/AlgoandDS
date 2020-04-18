package Graphs.Prims;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgorithm
{
    //unvisited vertex
    private List<Vertex> unvisitedVertexes;
    //spanning tree is list of edges
    private List<Edge> spanningTree;
    //underlying data structure in prims algorithm is Heap,hence we use priority queue to implement heap
    private PriorityQueue<Edge> edgeHeap;
    private double cost;

    public PrimsAlgorithm(List<Vertex> unvisitedVertexes)
    {
        this.unvisitedVertexes=unvisitedVertexes;
        this.spanningTree=new ArrayList<>();
        this.edgeHeap=new PriorityQueue<>();
    }
    public void PrimsAlgorithm(Vertex vertex)
    {
        Vertex a=vertex;
        this.unvisitedVertexes.remove(a);

        while(!this.unvisitedVertexes.isEmpty())
        {
            for(Edge edge:a.getAdjacencies())
            {
                if(this.unvisitedVertexes.contains(edge.getTargetVertex())){
                    this.edgeHeap.add(edge);
                }
            }

                Edge minedge=edgeHeap.remove();
                this.spanningTree.add(minedge);
                this.cost+=minedge.getWeight();
                a=minedge.getTargetVertex();
                this.unvisitedVertexes.remove(a);

        }
    }
    public void showMST(){
        System.out.println("cost of minimum spanning tree is"+this.cost);
        for(Edge edge:spanningTree)
            System.out.print(edge.getStartVertex()+""+edge.getTargetVertex()+"-");
    }
}
