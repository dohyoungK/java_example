import java.util.Arrays;

public class Or_11 {
    public static void main(String[] args) {

        System.out.println(or(new boolean[]{true, false, true}));
    }

    public static boolean or(boolean[] arr){
        // TODO: 모든 요소를 or 연산 했을 때 값 리턴,
        // 하나라도 true이면 true

        if (arr.length == 0) return false;
        if (arr[0]) return true;

        boolean[] tail = Arrays.copyOfRange(arr, 1, arr.length);

        return or(tail);
    }
}
