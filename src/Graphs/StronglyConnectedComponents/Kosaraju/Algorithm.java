package Graphs.StronglyConnectedComponents.Kosaraju;

public class Algorithm
{
    private int[] id;             // id[v] = id of strong component containing v
    private int count;            // number of strongly-connected components
    private boolean[] marked;

    public Algorithm(Graph G) {

        DepthFirstSearchOrder dfs = new DepthFirstSearchOrder(G.getTransposedGraph());

        marked = new boolean[G.getVertexList().size()];
        id = new int[G.getVertexList().size()];

        for (Vertex vertex : dfs.getReversePost()) {
            if (!marked[vertex.getId()]) {
                dfs(vertex);
                count++;
            }
        }
    }

    private void dfs(Vertex vertex) {
        marked[vertex.getId()] = true;
        id[vertex.getId()] = count;
        vertex.setComponentid(count);
        for (Vertex v : vertex.getAdjacencies()) {
            if (!marked[v.getId()])
                dfs(v);
        }
    }

    public int count() { return count; }

}
