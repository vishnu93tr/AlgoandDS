package Graphs.DFS;

import java.util.List;
import java.util.Stack;

public class DFS
{
    private Stack<Vertex> stack;

    public DFS(){
        this.stack=new Stack<>();
    }

    public void DFS(List<Vertex> vertexList){
        for(Vertex vertex:vertexList){
            if(!vertex.isVisited()){
                vertex.setVisited(true);
                dfsWithStack(vertex);
            }
        }
    }
    public void DFSRecursive(List<Vertex> vertexList){
        for(Vertex vertex:vertexList){
            if(!vertex.isVisited()){
                vertex.setVisited(true);
                dfsRecursive(vertex);
            }
        }
    }

    private void dfsWithStack(Vertex rootvertex)
    {
        this.stack.push(rootvertex);
        rootvertex.setVisited(true);

        while (!stack.isEmpty()){
            Vertex actualvertex=this.stack.pop();
            System.out.println(actualvertex+" ");
            for(Vertex vertex:actualvertex.getNeighbourList()){
                if(!vertex.isVisited()){
                    vertex.setVisited(true);
                    stack.push(vertex);
                }
            }
        }
    }
    private void dfsRecursive(Vertex rootvertex){
        System.out.print(rootvertex+" ");
        for(Vertex vertex:rootvertex.getNeighbourList()){
            if(!vertex.isVisited()){
                vertex.setVisited(true);
                dfsRecursive(vertex);
            }
        }
    }

}
