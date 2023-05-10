import java.util.Arrays;

public class ArrSum_05 {
    public static void main(String[] args) {

        System.out.println(arrSum(new int[]{-1,-2,1,3}));
    }

    public static int arrSum(int[] arr){
        //TODO.. 배열의 합

        if (arr.length == 0) return 0;

        int head = arr[0];
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);

        return head + arrSum(tail);
    }
}
