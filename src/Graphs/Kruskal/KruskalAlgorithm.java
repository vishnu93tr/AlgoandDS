package Graphs.Kruskal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalAlgorithm
{
    public void KruskalAgorithm(List<Edge> edgeList,List<Vertex> vertexList)
    {
        DisjointSet disjointSet=new DisjointSet(vertexList);

        Collections.sort(edgeList);
        List<Edge> mst=new ArrayList<>();
        for(Edge edge:edgeList)
        {
            Vertex u=edge.getStartVertex();

            Vertex v=edge.getTargetVertex();

            if(disjointSet.find(u.getNode())!=disjointSet.find(v.getNode()))
                mst.add(edge);
                disjointSet.union(u.getNode(),v.getNode());

        }
        for(Edge edge:mst) System.out.print(edge.getStartVertex()+""+edge.getTargetVertex()+"-");
    }
}
