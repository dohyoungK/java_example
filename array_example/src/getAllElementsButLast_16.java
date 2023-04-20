import java.util.Arrays;

public class getAllElementsButLast_16 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAllElementsButLast(new int[]{1, 2, 3, 4})));
    }

    public static int[] getAllElementsButLast(int[] arr) {
        // TODO: 입력받은 배열에서 마지막 요소를 제외한 배열 리턴
        if (arr.length == 0)  return new int[]{};

        int[] result = new int[arr.length - 1];
        System.arraycopy(arr, 0, result, 0, arr.length - 1);

        return result;
    }
}
