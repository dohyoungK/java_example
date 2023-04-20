import java.util.Arrays;

public class addToFront_10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(addToFront(new int[]{1, 2}, 3)));
    }

    public static int[] addToFront(int[] arr, int el) {
        // TODO: 입력받은 요소를 배열 맨 앞에 추가
        int[] result = new int[arr.length + 1];
        result[0] = el;
        System.arraycopy(arr, 0, result, 1, arr.length);

        return result;
    }
}
