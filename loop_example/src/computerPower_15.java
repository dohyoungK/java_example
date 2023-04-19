public class computerPower_15 {
    public static void main(String[] args) {
        System.out.println(computePower(2, 3));
    }

    public static int computePower(int base, int exponent) {
        // TODO: 지수만큼 밑을 곱하기 반복
        int result = 1;

        for (int i = 1; i <= exponent; i++) result *= base;

        return result;
    }
}
