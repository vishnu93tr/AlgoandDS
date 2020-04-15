package Graphs.DAG;

import Graphs.TopologicalOrdering.TopologicalOrdering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class AcyclicShortestGraph
{
    public void ShortestPath(List<Vertex> vertexList,Vertex sourceVertex,Vertex targetVertex)
    {
        sourceVertex.setDistance(0);

        TopologicalSort topologicalSort=new TopologicalSort();

        topologicalSort.makeTopologicalOrder(vertexList);

        Stack<Vertex> stack=topologicalSort.getTopologicalOrder();

        for(Vertex vertex:stack)
        {
            for(Edge edge:vertex.getAdjacenciesList())
            {
               Vertex u= edge.getStartVertex();
               Vertex v=edge.getDestinationVertex();

               double newdistance=u.getDistance()+edge.getWeight();

               if(newdistance<v.getDistance()){
                   v.setDistance(newdistance);
                   v.setPredecessor(u);
               }
            }
        }
        if(targetVertex.getDistance()==Double.MAX_VALUE){
            System.out.println("path not found");
        }
        else{
            System.out.println("Target Vertex shortest path"+targetVertex.getDistance());
        }
    }
    public void showShortestPath(Vertex targetVertex)
    {
        List<Vertex> list=new ArrayList<>();

        list.add(targetVertex);

        Vertex current=targetVertex;

        while (current.getPredecessor()!=null)
        {
            current=current.getPredecessor();
            list.add(current);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
