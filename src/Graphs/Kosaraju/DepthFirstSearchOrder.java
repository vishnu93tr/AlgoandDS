package Graphs.StronglyConnectedComponents.Kosaraju;

import java.util.Stack;

public class DepthFirstSearchOrder
{
    private Stack<Vertex> stack;

    public DepthFirstSearchOrder(Graph graph)
    {
        this.stack=new Stack<>();

        for(Vertex vertex:graph.getVertexList())
        {
            if(!vertex.isVisited()){
                dfs(vertex);
            }
        }
    }

    private void dfs(Vertex vertex)
    {
        vertex.setVisited(true);

        for(Vertex v:vertex.getAdjacencies())
        {
            if(!v.isVisited()){
                dfs(v);
            }
        }
        stack.push(vertex);
    }
    public Stack<Vertex> getStackReverse(){
        return this.stack;
    }
}
