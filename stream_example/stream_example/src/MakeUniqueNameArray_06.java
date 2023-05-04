import java.util.*;

public class MakeUniqueNameArray_06 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("김코딩", "박해커", "김코딩", "최자바", "박해커");
        System.out.println(Arrays.toString(makeUniqueNameArray(names)));
    }

    public static String[] makeUniqueNameArray(List<String> names) {
        //TODO.. List 중복 제거하고 정렬한 후 String 배열을 리턴

        return names.stream()
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }
}
