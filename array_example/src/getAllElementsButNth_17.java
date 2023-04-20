import java.util.Arrays;

public class getAllElementsButNth_17 {
    public static void main(String[] args) {

        getAllElementsButNth(new int[]{3,2,1},1);
    }

    public static int[] getAllElementsButNth(int[] arr, int n) {
        // TODO: 입력받은 인덱스의 배열 요소를 제외한 배열을 리턴
        if (arr.length == 0)  return new int[]{};
        if (n >= arr.length)  return arr;

        int[] result = new int[arr.length - 1];
        int i = 0;
        for (int num : arr) {
            System.out.println(i);
            System.out.println(num);
            if (i != n) result[i++] = num;
        }

        return result;
    }
}
