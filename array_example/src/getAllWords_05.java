import java.util.Arrays;

public class getAllWords_05 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAllWords("abc aaa bbb ccc")));
    }

    public static String[] getAllWords(String str) {
        // TODO: 입력받은 문자열의 공백으로 구분된 각 단어를 배열의 요소로 만들기
        String[] result = str.split(" ");

        return result;
    }
}
