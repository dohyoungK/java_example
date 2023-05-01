import java.util.ArrayList;
import java.util.Arrays;

public class GetNthElement_02 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        ArrayList<Integer> emptyList = new ArrayList<>();

        System.out.println(getNthElement(arrayList, 2));
        System.out.println(getNthElement(emptyList, 0));
        System.out.println(getNthElement(arrayList, 7));
    }

    public static Integer getNthElement(ArrayList<Integer> arrayList, int index) {
        //TODO.. Integer 타입 ArrayList와 인덱스를 입력받아 그 인덱스의 요소 리턴

        if (arrayList.isEmpty()) return null;
        if (index >= arrayList.size()) return null;

        return arrayList.get(index);
    }
}
