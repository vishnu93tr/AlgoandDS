package Graphs.Prims;

import java.util.ArrayList;
import java.util.List;

public class Vertex
{
    private String name;
    private boolean visited;
    private List<Edge> adjacencies;
    private Vertex predecessor;

    public Vertex(String name){
        this.name=name;
        this.adjacencies=new ArrayList<>();
    }
    public void addNeighbour(Edge edge){
        this.adjacencies.add(edge);
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

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Edge> getAdjacencies() {
        return adjacencies;
    }

    public void setAdjacencies(List<Edge> adjacencies) {
        this.adjacencies = adjacencies;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }
}
