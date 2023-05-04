import java.util.*;

public class FilterOddNumbers_03 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(filterOddNumbers(list));
    }

    public static List<Integer> filterOddNumbers(List<Integer> list){
        //TODO.. List에서 짝수만 추출해 새로운 List에 저장하고 리턴

        List<Integer> evenNumbers = new ArrayList<>();
        list.stream()
                .filter(num -> num % 2 == 0)
                .forEach(num -> evenNumbers.add(num));
        return evenNumbers;
    }
}
