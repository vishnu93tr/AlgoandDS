package Graphs.ArbitradgeDetection;

import java.util.ArrayList;
import java.util.List;

public class ArbitradgeDetection
{
    public List<Vertex>  vertexList;
    public List<Edge> edgeList;
    public List<Vertex> cycleList;

    //create a constructor

    public ArbitradgeDetection(List<Vertex>  vertexList,List<Edge> edgeList)
    {
        this.vertexList=vertexList;
        this.edgeList=edgeList;
        this.cycleList=new ArrayList<>();
    }
    public void BellmanFord(Vertex sourceVertex)
    {
        sourceVertex.setDistance(0);

        //iterate upto v-1 times using vertex list

        for(int i=0;i<vertexList.size()-1;i++)
        {
            for(Edge edge:edgeList){
                //get source vertex
                Vertex u=edge.getStartVertex();

                //get destination vertex

                Vertex v=edge.getTargetVertex();

                //find new distance

                double newdistance=u.getDistance()+edge.getWeight();

                if(newdistance<v.getDistance())
                {
                    v.setDistance(newdistance);
                    v.setPredecessor(u);
                }
            }
        }
        //get to the vth iteration to see any cycles
        for(Edge edge:edgeList)
        {
            //check whether target vertex is not equal to infinity
            if(edge.getTargetVertex().getDistance()!=Double.MAX_VALUE)
            {
                if(hasCycle(edge))
                {
                    Vertex startvertex=edge.getStartVertex();
                    //add arbitradge opportunities to cycle array list
                    while(!startvertex.equals(edge.getTargetVertex()))
                    {
                        this.cycleList.add(startvertex);
                        startvertex=startvertex.getPredecessor();
                    }
                    this.cycleList.add(edge.getTargetVertex());
                    return;
                }
            }
        }
    }

    public void printCycle()
    {
        if(this.cycleList!=null){
            //loop through cycle list to get cycle
            for(Vertex vertex:this.cycleList){
                System.out.print(vertex+"-");
            }
        }
    }

    private boolean hasCycle(Edge edge)
    {
        return edge.getStartVertex().getDistance()+edge.getWeight()<edge.getTargetVertex().getDistance();
    }
}
