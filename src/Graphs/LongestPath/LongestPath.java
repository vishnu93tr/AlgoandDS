package Graphs.LongestPath;

import java.util.List;

public class LongestPath
{
    public List<Edge> edgeList;
    public List<Vertex> vertexList;

    public LongestPath(List<Edge> edgeList,List<Vertex> vertexList)
    {
        this.edgeList=edgeList;
        this.vertexList=vertexList;
    }
    public void BellmanFord(Vertex sourceVertex,Vertex destinationVertex)
    {
        sourceVertex.setDistance(0);

        for(int i=0;i<vertexList.size()-1;i++)
        {
            //iterate through edges
            for(Edge edge:edgeList)
            {
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
        //for Vth iteration
        for(Edge edge:edgeList){
            //check if target vertex is not equal to infinity
            if(edge.getTargetVertex().getDistance()!=Double.MAX_VALUE)
            {
                //check whether target vertex contains a cycle
                if(hasCycle(edge))
                {
                    System.out.println("Negative cycle found");
                    return;
                }
            }
        }
        if(destinationVertex.getDistance()!=Double.MAX_VALUE)
        {
            Vertex actual_vertex=destinationVertex;
            System.out.println("The cost from source to destination is"+destinationVertex.getDistance());
            while (actual_vertex.getPredecessor()!=null){
                System.out.print(actual_vertex+"-");
                actual_vertex=actual_vertex.getPredecessor();
            }
        }
        else{
            System.out.println("There is no path from source to target");
        }

    }


    private boolean hasCycle(Edge edge)
    {
        return edge.getStartVertex().getDistance()+edge.getWeight()<edge.getTargetVertex().getDistance();
    }
}
