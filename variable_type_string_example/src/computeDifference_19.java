public class computeDifference_19 {
    public static String computeDifference(int num1, int num2) {
        // TODO: 절대값을 사용해서 두 수 빼기
        String result;
        int num3;
        num3 = Math.abs(num1 - num2);
        result = String.format("%d, %d의 차이는 %d입니다.", num1, num2, num3);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(computeDifference(3, 7));
    }
}
