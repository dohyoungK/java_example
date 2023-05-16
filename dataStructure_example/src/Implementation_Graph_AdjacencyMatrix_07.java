import java.util.Arrays;

public class Implementation_Graph_AdjacencyMatrix_07 {
    public static void main(String[] args) {

        Implementation_Graph_AdjacencyMatrix_07 matrix = new Implementation_Graph_AdjacencyMatrix_07();
        matrix.setGraph(3);

        matrix.addEdge(0, 1);
        matrix.addEdge(2, 1);
        matrix.addEdge(1, 2);

        System.out.println(Arrays.deepToString(matrix.getGraph()));
        System.out.println(matrix.hasEdge(0, 1));
        System.out.println(matrix.hasEdge(0, 2));
    }

    private int[][] graph;

    public void setGraph(int size) {
        graph = new int[size][size];

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                graph[i][j] = 0;
            }
        }
    }

    public int[][] getGraph() {
        return graph;
    }

    public void addEdge(int from, int to) {
        if(from >= graph.length || to >= graph.length) return;
        graph[from][to] = 1;
    }

    public boolean hasEdge(int from, int to) {
        if(from >= graph.length || to >= graph.length) return false;
        else if(graph[from][to] == 1) return true;
        else return false;
    }

    public void removeEdge(int from, int to) {
        if(from >= graph.length || to >= graph.length) return;
        graph[from][to] = 0;
    }
}
