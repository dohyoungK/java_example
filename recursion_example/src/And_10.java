import java.util.Arrays;

public class And_10 {
    public static void main(String[] args) {

        System.out.println(and(new boolean[]{true, true, false}));
    }

    public static boolean and(boolean[] arr){
        // TODO: 모든 요소를 and 연산 했을 때 값 리턴,
        // head, tail

        if (arr.length == 0) return true;
        if (!arr[0]) return false;

        boolean[] tail = Arrays.copyOfRange(arr, 1, arr.length);

        return and(tail);
    }
}
