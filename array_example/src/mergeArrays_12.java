import java.util.Arrays;

public class mergeArrays_12 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{1, 2}, new int[]{3, 4})));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // TODO: 두 개의 배열 합치기
        int[] result = Arrays.copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        return result;
    }
}
