import java.util.Arrays;

public class getElementsAfter_13 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getElementsAfter(new int[]{1,3,5,7,9}, 2)));
    }

    public static int[] getElementsAfter(int[] arr, int n) {
        // TODO: 인덱스 이후의 배열만 리턴
        if (arr.length == 0)    return new int[]{};
        if (n >= arr.length)    return new int[]{};

        int[] result = new int[arr.length - n];
        System.arraycopy(arr, n, result, 0, arr.length - n);

        return result;
    }
}
