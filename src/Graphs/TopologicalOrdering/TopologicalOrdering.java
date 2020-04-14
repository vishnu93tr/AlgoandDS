package Graphs.TopologicalOrdering;

import java.util.Stack;

public class TopologicalOrdering
{
    private Stack<Vertex> stack;

    public TopologicalOrdering(){
        this.stack=new Stack<>();
    }
    public void dfs(Vertex vertex){
        vertex.setVisited(true);
        for(Vertex v:vertex.getNeighbours()){
            if(!v.isVisited()){
                dfs(v);
            }
        }
        stack.add(vertex);
    }
    public Stack<Vertex> getStack(){
        return this.stack;
    }
}
