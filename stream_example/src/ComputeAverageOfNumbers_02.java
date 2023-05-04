import java.util.*;

public class ComputeAverageOfNumbers_02 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> emptyList = Arrays.asList();
        System.out.println(computeAverageOfNumbers(list));
        System.out.println(computeAverageOfNumbers(emptyList));
    }

    public static double computeAverageOfNumbers(List<Integer> list) {
        //TODO.. List 요소의 평균 구하기

        if (list.isEmpty()) return 0;

        double average = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        return average;
    }
}
