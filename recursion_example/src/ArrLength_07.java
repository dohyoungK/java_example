import java.util.Arrays;

public class ArrLength_07 {
    public static void main(String[] args) {

        System.out.println(arrLength(new int[]{1,2,3,4}));
    }

    public static int arrLength(int[] arr){
        // TODO: 배열의 길이를 리턴
        if (arr.length == 0) return 0;

        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);
        return 1 + arrLength(tail);
    }
}
