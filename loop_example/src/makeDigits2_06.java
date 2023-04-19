public class makeDigits2_06 {
    public static void main(String[] args) {
        System.out.println(makeDigits2(5));
    }

    public static String makeDigits2(int num) {
        // TODO: 1부터 입력받은 수까지 문자열 리턴
        // 숫자사이 - 구분자
        String result = "";

        int cnt = 1;
        while (cnt <= num) {
            result += cnt;
            if (cnt != num) result += "-";
            cnt++;
        }

        return result;
    }
}
