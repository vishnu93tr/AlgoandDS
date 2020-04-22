package Graphs.MaximumFlow.FordFulkerson;

public class Edge
{
    private Vertex startVertex;
    private Vertex targetVertex;
    private final double capacity;
    private double flow;

    public Edge(Vertex startVertex,Vertex targetVertex,double capacity){
        this.startVertex=startVertex;
        this.targetVertex=targetVertex;
        this.capacity=capacity;
        this.flow=0.0;
    }


    public Vertex getOtherVertex(Vertex vertex)
    {
        if(vertex==startVertex) return targetVertex;
        else return startVertex;
    }
    public double getResidualCapacity(Vertex vertex){

        if(vertex==startVertex) return flow;
        else return capacity-flow;

    }
    public void addResidualFlowto(Vertex vertex,double dataFlow){
        if(vertex==startVertex) flow=flow-dataFlow;//backward edge
        else flow=flow+dataFlow;//forward edge
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

    public double getCapacity() {
        return capacity;
    }

    public double getFlow() {
        return flow;
    }

    public void setFlow(double flow) {
        this.flow = flow;
    }
}
