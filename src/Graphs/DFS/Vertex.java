package Graphs.DFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex
{
    //string as vertex
    private String name;
    private boolean visited;
    private List<Vertex> neighbourList;

    public Vertex(String name){
        this.name=name;
        this.neighbourList=new ArrayList<>();
    }
    public void addNeighbourList(Vertex vertex){
        this.neighbourList.add(vertex);
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

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
