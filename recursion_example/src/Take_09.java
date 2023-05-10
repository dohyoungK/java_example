import java.util.Arrays;

public class Take_09 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(take(3, new int[]{1,2,3,4})));
    }

    public static int[] take(int num, int[] arr){
        // TODO: num개의 요소만 포함하는 배열 리턴
        // 잘라야되는 개수 : (arr.length - num == 0) return arr
        // return take(num - 1, copy(arr, 0, length-1))

        // take(1, new int[]{1, -2, 1, 3});
        // 1번째 take: num = 1, head = {1,-2,1}
        // 2번째 take: num = 1, head = {1,-2}

        if (num >= arr.length) return arr;
        if (arr.length == num) return arr;

        int[] head = Arrays.copyOfRange(arr, 0, arr.length - 1);

        return take(num, head);
    }
}
