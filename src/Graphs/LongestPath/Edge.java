package Graphs.LongestPath;

public class Edge
{
    private Vertex startVertex;
    private Vertex targetVertex;
    private int weight;

    public Edge(Vertex startVertex,Vertex targetVertex,int weight){
        this.weight=weight;
        this.startVertex=startVertex;
        this.targetVertex=targetVertex;
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(Vertex startVertex) {
        this.startVertex = startVertex;
    }

    public Vertex getTargetVertex() {
        return targetVertex;
    }

    public void setTargetVertex(Vertex targetVertex) {
        this.targetVertex = targetVertex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
