import java.util.Arrays;

public class addToBack_11 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(addToBack(new int[]{1,2}, 3)));
    }

    public static int[] addToBack(int[] arr, int el) {
        // TODO: 주어진 요소를 배열 맨 뒤에 추가
        int[] result = Arrays.copyOf(arr, arr.length + 1);
        result[result.length - 1] = el;

        return result;
    }
}
