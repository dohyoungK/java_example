public class makeDigits_05 {
    public static void main(String[] args) {
        System.out.println(makeDigits(5));
    }

    public static String makeDigits(int num) {
        String result = "";
        // TODO: 1부터 입력받은 숫자까지의 문자열 리턴
        for (int i = 1; i <= num; i++)  result += i;

        return result;
    }
}
