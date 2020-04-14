package Graphs.DFS;

import java.util.ArrayList;
import java.util.List;

public class Application
{
    public static void main(String[] args) {
        Vertex v1=new Vertex("1");
        Vertex v2=new Vertex("2");
        Vertex v3=new Vertex("3");
        Vertex v4=new Vertex("4");
        Vertex v5=new Vertex("5");

        v1.addNeighbourList(v2);
        v1.addNeighbourList(v3);
        v3.addNeighbourList(v4);
        v4.addNeighbourList(v5);

        List<Vertex> list=new ArrayList<>();

        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);
        list.add(v5);

        DFS dfs=new DFS();
        dfs.DFS(list);

    }
}
