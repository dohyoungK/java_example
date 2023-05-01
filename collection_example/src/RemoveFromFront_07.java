import java.util.ArrayList;
import java.util.Arrays;

public class RemoveFromFront_07 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println(removeFromFront(arrayList));
        System.out.println(arrayList);
        System.out.println(removeFromFront(emptyList));
    }

    public static Integer removeFromFront(ArrayList<Integer> arrayList) {
        //TODO.. 입력받은 ArrayList의 첫 요소를 삭제하고
        // 삭제된 요소 리턴

        if (arrayList.isEmpty()) return null;
        Integer result = arrayList.get(0);
        arrayList.remove(0);
        return result;
    }
}
