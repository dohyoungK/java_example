import java.util.Arrays;

public class getElementsUpTo_14 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getElementsUpTo(new int[]{1,3,5,7}, 2)));
    }

    public static int[] getElementsUpTo(int[] arr, int n) {
        // TODO: 인덱스 이전의 배열을 리턴
        if (arr.length == 0)    return new int[]{};
        if (n >= arr.length)    return new int[]{};

        int[] result = Arrays.copyOf(arr, n);

        return result;
    }
}
