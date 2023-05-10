import java.util.Arrays;

public class ArrProduct_06 {
    public static void main(String[] args) {

        System.out.println(arrProduct(new int[]{-1,-2,1,3}));
    }

    public static int arrProduct(int[] arr){
        // TODO: 요소들의 곱

        if (arr.length == 0) return 1;

        int head = arr[0];
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);

        return head * arrProduct(tail);
    }
}
