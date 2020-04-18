package Graphs.Dijkstra;

import java.util.*;

public class Dijkstra
{
   public List<Vertex> ComputePath(Vertex sourceVertex,Vertex destination_vertex)
   {
       sourceVertex.setDistance(0);

       PriorityQueue<Vertex> priorityQueue=new PriorityQueue<>();

       priorityQueue.add(sourceVertex);

       while(!priorityQueue.isEmpty())
       {
           Vertex u=priorityQueue.poll();

           //get neighbours of source

           for(Edge edge:u.getAdjacenciesList())
           {
               //get target vertex
               Vertex v=edge.getDestinationvertex();

               //calculate new weights
               double new_distance=u.getDistance()+edge.getWeight();

               //compare new weight with already existing weight

               if(new_distance<v.getDistance()){

                   //update new distance
                   v.setDistance(new_distance);
                   //update predecessor
                   v.setPredecessor(u);
                   //add vertex to priority queue
                   priorityQueue.add(v);

               }

           }
       }
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
