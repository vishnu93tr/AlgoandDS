package Graphs.Dijkstra;

import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLService;

public class Application
{
    public static void main(String[] args)
    {
        Vertex vertex0=new Vertex("A");
        Vertex vertex1=new Vertex("B");
        Vertex vertex2=new Vertex("C");

        vertex0.addNeighbourList(new Edge(vertex0,vertex1,1));
        vertex0.addNeighbourList(new Edge(vertex0,vertex2,3));
        vertex1.addNeighbourList(new Edge(vertex1,vertex2,1));

        Dijkstra dijkstra=new Dijkstra();

        System.out.println(dijkstra.ComputePath(vertex0,vertex2));


    }
}
