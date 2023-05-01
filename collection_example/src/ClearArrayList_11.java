import java.util.ArrayList;
import java.util.Arrays;

public class ClearArrayList_11 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(clearArrayList(arrayList));
        System.out.println(arrayList);
    }

    public static ArrayList<Integer> clearArrayList(ArrayList<Integer> arrayList) {
        //TODO.. 입력받은 ArrayList의 모든 요소 삭제한 후 ArrayList 리턴

        arrayList.clear();
        return arrayList;
    }
}
