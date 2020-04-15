package Graphs.DAG;

public class Edge
{
    private Vertex startVertex;
    private Vertex destinationVertex;
    private double weight;

    public Edge(double weight,Vertex startVertex, Vertex destinationVertex)
    {
        this.startVertex = startVertex;
        this.destinationVertex = destinationVertex;
        this.weight = weight;
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(Vertex startVertex) {
        this.startVertex = startVertex;
    }

    public Vertex getDestinationVertex() {
        return destinationVertex;
    }

    public void setDestinationVertex(Vertex destinationVertex) {
        this.destinationVertex = destinationVertex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
