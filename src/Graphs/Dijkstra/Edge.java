package Graphs.Dijkstra;

public class Edge
{
    //edge should contain source vertex,dest vertex,weight
    private Vertex sourcevertex;
    private Vertex destinationvertex;
    private double weight;

    public Edge(Vertex sourcevertex, Vertex destinationvertex, double weight)
    {
        this.sourcevertex = sourcevertex;
        this.destinationvertex = destinationvertex;
        this.weight = weight;
    }

    public Vertex getSourcevertex() {
        return sourcevertex;
    }

    public void setSourcevertex(Vertex sourcevertex) {
        this.sourcevertex = sourcevertex;
    }

    public Vertex getDestinationvertex() {
        return destinationvertex;
    }

    public void setDestinationvertex(Vertex destinationvertex) {
        this.destinationvertex = destinationvertex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
