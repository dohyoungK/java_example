import java.util.Arrays;

public class FindLongestLength_09 {
    public static void main(String[] args) {

        String[] strArr = {"codestates", "java", "backend", "programming"};
        String[] emptyArr = {};
        System.out.println(findLongestLength(strArr));
        System.out.println(findLongestLength(emptyArr));
    }

    public static int findLongestLength(String[] strArr) {
        //TODO.. String 요소들 중 가장 긴 요소 길이 리턴

        if (strArr.length == 0) return 0;
        return Arrays.stream(strArr)
                .mapToInt(element -> element.length())
                .max()
                .getAsInt();
    }
}
