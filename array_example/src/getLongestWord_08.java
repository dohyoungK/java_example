public class getLongestWord_08 {
    public static void main(String[] args) {
        System.out.println(getLongestWord("Teamwork skills will take you anywhere"));
    }

    public static String getLongestWord(String str) {
        // TODO: 문자열의 단어 중 가장 긴 단어 리턴
        String[] array = str.split(" ");
        String result = array[0];

        for (String s : array) {
            if (s.length() > result.length())   result = s;
        }

        return result;
    }
}
