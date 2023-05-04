import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoStream_10 {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("김코딩", "박해커");
        List<String> list2 = Arrays.asList("최자바", "이스프링");
        System.out.println(mergeTwoStream(list1, list2));
    }

    public static List<String> mergeTwoStream(List<String> list1, List<String> list2) {
        //TODO.. String 타입 List 2개 입력받아
        // 하나의 List로 합치고 리턴

        return Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
    }
}
