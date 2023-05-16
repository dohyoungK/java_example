import java.util.*;

public class CreateAdjacencyMatrix_10 {
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(createMatrix(new int[][]{
                {0, 3, 0},
                {0, 2, 0},
                {1, 3, 0},
                {2, 1, 0},
        })));
    }

    public static int[][] createMatrix(int[][] edges) {
        // TODO: 방향이 있고, 없는 간선들 목록을 입력받아 2차원 배열의 인접행렬 리턴
        int maxEdge = 0;
        for (int[] edge : edges) maxEdge = Math.max(maxEdge, Arrays.stream(edge).max().getAsInt());

        int[][] result = new int[maxEdge + 1][maxEdge + 1];
        for(int[] edge: edges) {
            result[edge[0]][edge[1]] = 1;
            if (edge[2] == 1) result[edge[1]][edge[0]] = 1;
        }

        return result;
    }
}
