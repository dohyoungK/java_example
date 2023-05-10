import java.util.Arrays;

public class Drop_08 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(drop(3, new int[]{1,2,3,4})));
    }

    public static int[] drop(int num, int[] arr){
        // TODO: num개의 배열 요소 자르기

        if (num >= arr.length) return new int[]{};
        if (num == 0) return arr;

        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);

        return drop(num - 1, tail);
    }
}
