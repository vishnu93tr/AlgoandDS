package Graphs.Prims;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Algorithm
{
    private List<Edge> spanningTree;
    private List<Vertex> unvisitedVertexes;
    //we need a edge heap to sort edges and give a minedge
    private PriorityQueue<Edge> edgeHeap;
    private double cost;

    public Algorithm(List<Vertex> unvisitedVertexes){
        this.unvisitedVertexes=unvisitedVertexes;
        this.spanningTree=new ArrayList<>();
        this.edgeHeap=new PriorityQueue<>();
    }
    public void Algorithm(Vertex vertex)
    {
        Vertex a=vertex;
        this.unvisitedVertexes.remove(a);

        while(!this.unvisitedVertexes.isEmpty())
        {
            for(Edge edge:a.getAdjacencies())
            {
                if(this.unvisitedVertexes.contains(edge.getTargetVertex()))
                {
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
    public void printPath()
    {
        System.out.println("The cost of min spaiing tree is"+this.cost);
        for(Edge edge:spanningTree){
            System.out.print(edge.getStartVertex()+""+edge.getTargetVertex()+"-");
        }
    }

}
