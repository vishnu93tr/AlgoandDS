package Graphs.Kruskal;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet
{
    private int nodeCount=0;
    private int setCount=0;
    private List<Node> rootNodes;//representatives

    public DisjointSet(List<Vertex> vertices)
    {
        this.rootNodes=new ArrayList<>(vertices.size());
        makeSets(vertices);
    }

    //find operation in disjoint sets
    public int find(Node n)
    {
        Node current = n;

        /* Ride the pointer up to the root node */
        while (current.getParent() != null)
            current = current.getParent();

        Node root = current;

        /*
         * Ride the pointer up to the root node again, but make each node below
         * a direct child of the root. This alters the tree such that future
         * calls will reach the root more quickly. "path comression"
         */
        current = n;
        while (current != root) {
            Node temp = current.getParent();
            current.setParent( root );
            current = temp;
        }

        return root.getId();

    }
    public void union(Node node1,Node node2)
    {
        int index1=find(node1);
        int index2=find(node2);

        if(index1==index2){
            //then both indexes present in same set
            return;
        }
        Node root1=this.rootNodes.get(index1);
        Node root2=this.rootNodes.get(index2);

        if(root1.getRank()<root2.getRank()){
            root1.setParent(root1);
        }
        else if(root1.getRank()>root2.getRank()){
            root2.setParent(root1);
        }
        else {
            root2.setParent(root1);
            root1.setRank(root1.getRank()+1);
        }
        this.setCount--;
    }

    private void makeSets(List<Vertex> vertices)
    {
        for(Vertex v:vertices){
            makeSet(v);
        }
    }

    private void makeSet(Vertex vertex)
    {
        Node node=new Node(0,rootNodes.size(),null);
        vertex.setNode(node);
        this.rootNodes.add(node);
        this.nodeCount++;
        this.setCount++;
    }
}
