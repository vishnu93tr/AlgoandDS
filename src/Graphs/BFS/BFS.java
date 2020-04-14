package Graphs.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS
{
    public void BFS(Vertex root)
    {
        //implement BFS with Queue data type
        Queue<Vertex> queue=new LinkedList<>();
        root.setVisited(true);
        queue.add(root);
        while(!queue.isEmpty())
        {
            Vertex actualvertex=queue.remove();
            System.out.println(actualvertex+"");
            for(Vertex vertex:actualvertex.getNeighbours())
            {
                if(!vertex.isVisited()){
                    vertex.setVisited(true);
                    queue.add(vertex);
                }
            }
        }
    }
}
