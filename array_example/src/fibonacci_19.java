import java.util.Arrays;

public class fibonacci_19 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacci(5)));
    }

    public static int[] fibonacci(int num) {
        // TODO: num + 1개 피보나치 리턴
        int[] result = new int[num + 1];
        result[0] = 0;
        if (num == 0) return result;
        result[1] = 1;

        for (int i = 2; i <= num; i++) result[i] = result[i - 2] + result[i - 1];

        return result;
    }
}
