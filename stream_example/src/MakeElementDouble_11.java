import java.util.*;

public class MakeElementDouble_11 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> emptyList = Arrays.asList();
        System.out.println(makeElementDouble(list));
        System.out.println(makeElementDouble(emptyList));
    }

    public static List<Integer> makeElementDouble(List<Integer> list) {
        //TODO.. List의 Integer 요소에 2를 곱한 새로운 List 리턴

        if (list.isEmpty()) return list;
        List<Integer> result = new ArrayList<>();
        list.stream()
                .map(element -> element * 2)
                .forEach(element -> result.add(element));

        return result;
    }

}
