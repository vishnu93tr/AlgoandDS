package Graphs.ArbitradgeDetection;

public class Edge
{
    private  double weight;
    private Vertex startVertex;
    private Vertex targetVertex;

    public Edge( Vertex startVertex, Vertex targetVertex,double weight) {
        this.weight = weight;
        this.startVertex = startVertex;
        this.targetVertex = targetVertex;
    }



    public double getWeight() {
        return weight;
    }



    public Vertex getStartVertex() {
        return startVertex;
    }



    public Vertex getTargetVertex() {
        return targetVertex;
    }


}
