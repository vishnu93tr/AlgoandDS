package Graphs.Prims;

public class Edge implements Comparable<Edge>
{
    //we need to implement Comparable interface as we need to get
    // minedge from heap which uses priority queue as underlying data type
    private double weight;
    private Vertex startVertex;
    private Vertex targetVertex;

    public Edge(Vertex startVertex,Vertex targetVertex,double weight){
        this.weight=weight;
        this.startVertex=startVertex;
        this.targetVertex=targetVertex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vertex getStartVertex() {
        return startVertex;
    }



    public Vertex getTargetVertex() {
        return targetVertex;
    }



    @Override
    public int compareTo(Edge o) {
        return Double.compare(this.weight,o.getWeight());
    }
}
