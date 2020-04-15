package Graphs.DAG;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>
{
    private String name;
    private List<Edge> adjacenciesList;
    private Vertex predecessor;
    private double distance=Double.MAX_VALUE;
    private boolean visited;

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex(String name)
    {
        this.name=name;
        this.adjacenciesList=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getAdjacenciesList() {
        return adjacenciesList;
    }

    public void setAdjacenciesList(List<Edge> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }


    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Vertex otherVertex) {
        return Double.compare(distance,otherVertex.getDistance());
    }
    public void addAdjacencies(Edge edge){
        this.adjacenciesList.add(edge);
    }
}
