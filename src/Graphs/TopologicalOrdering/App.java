package Graphs.TopologicalOrdering;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App
{
    public static void main(String[] args)
    {
        TopologicalOrdering topologicalOrdering=new TopologicalOrdering();

        List<Vertex> graph=new ArrayList<>();

        graph.add(new Vertex("0"));
        graph.add(new Vertex("1"));
        graph.add(new Vertex("2"));
        graph.add(new Vertex("3"));
        graph.add(new Vertex("4"));
        graph.add(new Vertex("5"));

        graph.get(2).addNeighbour(graph.get(3));
        graph.get(3).addNeighbour(graph.get(1));
        graph.get(4).addNeighbour(graph.get(0));
        graph.get(4).addNeighbour(graph.get(1));
        graph.get(2).addNeighbour(graph.get(3));
        graph.get(5).addNeighbour(graph.get(0));
        graph.get(5).addNeighbour(graph.get(2));


        for(Vertex ref:graph){
            if(!ref.isVisited()){
                topologicalOrdering.dfs(ref);
            }
        }
        Stack<Vertex> stack=topologicalOrdering.getStack();
        for(Vertex ref:graph){
            ref=stack.pop();
            System.out.print(ref+"->");
        }

    }
}
