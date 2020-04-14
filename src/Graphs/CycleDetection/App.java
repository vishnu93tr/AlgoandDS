package Graphs.CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class App
{

    public static void main(String[] args)
    {
        Vertex vertex1=new Vertex("1");
        Vertex vertex2=new Vertex("2");
        Vertex vertex3=new Vertex("3");
        Vertex vertex4=new Vertex("4");
        Vertex vertex5=new Vertex("5");
        Vertex vertex6=new Vertex("6");

        vertex1.addneighbour(vertex2);
        vertex1.addneighbour(vertex3);
        vertex2.addneighbour(vertex3);
        vertex4.addneighbour(vertex1);
        vertex4.addneighbour(vertex5);
        vertex5.addneighbour(vertex6);
        vertex4.addneighbour(vertex1);
        vertex6.addneighbour(vertex4);

        List<Vertex> list=new ArrayList<>();
        list.add(vertex1);
        list.add(vertex2);
        list.add(vertex3);
        list.add(vertex4);
        list.add(vertex5);
        list.add(vertex6);

        CycleDetection cycleDetection=new CycleDetection();
        cycleDetection.detectCycle(list);


    }
}
