package Graphs.Kruskal;

public class Vertex
{
    private String name;
    //every vertex has virtual node associated with it ,hence Node
    private Node node;

    public Vertex(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}
