package Graphs.Dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra
{
   public void ComputePath(Vertex sourceVertex)
   {
       sourceVertex.setDistance(0);

       PriorityQueue<Vertex> priorityQueue=new PriorityQueue<>();

       priorityQueue.add(sourceVertex);

       while(!priorityQueue.isEmpty())
       {
           Vertex vertex=priorityQueue.poll();

           //get neighbours of source

           for(Edge edge:vertex.getAdjacenciesList())
           {
               //get target vertex
               Vertex v=edge.getDestinationvertex();

               //calculate new weights
               double new_distance=vertex.getDistance()+edge.getWeight();

               //compare new weight with already existing weight

               if(new_distance<v.getDistance()){
                   //remove old vertex from priority queue
                   priorityQueue.remove(v);
                   //update new distance
                   v.setDistance(new_distance);
                   //update predecessor
                   v.setPredecessor(vertex);
                   //add same vertex with new weight
                   priorityQueue.add(v);

               }

           }
       }
   }

   public List<Vertex> getShortestPath(Vertex destination_vertex)
   {
       //create a new list to return
       List<Vertex> shortestpathlist=new ArrayList<>();

       //track backwards from destination to source using precedessor

       for(Vertex vertex=destination_vertex;vertex!=null;vertex=vertex.getPredecessor())
       {
           shortestpathlist.add(vertex);
       }
       //sort list as its is tracked backwards
       Collections.sort(shortestpathlist);

       return shortestpathlist;
   }
}
