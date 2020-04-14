package Graphs.CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex
{
    private String name;
    private boolean visited;
    private boolean beingvisited;
    private List<Vertex> adjacenciesList;
    public Vertex(String name){
        this.name=name;
        this.adjacenciesList=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isBeingvisited() {
        return beingvisited;
    }

    public void setBeingvisited(boolean beingvisited) {
        this.beingvisited = beingvisited;
    }

    public List<Vertex> getAdjacenciesList() {
        return adjacenciesList;
    }

    public void setAdjacenciesList(List<Vertex> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }

    @Override
    public String toString() {
        return this.name;
    }
    public void addneighbour(Vertex vertex){
        this.adjacenciesList.add(vertex);
    }
}
