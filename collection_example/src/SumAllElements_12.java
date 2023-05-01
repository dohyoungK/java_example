import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SumAllElements_12 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println(sumAllElements(arrayList));
        System.out.println(sumAllElements(emptyList));
    }

    public static int sumAllElements(ArrayList<Integer> arrayList) {
        //TODO.. ArrayList의 모든 요소의 합 리턴

        int result = 0;
        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            result += iterator.next();
        }
        return result;
    }
}
