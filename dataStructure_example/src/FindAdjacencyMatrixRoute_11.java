import java.util.*;

public class FindAdjacencyMatrixRoute_11 {
    public static void main(String[] args) {
        System.out.println(getDirections(new int[][]
                        {
                                {0, 1, 0, 0},
                                {0, 0, 1, 0},
                                {0, 0, 0, 1},
                                {0, 1, 0, 0}
                        },
                0,
                2
        ));
    }

    public static boolean getDirections(int[][] matrix, int from, int to) {
        // TODO: 인접행렬을 통해 from에서 to로 가는 길이 존재하는지 리턴
        if (from == to) return true;

        int[][] currentMatrix = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            currentMatrix[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }

        for (int i = 0; i < currentMatrix[from].length; i++) {
            if (currentMatrix[from][i] == 1) {
                currentMatrix[from][i] = 0;
                if (getDirections(currentMatrix, i, to)) return true;
            }
        }

        return false;
    }
}
