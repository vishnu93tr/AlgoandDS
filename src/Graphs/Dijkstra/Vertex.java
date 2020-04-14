package Graphs.Dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>
{
    //vertex contains name,list of its neighbours,predecessor,distance to calculate paths,COMPARATOR to compare two distances
    private String name;
    private List<Edge> adjacenciesList;
    private Vertex predecessor;
    private double distance=Double.MAX_VALUE;
    private boolean visited;

    public void addNeighbourList(Edge edge){
        this.adjacenciesList.add(edge);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

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
    public int compareTo(Vertex otherVertex) {
        return Double.compare(distance,otherVertex.getDistance());
    }

    @Override
    public String toString() {
        return this.name;
    }
}
