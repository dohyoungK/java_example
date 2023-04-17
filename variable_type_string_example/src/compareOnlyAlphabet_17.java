public class compareOnlyAlphabet_17 {
    public static boolean compareOnlyAlphabet(String str1, String str2) {
        // TODO: 입력받은 str1, str2가 대소문자 구분없이 같은지 다른지 판단, 두 문자열을 다 대문자로 바꾸기
        // 문자열 같은지 확인
        boolean result;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        if (str1.compareTo(str2) == 0) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(compareOnlyAlphabet("helLo", "HEllo"));
    }
}
