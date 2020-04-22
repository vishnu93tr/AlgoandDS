package Graphs.StronglyConnectedComponents.Kosaraju;

public class Algorithm
{
   private int[] id;//id for each node in scc
   private boolean[] marked;
   private int count;

   public Algorithm(Graph graph)
   {
       DepthFirstSearchOrder depthFirstSearchOrder=new DepthFirstSearchOrder(graph.getTransposedGraph());

       id=new int[graph.getVertexList().size()];
       marked=new boolean[graph.getVertexList().size()];

       for(Vertex vertex:depthFirstSearchOrder.getStackReverse())
       {
           if(!marked[vertex.getId()])
           {
               dfs(vertex);
               count++;
           }
       }
   }

    private void dfs(Vertex vertex)
    {
        marked[vertex.getId()]=true;
        id[vertex.getId()]=count;
        vertex.setComponentid(count);
        for(Vertex v:vertex.getAdjacencies())
        {
            if(!marked[v.getId()])
            {
                dfs(v);
            }
        }
    }
    public int count()
    {
       return this.count;
    }
}
