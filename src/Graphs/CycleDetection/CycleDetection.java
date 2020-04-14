package Graphs.CycleDetection;

import java.util.List;

public class CycleDetection
{
    public void detectCycle(List<Vertex> list)
    {
        for(Vertex vertex:list){
            if(!vertex.isVisited()){
                dfs(vertex);
            }
        }
    }

    private void dfs(Vertex vertex)
    {
        vertex.setBeingvisited(true);
        vertex.setVisited(false);
        for(Vertex v:vertex.getAdjacenciesList()){
            if(v.isBeingvisited()){
                System.out.println("There is a cycle in graph!!!");
                return;
            }
            if(!v.isVisited()){
                v.setVisited(true);
                dfs(v);
            }
        }
        vertex.setBeingvisited(false);
        vertex.setVisited(true);
    }
}
