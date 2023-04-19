public class characterAndNumber_14 {
    public static void main(String[] args) {
        System.out.println(characterAndNumber("hello"));
    }

    public static String characterAndNumber(String word) {
        // TODO: 각 문자 뒤 인덱스 붙이기
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            result += word.charAt(i) + Integer.toString(i);
        }

        return result;
    }
}
