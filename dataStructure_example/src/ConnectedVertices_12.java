import java.util.*;

public class ConnectedVertices_12 {
    public static void main(String[] args) {
        System.out.println(connectedVertices(new int[][]{
                {0, 1},
                {2, 3},
                {3, 4},
                {3, 5},
        }));
    }

    public static int connectedVertices(int[][] edges) {
        // TODO: dfs 사용해 그래프에 몇개의 길이 있는지 리턴 {{0,1}, {2,3}, {4,5}}
        // 입력받은 선들 사용해서 인접행렬로 그래프 그리기

        int maxVertice = 0;
        for (int[] edge : edges) maxVertice = Math.max(maxVertice, Arrays.stream(edge).max().getAsInt());

        int[][] graph = new int[maxVertice + 1][maxVertice + 1];
        for (int i = 0; i < edges.length; i++) {
            graph[edges[i][0]][edges[i][1]] = 1;
            graph[edges[i][1]][edges[i][0]] = 1;
        }

        boolean[] visited = new boolean[maxVertice + 1];
        int count = 0;
        for (int i = 0; i < maxVertice + 1; i++) {
            ArrayList<Integer> result = new ArrayList<>();
            result = dfs(graph, visited, i, result);
            if (!result.isEmpty()) count += 1;
        }

        return count;
    }

    public static ArrayList<Integer> dfs(int[][] graph, boolean[] visited, int node, ArrayList<Integer> result) {
        if (visited[node]) return result;

        visited[node] = true;
        result.add(node);
        for (int i = 0; i < graph[node].length; i++) {
            if (graph[node][i] == 1) result = dfs(graph, visited, i, result);
        }

        return result;
    }
}
