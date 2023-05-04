import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ComputeSumOfAllElements_01 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> emptyList = Arrays.asList();
        System.out.println(computeSumOfAllElements(list));
        System.out.println(computeSumOfAllElements(emptyList));
    }

    public static int computeSumOfAllElements(List<Integer> list){
        //TODO.. Integer 타입 요소를 가지는 List 합 리턴

        if (list.isEmpty()) return 0;

        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}