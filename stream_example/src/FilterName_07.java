import java.util.*;

public class FilterName_07 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("김코딩", "박해커", "김코딩", "최자바", "김자바");
        System.out.println(Arrays.toString(filterName(names)));
    }

    public static String[] filterName(List<String> names) {
        //TODO.. 김씨 성의 이름을 정렬하고 String 배열로 리턴

        if (names.isEmpty()) return new String[]{"0"};
        if (names.stream().noneMatch(element -> element.startsWith("김"))) return new String[]{"0"};

        return names.stream()
                .distinct()
                .filter(element -> element.startsWith("김"))
                .sorted()
                .toArray(String[]::new);
    }
}
