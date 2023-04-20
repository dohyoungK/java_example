import java.util.Arrays;

public class getEvenNumbers_09 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getEvenNumbers(new int[]{1,2,3,4})));
    }

    public static int[] getEvenNumbers(int[] arr) {
        // TODO: 배열 요소 중 짝수만을 따로 빼서 배열에 저장
        int[] result;
        int even = 0;

        for (int num : arr) {
            if (num % 2 == 0)   even += 1;
        }
        result = new int[even];

        int i = 0;
        for (int num : arr) {
            if (num % 2 == 0)   result[i++] = num;
        }

        return result;
    }
}
