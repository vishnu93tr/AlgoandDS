package Graphs.Dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra
{
    public void computePaths(Vertex sourceVertex){
        //set source vertex distance to zero
        sourceVertex.setDistance(0);
        PriorityQueue<Vertex> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(sourceVertex);

        while (!priorityQueue.isEmpty())
        {
            //gets the source queue
            Vertex actual_vertex=priorityQueue.poll();

            for(Edge edge:actual_vertex.getAdjacenciesList())
            {
                Vertex v=edge.getDestinationvertex();

                double new_distance=actual_vertex.getDistance()+edge.getWeight();

                if(new_distance<v.getDistance()){
                    priorityQueue.remove(v);
                    v.setDistance(new_distance);
                    v.setPredecessor(actual_vertex);
                    priorityQueue.add(v);
                }
            }
        }
    }
    public List<Vertex> getShortestPath(Vertex destinationVertex)
    {
        List<Vertex> shortestpathtotarget=new ArrayList<>();

        for(Vertex vertex=destinationVertex;vertex!=null;vertex=vertex.getPredecessor())
        {
            shortestpathtotarget.add(vertex);
        }
        Collections.sort(shortestpathtotarget);

        return shortestpathtotarget;
    }
}
