package Graphs.MaximumFlow.FordFulkerson;

import java.util.LinkedList;
import java.util.Queue;

public class FordFulkerson
{

    private boolean[] marked; // marked[v.getId()] = true  s -> v in the residual graph
    private Edge[] edgeTo;  // edgeTo[v] = edges in the augmenting path
    private double valueMaxFlow;

    public FordFulkerson(FlowNetwork flowNetwork, Vertex s, Vertex t) {

        while( hasAugmeningPath(flowNetwork, s, t) ) {

            double minValue = Double.POSITIVE_INFINITY;

            for(Vertex v=t; v != s; v = edgeTo[v.getId()].getOtherVertex(v)) {
                minValue = Math.min(minValue, edgeTo[v.getId()].getResidualCapacity(v));
            }

            for(Vertex v = t; v !=s; v=edgeTo[v.getId()].getOtherVertex(v)){
                edgeTo[v.getId()].addResidualFlowTo(v, minValue);
            }

            valueMaxFlow = valueMaxFlow + minValue;
        }
    }

    public boolean isInCut(int index) {
        return marked[index];
    }

    public double getMaxFlow() {
        return this.valueMaxFlow;
    }

    private boolean hasAugmeningPath(FlowNetwork flowNetwork, Vertex s, Vertex t) {

        edgeTo = new Edge[flowNetwork.getVertices()];
        marked = new boolean[flowNetwork.getVertices()];

        Queue<Vertex> queue = new LinkedList<>();
        queue.add(s);
        marked[s.getId()] = true;

        while( !queue.isEmpty() && !marked[t.getId()]){

            Vertex v = queue.remove();

            for(Edge e : flowNetwork.getadjacencies(v)) {
                Vertex w = e.getOtherVertex(v);

                if( e.getResidualCapacity(w) > 0){
                    if( !marked[w.getId()]){
                        edgeTo[w.getId()] = e;
                        marked[w.getId()] = true;
                        queue.add(w);
                    }
                }
            }

        }

        return marked[t.getId()];
    }

}
