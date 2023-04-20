public class getAllLetters_06 {
    public static void main(String[] args) {
        System.out.println(getAllLetters("abcdef"));
        System.out.println(getAllLetters(""));
    }

    public static char[] getAllLetters(String str) {
        // TODO: 입력받은 문자열의 각 문자를 배열 요소로 넣기
        char[] result = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }

        return result;
    }
}
