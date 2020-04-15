package Graphs.BellmanFord;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>
{
    private String name;
    private List<Edge> adjacencies;
    private double distance=Double.MAX_VALUE;
    private Vertex predecessor;

    public Vertex(String name){
        this.name=name;
        this.adjacencies=new ArrayList<>();
    }


    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Vertex othervertex) {
        return Double.compare(distance,othervertex.getDistance());
    }
}
