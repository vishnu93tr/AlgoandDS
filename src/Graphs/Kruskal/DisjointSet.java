package Graphs.Kruskal;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet
{
   private int nodeCount=0;
   private int setCount=0;
   private List<Node> rootNodes;
   //Disjoint sets find ,union as its operations
    public DisjointSet(List<Vertex> vertices)
    {
        this.rootNodes=new ArrayList<>(vertices.size());
        makeSets(vertices);
    }

    private void makeSets(List<Vertex> vertices)
    {
        for(Vertex vertex:vertices)
            makeSet(vertex);
    }
    public int find(Node node)
    {
        //get node upto root
        Node current=node;
        while (current.getParent()!=null){
            current=current.getParent();
        }
        Node root=current;
        current=node;

        //tree flattening
        while (current!=root){
            Node temp=current.getParent();
            current.setParent(root);
            current=temp;
        }
        return root.getId();
    }
    public void union(Node node1,Node node2)
    {
        //get the indexes of two nodes
        int index1=find(node1);
        int index2=find(node2);

        if(index1==index2) return;

       Node root1= this.rootNodes.get(index1);
       Node root2=this.rootNodes.get(index2);

       if(root1.getRank()>root2.getRank()){
           root2.setParent(root1);
       }
       else if(root1.getRank()<root2.getRank()){
           root1.setParent(root2);
       }
       else{
           root2.setParent(root1);
           root1.setRank(root1.getRank()+1);
       }
        this.setCount--;

    }
    private void makeSet(Vertex vertex)
    {
        //create a node
        Node node=new Node(0,rootNodes.size(),null);
        //set node to vertex as each vertex is virtual implementation of node
        vertex.setNode(node);
        //add this node to rootNodes
        this.rootNodes.add(node);
        //increase node count to one
        this.nodeCount++;
        //increse set count
        this.setCount++;
    }
}
