package Graphs.BellmanFord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BellmanFord
{
    public List<Edge> edgeList;
    public List<Vertex> vertexList;

    public BellmanFord(List<Edge> edgeList,List<Vertex> vertexList){
        this.edgeList=edgeList;
        this.vertexList=vertexList;
    }
    public void BellmanFord(Vertex sourceVertex)
    {
        sourceVertex.setDistance(0);
        //iterate upto vertex-1 times by using vertex list
        for(int i=0;i<vertexList.size()-1;i++)
        {
            //iterate through the adjacencies list
            for(Edge edge:edgeList)
            {
                //get source vertex
                Vertex u=edge.getStartVertex();

                //get destination vertex

                Vertex v=edge.getTargetVertex();

                //calculate new distance to get better solution
                double new_distance=u.getDistance()+edge.getWeight();
                //if new distance is less than already existing distance in destination then update new distance in destination
                if(new_distance<v.getDistance())
                {
                    v.setDistance(new_distance);
                    v.setPredecessor(u);
                }
            }

        }
        //for vth iteration
        for(Edge edge:edgeList){
            if(edge.getStartVertex().getDistance()!=Double.MAX_VALUE){
                if(hasCycle(edge))
                {
                    System.out.println("There is a negative cycle");
                    return;
                }
            }
        }
    }

    private boolean hasCycle(Edge edge)
    {
        //if start vertex weight plus edge weight is less than destination weight then there is a negative cycle
        return edge.getStartVertex().getDistance()+edge.getWeight()<edge.getTargetVertex().getDistance();
    }
    public void getShortestPath(Vertex destinationVertex)
    {
        if(destinationVertex.getDistance()==Double.MAX_VALUE)
            System.out.println("then there is no path from source to destination");
       Vertex actualvertex=destinationVertex;

        while(actualvertex!=null){
            System.out.print(actualvertex+"-");
            actualvertex=actualvertex.getPredecessor();
        }

    }
}
