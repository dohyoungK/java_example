import java.util.ArrayList;
import java.util.Arrays;

public class AddNth_05 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0, 1, 2, 3));
        System.out.println(addNth(arrayList, 1, 7));
        System.out.println(addNth(arrayList, 7, 7));
    }

    public static ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element) {
        //TODO.. ArrayList와 인덱스, 정수를 입력받아
        // ArrayList의 인덱스 위치에 정수를 추가하고 ArrayList 리턴

        if (index >= arrayList.size()) return null;
        arrayList.add(index, element);
        return arrayList;
    }
}
