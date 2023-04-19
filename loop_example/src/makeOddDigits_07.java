public class makeOddDigits_07 {
    public static void main(String[] args) {
        System.out.println(makeOddDigits(5));
    }

    public static String makeOddDigits(int num) {
        // TODO: 1부터 입력받은 수 개의 홀수로 구성된 문자열 리턴
        String result = "";

        int odd = 1;
        while (num > 0) {
            result += odd;
            odd += 2;
            num--;
        }

        return result;
    }
}
