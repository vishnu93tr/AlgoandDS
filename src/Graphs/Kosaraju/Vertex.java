package Graphs.StronglyConnectedComponents.Kosaraju;

import java.util.ArrayList;
import java.util.List;

public class Vertex
{
    private String name;//name of vertex
    private int id;//id for vertex
    private int componentid;//component id for scc
    private boolean visited;//check whether vertex is visited or not
    private List<Vertex> adjacencies;

    public Vertex(int id,String name){
        this.id=id;
        this.name=name;
        this.adjacencies=new ArrayList<>();
    }
    public void addNeighbours(Vertex vertex){
        this.adjacencies.add(vertex);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getComponentid() {
        return componentid;
    }

    public void setComponentid(int componentid) {
        this.componentid = componentid;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getAdjacencies() {
        return adjacencies;
    }

    public void setAdjacencies(List<Vertex> adjacencies) {
        this.adjacencies = adjacencies;
    }
}
