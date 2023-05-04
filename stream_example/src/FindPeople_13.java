import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindPeople_13 {
    public static void main(String[] args) {

        List<String> male = Arrays.asList("김코딩", "최자바", "김코츠");
        List<String> female = Arrays.asList("박해커", "김유클", "김코딩");
        System.out.println(findPeople(male, female, "김"));
        System.out.println(findPeople(male, female, "정"));
    }

    public static List<String> findPeople(List<String> male, List<String> female, String lastName) {
        //TODO.. 입력받은 2개의 List의 요소 중
        // 중복을 제거하고 특정 성을 가진 이름을 정렬하고 List에 저장해 리턴

        List<String> result = Stream.concat(male.stream(), female.stream())
                .collect(Collectors.toList());

        if (result.stream().noneMatch(element -> element.startsWith(lastName))) return new ArrayList<>();
        return result.stream()
                .distinct()
                .filter(element -> element.startsWith(lastName))
                .sorted()
                .collect(Collectors.toList());
    }
}
