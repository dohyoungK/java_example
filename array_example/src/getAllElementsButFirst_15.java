import java.util.Arrays;

public class getAllElementsButFirst_15 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAllElementsButFirst(new int[]{1,2,3,5})));
    }

    public static int[] getAllElementsButFirst(int[] arr) {
        // TODO: 배열의 첫 요소를 제외한 배열 리턴
        if (arr.length == 0)    return new int[]{};

        int[] result = new int[arr.length - 1];
        System.arraycopy(arr, 1, result, 0, result.length);

        return result;
    }
}
